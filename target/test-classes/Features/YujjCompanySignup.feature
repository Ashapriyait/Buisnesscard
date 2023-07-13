@CompanySignUp
Feature: Verifying Yujj UserRegister SignUp Functionality

  Scenario: Verifying UserRegister functionality for Company SignUp Page 
    Given user is on Yujj SignIn page
    When user click the Sign up here
    And user click the Company SignUp radio button
    And user click the SignUp button
    Then User Should Verify after error message should come "Enter all Fields"
    
     Scenario: Verifying UserRegister functionality for Company SignUp Page
    Given user is on Yujj SignIn page
    When user click the Sign up here
    When user click the Company SignUp radio button
    And user enters Company First Name and Last Name and Work Email and New Password and Confirm Password
    And user click the SignUp button
    Then User Should Verify after error message should come "You must agree to terms and condition"

  Scenario: Verifying UserRegister functionality for Company SignUp Page
    Given user is on Yujj SignIn page
    When user click the Sign up here
    When user click the Company SignUp radio button
    And user enters Company First Name and Last Name and Work Email and Valid New Password and InValid Confirm Password
    And user click the Chechbox By signing up, you agreed with terms & condition
    And user click the SignUp button
    Then User Should Verify after InValid Password error message should come "Password did not match or password did not match pattern"

  Scenario: Verifying SignUp functionality for Company SignIn Page
    Given user is on Yujj SignIn page
    When user click the Sign up here
    When user click the Company SignUp radio button
    And user enters Company FirstName and Last Name and Work Email and New Password and Confirm Password
    And user click the Chechbox By signing up, you agreed with terms & condition
    And user click the SignUp button
    And user click One more pop up should open with Yes and edit button should be there and click on Yes button
    Then User Should Verify after YujjCard Page is displayed "AM M"
    