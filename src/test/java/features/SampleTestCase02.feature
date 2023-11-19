Feature: SampleTestCase02

  @Testcase02
  Scenario: Testcase02
    Given User is on the login page
    When User logs in with valid credentials
    And User should be logged in
    And User click on Menu
    And User click on Logout
    Then User should be logged out