Feature: SampleTestCase04

  @Testcase04
  Scenario: Testcase04
    Given User is on the login page
    When User logs in with valid credentials
    And User click on Menu
    And User click on "Logout"
    Then User should be logged out