@rememberme
Feature: 5- If "Remember me on this computer" checkbox is clicked,
  User can see his/her credentials already entered in the login page in their next attempt.

  Background: User should be on login page.
    Given I am on the login page

    Scenario: 1- User should be able to see his/her credentials already entered in the login page in their next attempt.
        When I enter "user1" and "UserUser123"
        And I click on Remember me on this computer checkbox
        And I click on Login button
        And I logout from the application
        Then I should see "user1"

