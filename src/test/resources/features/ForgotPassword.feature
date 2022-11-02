@forgotPass
Feature: Forgot Password


  Background: User is on the login page
    Given I am on the login page



  Scenario: User clicks forgot password link
    When I click the forgot password link
    Then I should be on the forgot password page

