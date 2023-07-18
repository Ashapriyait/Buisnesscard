@HomePage
Feature: Verify Yujj HomePage Functionalities 

Scenario: Verify Aligment of home page
Given user is on Yujj SignIn page
When User enter valid Email id and Password 
And User click on Sign In button 
Then User should verify the success message ' Welcome ' 