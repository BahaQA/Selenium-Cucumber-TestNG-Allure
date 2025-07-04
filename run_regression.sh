#!/bin/bash

# Preserve history if it exists
if [ -d allure-report/history ]; then
    cp -r allure-report/history allure-results/
fi

# Run your tests (make sure they output to allure-results at root)
mvn clean test

# (Optional) Copy history again, if needed
if [ -d allure-report/history ]; then
    cp -r allure-report/history allure-results/
fi

# Generate the new report
allure generate allure-results -o allure-report --clean
