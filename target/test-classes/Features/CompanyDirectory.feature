@CompanyDirectory
Feature: Verifiying the Company Directory page of Yujj BusinessCard

  @CallRingCentralLogo
  Scenario Outline: Verifiying the Company Directory Page of Ringcentral Logo
    Given user is on Yujj SignIn page
    When user enters "<email>" and "<password>"
    And user click the Remember Me box
    And user click the SignIn button
    And user click on Company Directory button
    And user click on Ringcentral Logo
    And user click on Any Number

    Examples: 
      | email                     | password     |
      | ashapriyait0201@gmail.com | Ashamano@123 |

  @CallTeamsLogo
  Scenario Outline: Verifiying the Company Directory Page of Teams Logo
    Given user is on Yujj SignIn page
    When user enters "<email>" and "<password>"
    And user click the Remember Me box
    And user click the SignIn button
    And user click on Company Directory button
    And user click on Teams Logo

    Examples: 
      | email                     | password     |
      | ashapriyait0201@gmail.com | Ashamano@123 |
      
  @CallLogo 
   Scenario Outline: Verifiying the Company Directory Page of Call Logo
    Given user is on Yujj SignIn page
    When user enters "<email>" and "<password>"
    And user click the Remember Me box
    And user click the SignIn button
    And user click on Company Directory button
    And user click on Call Logo
    And user click on Any Number

    Examples: 
      | email                     | password     |
      | ashapriyait0201@gmail.com | Ashamano@123 |    
   
