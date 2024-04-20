# Web Automation Project

## Overview

This project is a web automation framework built using Selenium WebDriver and Java. It provides a foundation for automating web applications, allowing for efficient and reliable testing of web functionalities.

## Features

- **Page Object Model (POM)**: The framework follows the Page Object Model design pattern, providing a clear separation of page elements and test logic.
- **TestNG Integration**: TestNG is used as the testing framework, offering features such as parallel execution, data-driven testing, and reporting.
- **Reporting**: Extent Reports is integrated for comprehensive and interactive test reports, making it easy to analyze test results.
- **Cross-Browser Testing**: The framework supports cross-browser testing, allowing tests to be executed on different web browsers such as Chrome, Firefox, and Safari.
- **Configurability**: The framework's configuration is easily customizable, allowing users to specify test data, environment settings, and browser configurations.

## Getting Started

### Prerequisites

- Java Development Kit (JDK) installed
- Maven installed
- WebDriver executables (ChromeDriver, GeckoDriver) available in the system PATH
- IDE (Eclipse, IntelliJ IDEA) with TestNG plugin installed (optional)

### Installation

1. Clone the repository:
    ```bash
       git clone https://github.com/imark0007/WebAutomationProject.git
2. Navigate to the project directory:
    ```bash
       cd WebAutomationProject
4. Run Maven to install dependencies:
    ```bash
       mvn clean install

### Usage
1. Configure the test data, environment settings, and browser configurations in the config.properties file.
2. Write test cases using the Page Object Model pattern in the src/test/java/tests directory.
3. Execute the tests using TestNG or your preferred IDE.

## I personally used IntelliJ IDEA 2023.3.6
   
### Contributing

Contributions to this project are welcome! If you have suggestions for improvements, new features, or bug fixes, please feel free to open an issue or submit a pull request.

