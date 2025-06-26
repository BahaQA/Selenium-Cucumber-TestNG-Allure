Feature: Slider feature

  Background:
    Given user is on the homepage
    When user clicks slider menu

  Scenario:
    Then slider bar should be displayed

  Scenario:
    Then current value should be displayed