Feature: Popup feature

  Background:
    Given user is on the homepage
    When user clicks popup menu

  @smoke
  Scenario:
    Then popup menu should be displayed

    Scenario:
      When user clicks alert popup
      Then alert message should be displayed
