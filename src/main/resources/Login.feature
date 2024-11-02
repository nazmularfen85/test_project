
@Smoke @Regression @Functional
Feature: login functional test
Background:
    Given Open Browser
    And Go to Para Bank applicatio login page
  

  @Positive @TC_BOL12
  Scenario: As a Para Bank user, loging should pass with valid credential 

    When Put Valid User
    And Put Valid Password
    And Click login button 
    Then Check login status should pass and log out button should visibe 

  @Negative @TC_BOL13
  Scenario: As a Para Bank user, loging should fail with invalid credential 

    When Put invalid User
    And Put invalid Password
    And Click login button 
    Then Check login status should fail and error massage contain The username and password could not be verified
  
  @Negative @TC_BOL14
  Scenario: As a Para Bank user, loging should fail with null credential 

    When Put null User
    And Put null Password
    And Click login button 
    Then Check login status should fail and error massage contain Please enter a username and password.
  