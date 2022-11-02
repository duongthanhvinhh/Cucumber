#Author
#Date
#Description
#@SmokeFeature
Feature:feature to test login  functionality
#  @smoketest //chỉ là một cái tags, trong file test runner nếu define tags="smoketest" thì nó chỉ run mỗi cái scenario này
  Scenario: Check login is successful with valid credentials

    Given user is on login page

    When user enters username and password
    And clicks on login button
    Then user is navigated to home page

