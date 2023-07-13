@LogInPage
Feature: Verifying Yujj SignIn Functionality

  @Validemail,validpassword
  Scenario: Verifying SignIn functionality for Valid email and valid password
    Given user is on Yujj SignIn page
    When user enters email and Password
    And user click the Remember Me box
    And user click the SignIn button
    Then User Should verify after signin success message "Asha Priya"

  @InValidemail,validpassword
  Scenario: Verifying SignIn functionality for Invalid email and valid password
    Given user is on Yujj SignIn page
    When user enters Invalid email and Password
    And user click the Remember Me box
    And user click the SignIn button
    Then User should verify after enter invalid date error message "Unable to login. Please try again"

  @Validemail,Invalidpassword
  Scenario: Verifying SignIn functionality for Valid email and Invalid password
    Given user is on Yujj SignIn page
    When user enters valid email and Invalid Password
    And user click the Remember Me box
    And user click the SignIn button
    Then User should verify after enter invalid date error message "Unable to login. Please try again"

  @InValidemail,Invalidpassword
  Scenario: Verifying SignIn functionality for InValid email and Invalid password
    Given user is on Yujj SignIn page
    When user enters Invalid email and Invalid Password
    And user click the Remember Me box
    And user click the SignIn button
    Then User should verify after enter invalid date error message "Unable to login. Please try again"

  @ValidLogin
  Scenario: Verifying SignIn functionality for Valid email and valid password
    Given user is on Yujj SignIn page
    When user enters email and Password
    And user click the Remember Me box
    And user click the SignIn button
    And user click on Three Dots
    And user click on SignOut button
    Then User should verify after Signout successfull SignIn Page "Sign in to your account."
