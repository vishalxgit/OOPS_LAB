# Object-Oriented Programming (OOP) Java Laboratory Manual

A comprehensive collection of Object-Oriented Programming lab experiments written in Java. This repository spans foundational concepts—such as classes, encapsulation, inheritance, polymorphism, abstract classes, and packages—up to advanced concepts including circular queue ADTs, wrapper class immutability, multithreading, inter-thread communication, file handling, and full-stack database-backed JavaFX CRUD applications.

---

## Repository Structure

```text
OOP_JAVA__161/
├── .gitignore
├── README.md
├── Ex_1_Telephone_Bill/
│   └── TelephoneBill.java
├── Ex_2_Temperature_Converter/
│   ├── TemperatureMain.java
│   └── temperature/
│       └── Converter.java
├── Ex_3_Vehicle_Inheritance/
│   └── VehicleDemo.java
├── Ex_4_Abstract_Library_Member/
│   └── LibraryDemo.java
├── Ex_5_ADT_Queue_Exception_Handling/
│   └── Main.java
├── Ex_6_Wrapper_Immutable_Demo/
│   └── WrapperImmutableDemo.java
├── Ex_7_Multithreading/
│   └── ArrayThreadDemo.java
├── Ex_8_Inter_Thread_Communication/
│   └── RailwayBooking.java
├── Ex_9_String_Operations_ArrayList/
│   └── StringMenu.java
├── Ex_10_File_Handling_ListFiles/
│   └── File_Handling_ListFiles.java
├── Ex_11_JavaFX_JDBC_CRUD/
│   ├── database_setup.sql
│   ├── StudentManagementApp.java
│   └── lib/
└── EX_12_MINI_PROJECT/
    ├── database_setup.sql
    ├── pom.xml
    ├── resources/
    └── src/
```

---

## Experiments Index

| Exp No. | Topic | Core Concepts | Primary Class / Files |
| :--- | :--- | :--- | :--- |
| [**Ex 1**](#ex1) | [Telephone Bill Calculator](#ex1) | Classes, Objects, Constructors, Tiered Billing Logic | `TelephoneBill.java` |
| [**Ex 2**](#ex2) | [Temperature Converter Utility](#ex2) | Java Packages, Static Utility Methods, Unit Conversion | `Converter.java`, `TemperatureMain.java` |
| [**Ex 3**](#ex3) | [Vehicle Tax & Insurance Hierarchy](#ex3) | Inheritance (`extends`), Method Overriding, Subtyping | `VehicleDemo.java` |
| [**Ex 4**](#ex4) | [Library Membership System](#ex4) | Abstract Classes, Polymorphism, Mandatory Method Contract | `LibraryDemo.java` |
| [**Ex 5**](#ex5) | [Circular Queue ADT with Exception Handling](#ex5) | Interfaces (`implements`), Fixed Array Queue, `try-catch` | `Main.java` |
| [**Ex 6**](#ex6) | [Wrapper Classes & Immutability](#ex6) | Object Identity, Unboxing/Reboxing, `identityHashCode` | `WrapperImmutableDemo.java` |
| [**Ex 7**](#ex7) | [Multithreaded Array Processing](#ex7) | Thread Creation (`extends Thread`), `start()`, `join()` | `ArrayThreadDemo.java` |
| [**Ex 8**](#ex8) | [Inter-Thread Railway Booking System](#ex8) | Synchronized Monitors, `wait()`, `notifyAll()`, Thread States | `RailwayBooking.java` |
| [**Ex 9**](#ex9) | [Interactive String Operations](#ex9) | Dynamic Collections (`ArrayList`), Filtering, Buffer Flushing | `StringMenu.java` |
| [**Ex 10**](#ex10) | [Directory File Listing Utility](#ex10) | Java File API (`java.io.File`), `isDirectory()`, `isFile()` | `File_Handling_ListFiles.java` |
| [**Ex 11**](#ex11) | [Student Management CRUD Application](#ex11) | JavaFX GUI, JDBC Database Connectivity, MySQL CRUD | `StudentManagementApp.java`, `database_setup.sql` |
| [**Ex 12**](#ex12) | [T2Verify Digital Document Verification System](#ex12) | JavaFX Modular MVC, SHA-256 Hashing, JDBC DAO Architecture | `Main.java`, `database_setup.sql` |

---

## Detailed Experiment Specifications

<a id="ex1"></a>
### Experiment 1: Telephone Bill Calculator
- **Directory**: `Ex_1_Telephone_Bill/`
- **Main Class**: `TelephoneBill`
- **Concepts**: Classes, Objects, Instance Variables, Parameterized Constructors, Conditional Rate Calculation.
- **Description**: Calculates telephone billing amounts based on call usage minutes and plan tier (`prepaid` vs `postpaid`). Features multi-tiered tariff calculations for calls below 100 minutes, between 101–200 minutes, and exceeding 200 minutes.
- **Compilation & Execution**:
  ```bash
  cd Ex_1_Telephone_Bill
  javac TelephoneBill.java
  java TelephoneBill
  ```

---

<a id="ex2"></a>
### Experiment 2: Temperature Converter Utility with Packages
- **Directory**: `Ex_2_Temperature_Converter/`
- **Main Class**: `TemperatureMain`
- **Package**: `temperature`
- **Concepts**: User-defined Packages, Package Import, Utility Classes, Static Methods.
- **Description**: Implements a dedicated `temperature` package containing `Converter.java` with static methods for converting between Celsius, Fahrenheit, and Kelvin temperature scales without needing object instantiation.
- **Compilation & Execution**:
  ```bash
  cd Ex_2_Temperature_Converter
  javac temperature/Converter.java TemperatureMain.java
  java TemperatureMain
  ```

---

<a id="ex3"></a>
### Experiment 3: Vehicle Tax & Insurance Hierarchy
- **Directory**: `Ex_3_Vehicle_Inheritance/`
- **Main Class**: `VehicleDemo`
- **Concepts**: Inheritance (`extends`), Method Overriding, Dynamic Method Dispatch, Subtyping.
- **Description**: Models a vehicle classification system with base class `Vehicle` and specialized subclasses `Car` and `Motorcycle`. Each vehicle type overrides tax and insurance calculation algorithms.
- **Compilation & Execution**:
  ```bash
  cd Ex_3_Vehicle_Inheritance
  javac VehicleDemo.java
  java VehicleDemo
  ```

---

<a id="ex4"></a>
### Experiment 4: Library Membership System
- **Directory**: `Ex_4_Abstract_Library_Member/`
- **Main Class**: `LibraryDemo`
- **Concepts**: Abstract Classes (`abstract`), Abstract Methods, Contract Enforcement, Polymorphism.
- **Description**: Implements an abstract `LibraryMember` class defining common attributes and mandatory abstract methods (`calculateFee()`, `getBorrowLimit()`). Subclasses `StudentMember` and `FacultyMember` implement specialized rules.
- **Compilation & Execution**:
  ```bash
  cd Ex_4_Abstract_Library_Member
  javac LibraryDemo.java
  java LibraryDemo
  ```

---

<a id="ex5"></a>
### Experiment 5: Circular Queue ADT with Exception Handling
- **Directory**: `Ex_5_ADT_Queue_Exception_Handling/`
- **Main Class**: `Main`
- **Concepts**: Interfaces (`implements`), Abstract Data Types (ADT), Circular Buffer Array, Custom Exception Handling.
- **Description**: Implements a fixed-capacity Circular Queue ADT conforming to a `QueueADT` interface. Defines custom exception classes `QueueFullException` and `QueueEmptyException` for robust edge case handling.
- **Compilation & Execution**:
  ```bash
  cd Ex_5_ADT_Queue_Exception_Handling
  javac Main.java
  java Main
  ```

---

<a id="ex6"></a>
### Experiment 6: Wrapper Classes & Immutability Demonstration
- **Directory**: `Ex_6_Wrapper_Immutable_Demo/`
- **Main Class**: `WrapperImmutableDemo`
- **Concepts**: Primitive Wrapper Classes, Autoboxing/Unboxing, Immutable Objects, Memory Address Analysis via `System.identityHashCode()`.
- **Description**: Demonstrates wrapper class caching (Integer pool -128 to 127) and immutability behavior of String and Integer objects by comparing hash codes before and after modification operations.
- **Compilation & Execution**:
  ```bash
  cd Ex_6_Wrapper_Immutable_Demo
  javac WrapperImmutableDemo.java
  java WrapperImmutableDemo
  ```

---

<a id="ex7"></a>
### Experiment 7: Multithreaded Array Processing
- **Directory**: `Ex_7_Multithreading/`
- **Main Class**: `ArrayThreadDemo`
- **Concepts**: Multithreading (`extends Thread`), Parallel Task Execution, Thread Lifecycle Management (`start()`, `join()`).
- **Description**: Spawns concurrent threads to process sub-arrays in parallel. Demonstrates thread synchronization and wait-for-completion semantics using `join()`.
- **Compilation & Execution**:
  ```bash
  cd Ex_7_Multithreading
  javac ArrayThreadDemo.java
  java ArrayThreadDemo
  ```

---

<a id="ex8"></a>
### Experiment 8: Inter-Thread Railway Booking System
- **Directory**: `Ex_8_Inter_Thread_Communication/`
- **Main Class**: `RailwayBooking`
- **Concepts**: Inter-Thread Communication, Synchronized Blocks/Methods, Monitor Locks, `wait()`, `notify()`, `notifyAll()`.
- **Description**: Models a concurrent railway ticket reservation system where passenger threads attempt to book available seats while a cancellation thread releases seats, using monitor synchronization.
- **Compilation & Execution**:
  ```bash
  cd Ex_8_Inter_Thread_Communication
  javac RailwayBooking.java
  java RailwayBooking
  ```

---

<a id="ex9"></a>
### Experiment 9: Interactive String Operations using ArrayList
- **Directory**: `Ex_9_String_Operations_ArrayList/`
- **Main Class**: `StringMenu`
- **Concepts**: Dynamic Collections (`java.util.ArrayList`), String Manipulation Methods, Scanner Buffer Management.
- **Description**: Menu-driven application supporting dynamic operations on string collections including append, indexed insertion, exact-match searching, starting-letter filtering (case-insensitive), and full listing.
- **Compilation & Execution**:
  ```bash
  cd Ex_9_String_Operations_ArrayList
  javac StringMenu.java
  java StringMenu
  ```

---

<a id="ex10"></a>
### Experiment 10: Directory File Listing Utility
- **Directory**: `Ex_10_File_Handling_ListFiles/`
- **Main Class**: `File_Handling_ListFiles`
- **Concepts**: File System I/O (`java.io.File`), Path Validation, Directory Filtering (`isDirectory()`, `isFile()`).
- **Description**: Reads a user-specified directory path from console, verifies directory existence, retrieves all child nodes via `listFiles()`, and outputs only regular files while excluding subdirectories.
- **Compilation & Execution**:
  ```bash
  cd Ex_10_File_Handling_ListFiles
  javac File_Handling_ListFiles.java
  java File_Handling_ListFiles
  ```

---

<a id="ex11"></a>
### Experiment 11: JavaFX JDBC Student Management CRUD Application
- **Directory**: `Ex_11_JavaFX_JDBC_CRUD/`
- **Main Class**: `StudentManagementApp`
- **Components**:
  - `StudentManagementApp.java`: Single-file JavaFX GUI & MySQL JDBC CRUD application logic.
  - `database_setup.sql`: SQL database & table initialization script.
  - `lib/`: JavaFX 21 & MySQL Connector JAR dependencies.
- **Compilation & Execution Procedure**:
  1. **Database Setup**: Execute `database_setup.sql` in MySQL.
     ```sql
     CREATE DATABASE IF NOT EXISTS studentdb;
     USE studentdb;
     CREATE TABLE IF NOT EXISTS students (
         id INT AUTO_INCREMENT PRIMARY KEY,
         name VARCHAR(100) NOT NULL,
         age INT NOT NULL,
         course VARCHAR(100) NOT NULL
     );
     ```

  3. **Or Compile & Run Manually**:
     ```powershell
     cd Ex_11_JavaFX_JDBC_CRUD
     javac --module-path lib --add-modules javafx.controls,javafx.fxml -cp "lib/*" StudentManagementApp.java
     java --module-path lib --add-modules javafx.controls,javafx.fxml -cp ".;lib/*" StudentManagementApp Thamizh1.
     ```

---

<a id="ex12"></a>
### Experiment 12 / Mini Project: T2Verify — Secure Digital Document Verification System
- **Directory**: `EX_12_MINI_PROJECT/`
- **Main Class**: `com.t2verify.Main`
- **Architecture**: Model-View-Controller (MVC) with Data Access Object (DAO) Layer.
- **Key Features**:
  - **Authentication**: User Registration & Login with Password Hashing.
  - **Document Registration**: Upload documents, auto-calculate SHA-256 hash, and store record metadata.
  - **Verification Engine**: Upload candidate file to compute cryptographic hash & cross-match with database records.
  - **Audit History**: Log and track verification events with match outcome timestamps.
- **Components**:
  - `src/com/T2Verify/`: Controllers, DAOs, Models, Services, Utilities.
  - `resources/fxml/ & resources/css/`: JavaFX FXML layout views and modern CSS styling.
  - `database_setup.sql`: MySQL database schema (`users`, `documents`, `verifications`).
  - `pom.xml`: Maven build configuration.
- **Execution Procedure**:
  1. **Database Setup**: Execute `database_setup.sql` in MySQL Server.
  2. **Compile & Run (via Maven)**:
     ```bash
     cd EX_12_MINI_PROJECT
     mvn clean javafx:run
     ```

#### Mini Project Application Screenshots & Visual Documentation

> [!NOTE]
> Place screenshot image files inside `EX_12_MINI_PROJECT/docs/screenshots/` (or update image path references below).

| View / Feature | Application Screenshot Placeholder | Description |
| :--- | :---: | :--- |
| **User Login & Authentication** | ![Login Screen](EX_12_MINI_PROJECT/docs/screenshots/login.png) | Authentication screen supporting user sign-in & session creation. |
| **User Registration** | ![Register Screen](EX_12_MINI_PROJECT/docs/screenshots/register.png) | New user sign-up form with input validation and password hashing. |
| **Main Dashboard** | ![Dashboard Screen](EX_12_MINI_PROJECT/docs/screenshots/dashboard.png) | Central navigation hub displaying quick stats and menu actions. |
| **Document Upload & Register** | ![Upload Screen](EX_12_MINI_PROJECT/docs/screenshots/upload.png) | File selection interface generating SHA-256 fingerprint upon upload. |
| **Document Verification Engine** | ![Verify Screen](EX_12_MINI_PROJECT/docs/screenshots/verify.png) | Live cryptographic hash comparison against registered documents. |
| **Verification Audit History** | ![History Screen](EX_12_MINI_PROJECT/docs/screenshots/history.png) | Comprehensive tabular view of past verification attempts & results. |

---

## System Requirements

- **JDK Version**: Java Development Kit (JDK 17 or JDK 21 recommended).
- **Environment**: PowerShell, Bash, or Command Prompt.
- **Database (Ex 11 & 12)**: MySQL Server 8.0+ & MySQL Connector/J JDBC Driver.
- **GUI Framework (Ex 11 & 12)**: OpenJFX / JavaFX SDK 17+.

---

## Verification & Build Quality

All 12 experiments (including the T2Verify JavaFX Mini Project) have been thoroughly verified, compiled, and tested for execution correctness across clean, isolated Java virtual machine environments.

