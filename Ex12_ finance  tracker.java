package finance.service;

import finance.exception.InsufficientBalanceException;
import finance.exception.InvalidAmountException;
import finance.model.*;
import finance.storage.Persistable;

import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.YearMonth;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class FinanceManager {
    private static FinanceManager instance;

    private List<Transaction> transactions = new ArrayList<>();
    private List<Budget> budgets = new ArrayList<>();
    private List<Account> accounts = new ArrayList<>();
    private final Persistable storage;

   

 private FinanceManager(Persistable storage) {
        this.storage = storage;
        accounts.add(new SavingsAccount("Savings"));
        accounts.add(new CheckingAccount("Checking"));
    }

    public static synchronized FinanceManager getInstance(Persistable storage) {
        if (instance == null) {
            instance = new FinanceManager(storage);
        }
        return instance;
    }

    public void loadData() throws IOException, ClassNotFoundException {
        FinanceData savedData = storage.load();

        if (savedData != null) {
            transactions = savedData.getTransactions();
            budgets = savedData.getBudgets();
            accounts = savedData.getAccounts();
        }
    }

    public void saveData() throws IOException {
        storage.save(new FinanceData(transactions, budgets, accounts));
    }

   
 public String addTransaction(Transaction transaction)
            throws InvalidAmountException, InsufficientBalanceException {

        Account account = findAccount(transaction.getAccountName())
                .orElseThrow(() -> new IllegalArgumentException(
                        "Account not found: " + transaction.getAccountName()));

        if (transaction.getType() == TransactionType.INCOME) {
            account.deposit(transaction.getAmount());
        } else {
            account.withdraw(transaction.getAmount());
        }

        transactions.add(transaction);

        if (transaction.getType() == TransactionType.EXPENSE) {
            return getBudgetWarning(transaction.getCategory(), transaction.getDate());
        }

        return "Income recorded successfully.";
    }

    public void setBudget(String category, BigDecimal limit)
            throws InvalidAmountException {

        Optional<Budget> existingBudget = budgets.stream()
                .filter(budget -> budget.getCategory()
                    
    .equalsIgnoreCase(category))
                .findFirst();

        if (existingBudget.isPresent()) {
            existingBudget.get().setMonthlyLimit(limit);
        } else {
            budgets.add(new Budget(category, limit));
        }
    }

    public BigDecimal getTotalIncome() {
        return getTotalByType(TransactionType.INCOME);
    }

    public BigDecimal getTotalExpenses() {
        return getTotalByType(TransactionType.EXPENSE);
    }

    public BigDecimal getCurrentBalance() {
        return getTotalIncome()
                .subtract(getTotalExpenses())
                .setScale(2, RoundingMode.HALF_UP);
    }

    private BigDecimal getTotalByType(TransactionType type) {
        return transactions.stream()
                .filter(transaction -> transaction.getType() == type)
                .map(Transaction::getAmount)
          

      .reduce(BigDecimal.ZERO, BigDecimal::add)
                .setScale(2, RoundingMode.HALF_UP);
    }

    public BigDecimal getCategorySpending(String category, YearMonth month) {
        return transactions.stream()
                .filter(transaction -> transaction.getType() == TransactionType.EXPENSE)
                .filter(transaction -> transaction.getCategory()
                        .equalsIgnoreCase(category))
                .filter(transaction -> YearMonth.from(transaction.getDate())
                        .equals(month))
                .map(Transaction::getAmount)
                .reduce(BigDecimal.ZERO, BigDecimal::add)
                .setScale(2, RoundingMode.HALF_UP);
    }

    private String getBudgetWarning(String category,
                                    java.time.LocalDate date) {

        Optional<Budget> budget = budgets.stream()
                .filter(item -> item.getCategory()
                        .equalsIgnoreCase(category))
                .findFirst();

        if (!budget.isPresent()) {
            return "Expense recorded successfully.";
        }

  

      YearMonth month = YearMonth.from(date);
        BigDecimal spent = getCategorySpending(category, month);

        if (budget.get().isExceeded(spent)) {
            return "WARNING: " + budget.get().getStatus(spent, month);
        }

        return "Expense recorded. "
                + budget.get().getStatus(spent, month);
    }

    private Optional<Account> findAccount(String accountName) {
        return accounts.stream()
                .filter(account -> account.getAccountName()
                        .equalsIgnoreCase(accountName))
                .findFirst();
    }
}
