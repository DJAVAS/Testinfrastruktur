Feature: SampleTestCase03

  @Testcase03
  Scenario: Testcase03
    Given User is on the login page
    When User logs in with valid credentials
    Then The item Sauce Labs Backpack is Displayed