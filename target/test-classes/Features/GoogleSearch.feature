Feature: feature to test google search functionality
  Scenario: Validate google search is working
    Given browser is open
    And user is on google search page
    When user enters texts in search box
    And hits Enter
    Then user is navigated to search results