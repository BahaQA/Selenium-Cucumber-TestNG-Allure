# Selenium-Cucumber-TestNG-Allure Automation Framework

This project is a test automation framework integrating **Selenium WebDriver**, **Cucumber (BDD)**, **TestNG**, and **Allure** for advanced reporting. It supports running different test suites (such as smoke and regression) via dedicated shell scripts.

---

## Features

- BDD-style test scenarios with Cucumber
- Selenium WebDriver for browser automation
- TestNG for assertions and test management
- Allure for interactive, historical test reports
- Easy execution of tagged test suites via scripts

---

## Prerequisites

- Java JDK 17 or higher
- Maven
- Allure CLI installed and available in your system PATH  
  (via [npm](https://www.npmjs.com/package/allure-commandline) or [official release](https://github.com/allure-framework/allure2/releases))
- Chrome/Edge/Firefox browser
- IntelliJ IDEA (recommended)

---

## How to Run Tests
Use the provided .sh scripts to run tests, as they automatically preserve Allure history so that each test report shows the previous reports, which helps you track trends, identify flaky tests, and monitor test stability over time.


### 1. Smoke Tests

To run smoke tests and generate an Allure report (with history/trends):

<pre> bash run_smoke.sh </pre>



### 2. Regression Tests

To run regression tests and generate an Allure report:

<pre> bash run_regression.sh </pre>

**Each script:**
- Preserves Allure history for trend analysis
- Runs only the tests tagged for that suite
- Generates a new Allure report in the `allure-report` folder

---

## Viewing the Allure Report

After running a script, open the report in your browser:
<pre> allure open allure-report </pre>




---

## Allure History & Trends

- The scripts automatically copy the previous run’s history to maintain trend data and flaky test detection.
- Run the same script multiple times to see trends and history in the Allure dashboard.

---

## Project Structure
├── allure-results/
|── allure-report/
├── src/
│ └── test/
| └── java/
│     └── hooks/
│     └── runners/
|     └── steps/
|     └── utilities/
│ └── resources/
│     └── features/
├── run_smoke.sh
├── run_regression.sh
├── testng.xml
├── pom.xml


---

## Dependencies

Key dependencies (see `pom.xml` for full list):

- `org.seleniumhq.selenium:selenium-java`
- `io.cucumber:cucumber-java`
- `io.cucumber:cucumber-testng`
- `org.testng:testng`
- `io.qameta.allure:allure-cucumber7-jvm`
- `io.qameta.allure:allure-testng`

---



