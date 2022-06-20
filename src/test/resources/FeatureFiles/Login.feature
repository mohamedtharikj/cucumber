Feature: To validate login functionality in facebook

  @smoke @sanity
  Scenario: To validate Login using different credentials
    When User enter username  and password
    And user click the login button
    Then user should be in a invalid credentials page

  @regression
  Scenario: To invalid user and password
    When user enter vinvalid username and password
    And user click the login button
    Then user should be in invalid credential paage
