@ForgetPassword
Feature: Verifiying the ForgetPassword page of Yujj BusinessCard

  Scenario Outline: Verifying the Forget Password of Yujj BusinessCard
    Given user is on Yujj SignIn page
    When user should click on Forget Password
    And user should enters "<Email>"
    And user should click on ResetPassword
    Then user should Verifying Password Reset Pin send to email Message is Displayed

    Examples: 
      | Email              |
      | indhu876@gmail.com |

  Scenario Outline: Verifying the Reset Password of Yujj BusinessCard
    Given user is on Yujj SignIn page
    When user enters Valid Resetted Password "<email>" and "<password>"
    And user click the Remember Me box
    And user click the SignIn button
    Then Welcome Yujj Card page is displayed

    Examples: 
      | email                     | password     |
      | ashapriyait0201@gmail.com | Ashamano@123 |
