@warning
Feature: Warning Messages, While logging in
  AC2: "Invalid username or password." message should be displayed for invalid credentials

  Background: User is on the login page
    Given the user is on the login page


  Scenario Outline:  User enters invalid username and password
    When the user enters invalid <username> and <password>
    Then the user should see "Invalid username or password." message

    Examples:
      | username   | password |
      | "smanager" | "admin"  |
      | "admin"    | "test"   |
      | "dasda"    | "admin"  |
      | "smanager" | "user"   |


    