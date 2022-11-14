@forgotPass
Feature: Forgot Password


  Background: User is on the login page
    Given I am on the login page



  Scenario: User clicks forgot password link
    When I click the forgot password link
    Then I should be on the forgot password page


  Scenario: User change password
    When I click the forgot password link
    And I enter the username
    And I click the request button
    Then I should be on the forgot password request page