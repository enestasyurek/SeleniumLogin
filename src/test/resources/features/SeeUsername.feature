@SeeUsername
Feature: User can see her/his username


  Scenario Outline: User can see her/his username
    Given I am on the login page
    When I enter "<username>" and "<password>" into the username field
    Then I should see "<username>"

    Examples:
      | username        | password    |
      | user1           | UserUser123 |
      | salesmanager101 | user1       |
      | storemanager51  | user1       |