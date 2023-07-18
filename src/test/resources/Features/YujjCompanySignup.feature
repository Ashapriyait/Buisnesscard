@CompanySignUp
Feature: Verifying Yujj UserRegister SignUp Functionality
@CreateCompanyAccount
  Scenario: Verifying UserRegister functionality for Company SignUp Page
    Given User is on Yujj SignIn page
    When User click the Sign up here
    And User click the Company SignUp radio button
    And User click the SignUp button
    Then User Should Verify after error message should come "Enter all Fields"
    When User click on Back button
    Then User Should Verify after SignIn Page should come "Sign in to your account."
    When User click the Sign up here
    And User click the Company SignUp radio button
    And user Enter only numbers in First name and Last name
    And User click on SignUp button
    Then User Should Verify after Wrong format error message should come Firstname and Lastname "Enter all Fields"
    When User Enter only special characters in First name and Last name
    And User click on SignUp button
    Then User Should Verify after Wrong format error message should come Firstname and Lastname "Enter all Fields"
    When User Enter Valid First name and Valid LastName and Invalid Work Email
    And User click on SignUp button
    Then User Wrong format error message should come for work email field "Enter all Fields"
    When User enters Valid Firstname and Valid Lastname and Valid Email
    And User click on SignUp button
    Then User Wrong format error message should come for work email field "Enter all Fields"
    When User Enters Valid Firstname and Valid Lastname and Valid Email and Valid NewPassword
    And User click on SignUp button
    Then User Should Mandatory error message should come for confirm password field or field should gets highlighted with red color "Enter all Fields"
    When User Enters Valid Firstname and Valid Lastname and Valid Email and Valid NewPassword and Invalid ConfirmPassword
    And user click the Chechbox By signing up, you agreed with terms & condition
    And User click on SignUp button
    Then User Should Verify after InValid Password error message should come "Password did not match or password did not match pattern"
    When User Enters Valid Firstname and Valid Lastname and Valid Email and Valid NewPassword and valid ConfirmPassword
    Then User Should Verify after error message should come "You must agree to terms and condition"
    When User Enters Valid Firstname and Valid Lastname and Valid Email and Valid NewPassword and valid ConfirmPassword
    And User click on SignUp button
    And user click One more pop up should open with Yes and edit button should be there and click on Yes button
    Then User Should Verify Company Signup after Successfully YujjCard Page is displayed "AM R"

  @Smoke
  Scenario: Verifying UserRegister functionality for Company SignUp user Login Page
    Given User is on Yujj SignIn page
    When user enters Company Signup email and Password
    And user click the Remember Me box
    And user click the SignIn button
    Then User Should verify after Company signin success message "AR R"
    And user click on Three Dots
    And user click on SignOut button
    Then User should verify after Signout successfull SignIn Page "Sign in to your account."

	@Asha
 	@Smoke
  Scenario: Verifying UserRegister functionality for Camera Icon
    Given User is on Yujj SignIn page
    When User click the Sign up here
    And User click the Company SignUp radio button
    And user Upload the Picture file
    When User enters Valid NewPassword and Valid Confirm Password
    And user click the Chechbox By signing up, you agreed with terms & condition
    And User click on SignUp button
    And user click One more pop up should open with Yes and edit button should be there and click on Yes button
    
    @CreateCompanyPage
    Scenario: Verifying UserRegister functionality for Camera Icon
    Given User is on Yujj SignIn page
     When User click the Sign up here
    And User click the Company SignUp radio button
    And User Enters ValidFirstname and ValidLastname and ValidEmail and ValidNewPassword and validConfirmPassword
    And User click on SignUp button
    And User click One more pop up should open with Yes and edit button should be there and click on Yes button
    Then User should verify create companypage is displayed "Create Company"
    When User Upload the AddLogo Picture file
    And User enters CompanyName and CompanyWebsite and companyAddress
    And User click on Country button
    And User click on drapdown select countryname Albania button
    And User click on state button
    And User click on dropdown select Statename Berat County
    And User enter ZipCode
    And User click on create button
     
    
    
    
    
    
 