Feature: Testing login functionality of the new user credentials

  Background: 
    Given I have launched the FlyAway application

  Scenario: Login created user and password
    When I enter created Email id
    And I enter created password
    Then I should click on login
    
