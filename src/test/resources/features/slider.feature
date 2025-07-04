Feature: Slider feature

  Background:
    Given user is on the homepage
    When user clicks slider menu

  @smoke
  Scenario:
    Then slider bar should be displayed

  Scenario:
    Then current value should be displayed