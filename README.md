# Engineering Parts Tracker

A Java-based command-line application for managing engineering parts, tracking revisions, and maintaining part information.

This project was developed to strengthen my understanding of **Java, Object-Oriented Programming (OOP), data structures, exception handling, and automated testing**, while applying these concepts to engineering and Product Lifecycle Management (PLM) workflows.

The application simulates basic part-management functionality found in enterprise PLM systems.

## Technologies Used

- **Java 21** — Core programming language
- **IntelliJ IDEA** — Integrated development environment
- **JUnit 5** — Unit testing framework
- **Git & GitHub** — Version control
- **HashMap** — In-memory part storage

## Features

### Part Management
- Create engineering parts with a unique part number, description, and material.
- View all stored engineering parts.
- Search for parts using their part numbers.
- Prevent duplicate part numbers.

### Revision Management
- Automatically assign revision `A` to newly created parts.
- Advance part revisions sequentially (A → B → C).
- Require user confirmation before revising.
- Prevent revisions beyond `Z`.

### Input Validation
- Reject blank part numbers, descriptions, and materials during part creation.
- Handle invalid part searches and menu selections.
- Use Java exceptions to prevent invalid operations.

### Automated Testing
- JUnit 5 tests for part creation and revision behavior.
- Tests for invalid constructor arguments.
- Tests for duplicate part prevention and part retrieval.
- **10 automated unit tests** covering core business logic.

## Project Structure

```text
EngineeringPartsTracker/
├── src/
│   ├── Main.java
│   ├── Part.java
│   └── PartManager.java
├── test/
│   ├── PartTest.java
│   └── PartManagerTest.java
├── .gitignore
└── README.md
```

### Class Responsibilities

| Class | Description |
|---|---|
| `Main.java` | Handles user input, console menu, and application flow |
| `Part.java` | Represents an engineering part and manages its properties and revision rules |
| `PartManager.java` | Stores parts using a HashMap and provides part management operations |
| `PartTest.java` | Tests part validation and revision behavior |
| `PartManagerTest.java` | Tests part storage, searching, and duplicate prevention |

## Getting Started

### Prerequisites

- Java Development Kit (JDK) 21
- IntelliJ IDEA
- JUnit 5 (for running automated tests)

### Running the Application

1. Clone the repository:

   ```bash
   git clone https://github.com/YOUR_USERNAME/engineering-parts-tracker.git
   ```

2. Open the project folder in IntelliJ IDEA.

3. Configure the project SDK to **JDK 21** under `File → Project Structure → Project`.

4. Open `src/Main.java`.

5. Click the green Run button next to the `main()` method.

The application will launch in the IntelliJ console.

### Example Console Menu

```text
--------------------
Engineering Parts Tracker
1. Add Part
2. View All Parts
3. Search for Part
4. Revise Part
5. Exit
--------------------
Enter your choice:
```

Users can create parts, search for existing records, display all parts, and update revisions through the interactive menu.

## Running Unit Tests

The project includes JUnit 5 tests located in the `test` directory.

To run the tests:

1. Open the project in IntelliJ IDEA.
2. Ensure JUnit 5 is configured as a project test dependency.
3. Right-click the `test` directory.
4. Select **Run All Tests** (or the equivalent option in your IntelliJ version).

The current test suite contains:

- **6 tests** for `Part`
- **4 tests** for `PartManager`
- **10 tests total**

Because the project currently uses IntelliJ's native build system, a fresh clone may require configuring the JUnit 5 dependency through IntelliJ before running the tests.

## Object-Oriented Design

The application uses several important Java and software engineering concepts:

- **Encapsulation:** Private fields protect part information from unrestricted access.
- **Constructors:** Initialize engineering parts with validated data.
- **Methods:** Provide controlled access to part attributes and revisions.
- **Collections:** HashMap stores parts using unique part numbers.
- **Exception Handling:** Prevents invalid part creation and revision operations.
- **Separation of Concerns:** Distinct classes handle part data, part management, and the user interface.

## Current Limitations

- All parts are stored in memory and disappear when the application closes.
- Revisions are limited to the letters A through Z.
- No database integration is currently implemented.
- No graphical user interface or web-based interface is available.
- Revision management does not include enterprise approval workflows, audit history, or access controls.
- Parts are displayed without a guaranteed sorting order.

## Future Improvements

Planned enhancements include:

- [ ] Integrate a relational SQL database for persistent storage.
- [ ] Implement JDBC database operations.
- [ ] Add more comprehensive automated testing.
- [ ] Convert the project to Maven for dependency management.
- [ ] Develop REST APIs using Spring Boot.
- [ ] Add a web interface for managing engineering parts.
- [ ] Implement engineering change requests and approval workflows.
- [ ] Explore integration concepts used in enterprise PLM systems.

## Project Purpose

This project is part of my ongoing software engineering development, with a focus on **Java backend development and enterprise Product Lifecycle Management (PLM) systems**.

It serves as a foundation for more advanced projects involving relational databases, enterprise application architecture, REST APIs, and engineering data management.

## License

No license has been specified for this project.