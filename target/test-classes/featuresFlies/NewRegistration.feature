Feature: Testing the functionality of New user Registration.

  Background: 
    Given I have launched the application

  Scenario: Verify user is able to register as a New Register.
    When I enter username
    And I enter password
    And I enter confirm password
    And I enter Name
    And I enter adress
    And I enter city
    Then I should land on home page
    Then I should click on login page
