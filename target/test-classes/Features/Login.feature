@LogInPage
Feature: Verifying Yujj SignIn Functionality

  @Regression
  Scenario: Verifying SignIn functionality for Valid email and valid password
    Given user is on Yujj SignIn page
    When user enters email and Password
    And user click the Remember Me box
    And user click the SignIn button
    Then User Should verify after signin success message "Asha Priya"
    When user enters Invalid email and Password
    And user click the Remember Me box
    And user click the SignIn button
    Then User should verify after enter invalid date error message "Unable to login. Please try again"
    When user enters valid email and Invalid Password
    And user click the Remember Me box
    And user click the SignIn button
    Then User should verify after enter invalid date error message "Unable to login. Please try again"
    When user enters Invalid email and Invalid Password
    And user click the Remember Me box
    And user click the SignIn button
    Then User should verify after enter invalid date error message "Unable to login. Please try again"
    When user enters Invalid email and Invalid Password
    And user click the SignIn button
    Then user Verify after should error message is displayed "Unable to login. Please try again"
    When user enters email and Password
    And user click the Remember Me box
    And user click the SignIn button
    And user click on Three Dots
    And user click on SignOut button
    Then User should verify after Signout successfull SignIn Page "Sign in to your account."
    When user enters email and Password
    And user click on Eye Icon

@Smoke
Scenario: Verifying SignIn functionality for Valid email and valid password
    Given user is on Yujj SignIn page
    When user enters email and password
    And user click the Remember Me box
    And user click the SignIn button
    And Welcome Yujj Card page is displayed
    And user click the three dots
    And user click the Signout
    Then User should verify after Signout successfull SignIn Page "Sign in to your account."

   
  @Smoke
  Scenario: Verifying SignIn functionality for Eye icon
    Given user is on Yujj SignIn page
    When user should click on Forget Password
    And user should enters Email
    And user should click on ResetPassword
    Then user should Verifying Message is Displayed "Password Reset Link Sent To Email"
