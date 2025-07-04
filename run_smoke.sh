#!/bin/bash
if [ -d allure-report/history ]; then
    cp -r allure-report/history allure-results/
fi
mvn clean test -Dcucumber.filter.tags="@smoke"
allure generate allure-results -o allure-report --clean
