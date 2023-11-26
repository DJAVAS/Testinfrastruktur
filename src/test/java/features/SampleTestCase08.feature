Feature: SampleTestCase08

  @Testcase08
  Scenario: Testcase08
    Given User is on the login page
    When User logs in with valid credentials
    Then The item "Sauce Labs Bike Light" is Displayed