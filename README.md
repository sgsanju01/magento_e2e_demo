# magento_e2e_demo
## Magento E2E Automation Project

This project automates the login and signup functionalities of the Magento demo site using Cucumber, Selenium, and Java.

### Technologies Used

* **Java 17:** Programming language.
* **Selenium WebDriver:** Browser automation.
* **Cucumber:** BDD framework.
* **TestNG:** Test runner.
* **WebDriverManager:** Browser driver management.
* **Log4j:** Logging framework.
* **Maven:** Build automation.
* **ThreadLocal:** Thread-safe WebDriver management.
* **Properties Files:** Configuration management.

magento-automation/
├── src/
│   ├── main/
│   │   └── java/
│   │       └── ... (Your application code, if any)
│   └── test/
│       ├── java/
│       │   ├── hooks/
│       │   │   └── Hooks.java
│       │   ├── stepDefinitions/
│       │   │   └── SignupSteps.java
│       │   └── utilities/
│       │       └── TestBase.java
│       └── resources/
│           ├── features/
│           │   └── signup.feature
│           └── config.properties
├── pom.xml
├── testng.xml
└── README.md

