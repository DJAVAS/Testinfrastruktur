Feature: SampleTestCase07

  @Testcase07
  Scenario: Testcase07
    Given User is on the login page
    When User logs in with valid credentials
    Then The item "Sauce Labs Backpack" is Displayed