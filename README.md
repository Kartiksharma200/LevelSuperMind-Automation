Level Supermind Mobile Automation Testing
Overview
This repository contains an automation framework built to test the Level Supermind mobile app using Appium, Selenium, and TestNG. The focus is on validating the core functionality of the Login and Sign-Up processes to ensure the app’s authentication works as expected.

Features:
Appium-Selenium-TestNG Framework: Leverages Appium for mobile automation, Selenium for element interaction, and TestNG for test execution and reporting.
Page Object Model (POM): Follows the Page Object Model design pattern to structure the tests in a clean and maintainable way.
Login Functionality Testing: Automates positive and negative scenarios for the login screen, including valid/invalid email, password inputs, and successful/failed login attempts.
Sign-Up Functionality Testing: Validates the sign-up process by testing valid/invalid input fields, checking for error messages, and verifying successful account creation.
Mobile App Testing: Supports both Android and iOS platforms using Appium.
Technologies Used:
Appium for mobile automation.
Selenium for element interaction.
TestNG for running and reporting the tests.
Maven for dependency management.
Java as the programming language.
Page Object Model (POM) for organizing test scripts.
Setup & Installation:
Clone the Repository:

bash
Copy
git clone https://github.com/yourusername/level-supermind-automation.git
Install Dependencies: Ensure you have Java 8+ installed and Maven configured. Then, install the dependencies with:

bash
Copy
mvn clean install
Appium Setup: Make sure you have Appium installed on your local machine or CI server:

Install Appium: npm install -g appium
Install Appium Doctor for environment verification: npm install -g appium-doctor
Ensure your Android SDK or Xcode (for iOS) is properly set up.
Configure Appium Capabilities: Set the desired capabilities for Android/iOS in config.properties or directly in your test code to match your device/emulator and app setup.

How to Run Tests:
Run a Test: To run the tests with TestNG, execute the following command:

bash
Copy
mvn test
Run Specific Test Suite: You can also run specific test suites using TestNG's testng.xml file.

bash
Copy
mvn test -DsuiteXmlFile=testng.xml
Test Coverage:
Login Tests:
Valid login (correct username/password).
Invalid login (incorrect username/password).
Email format validation (invalid email format).
Sign-Up Tests:
Valid sign-up (all fields filled correctly).
Invalid sign-up (password mismatch, invalid email).
Terms and conditions checkbox validation.
Error message verification for incomplete or incorrect form entries.
Folder Structure:
bash
Copy
Level-Supermind-Automation/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   ├── com/
│   │   │   │   ├── levelsupermind/
│   │   │   │   │   ├── pages/             # Page Object Models
│   │   │   │   │   ├── tests/             # Test cases for login and sign-up
│   │   │   │   │   └── utils/             # Utility classes for setup and helpers
│   ├── test/
│   │   └── java/
│   │       └── com/
│   │           └── levelsupermind/
│   │               ├── tests/             # Test cases
│   │               └── runners/           # TestNG suite files
├── resources/
│   ├── testng.xml                        # TestNG suite file
├── pom.xml                               # Maven configuration and dependencies
└── README.md                             # Project documentation
Contribution:
Feel free to fork this repository, create a branch, and submit a pull request with your improvements or bug fixes.

Issues:
For any bug reports or feature requests, please use the GitHub issues section.

License:
This project is licensed under the MIT License - see the LICENSE file for details.
