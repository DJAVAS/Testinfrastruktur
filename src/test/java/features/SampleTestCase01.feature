Feature: SampleTestCase01

  @Testcase01
  Scenario: Testcase01
    Given User is on the login page
    When User logs in with valid credentials
    And User click on Sort
    And User click on Name Z to A
    Then The selected sort is applied


