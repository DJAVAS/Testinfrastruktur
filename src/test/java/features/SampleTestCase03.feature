Feature: SampleTestCase03

  @Testcase03
  Scenario: Testcase03
    Given User is on the login page
    When User logs in with valid credentials
    And User click on Sort
    And User click on "Name (Z to A)"
    Then The selected sort is applied