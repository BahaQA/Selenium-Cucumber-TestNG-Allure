Feature: Form fields

  Background:
    Given user is on the homepage
    When user clicks form fields menu

  Scenario:
    Then name field should be displayed

  Scenario:
    Then password field should be displayed

  Scenario:
    Then email field should be displayed