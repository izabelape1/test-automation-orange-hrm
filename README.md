# OrangeHRM Selenium Automated Tests

Welcome to the automated test suite for the OrangeHRM demo application. This project is part of my Selenium and TestNG testing course and includes tests for key functionalities such as user information modification, work experience management, and membership handling.

## Installation Instructions

1. **Install Java Development Kit (JDK) 11 or later**: Ensure it's properly configured on your machine.
2. **Install Apache Maven**: Download it from [Apache Maven](https://maven.apache.org/) and follow the installation instructions.
3. **Clone the Repository**:
    - Use your preferred Git client or download the repository directly from your Git service (e.g., GitHub, GitLab).
4. **Open the Project in IntelliJ IDEA**:
    - Start IntelliJ IDEA and open the cloned project.
5. **Import Maven Project**:
    - IntelliJ should automatically detect the `pom.xml` file and ask you to import the Maven project. If not, right-click on the `pom.xml` file and select **Add as Maven Project**.

## Technologies

The tests are written in Java and utilize the following technologies:

- **Selenium WebDriver**: For browser automation.
- **TestNG**: As the testing framework.
- **Maven**: For project build and dependency management.

## Running the Tests

To execute the tests:

1. **Open the Maven Tool Window** in IntelliJ IDEA.
2. **Run Maven Goals**:
    - In the Maven tool window, find the **Lifecycle** section.
    - Click on **clean** and then **install** to build the project.
    - Click on **test** to run all tests.

## Test Details

### Modify User Information
- **Description**: Tests updating user profile information.

### Add Work Experience
- **Description**: Tests adding work experience to user profiles.

### Manage Memberships
- **Description**: Tests adding and managing user memberships.

## Test Assertions

The test suite includes assertions to verify:

- Correct responses from the application.
- Presence of added or updated information within the application.
- Functional correctness of UI components and interactions.

