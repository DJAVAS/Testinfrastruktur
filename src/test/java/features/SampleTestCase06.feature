Feature: SampleTestCase06

  @Testcase06
  Scenario: Testcase06
    Given User is on the login page
    When User logs in with valid credentials
    And User should be logged in
    And User click on Menu
    And User click on "Logout"
    Then User should be logged out
