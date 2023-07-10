@SignInPage
Feature: Verifying Yujj SignIn Functionality
@LoginPage
  Scenario Outline: Verifying SignIn functionality for Valid email and valid password
    Given user is on Yujj SignIn page
    When user enters "<email>" and "<password>"
    And user click the Remember Me box
    And user click the SignIn button
    And Welcome Yujj Card page is displayed
    And user click the three dots
    And user click the Signout
    Then Sign in to your account page is displayed

    Examples: 
      | email                     | password     |
      | ashapriyait0201@gmail.com | Ashamano@123 |

  @PersonalSignUp
  Scenario Outline: Verifying SignUp functionality for Persional SignIn Page
   Given user is on Yujj SignIn page
    When user click the Sign up here
    When user click the Persional SignUp radio button
    And user enters "<First Name>" and "<Last Name>" and "<Work Email>" and "<New Password>" and "<Confirm Password>"
    And user click the By signing up, you agreed with terms & condition
    And user click the SignUp button
    And user click One more pop up should open with Yes and edit button should be there and click on Yes button
    And user click the three dots
    And user click the Signout
    Then Sign in to your account page is displayed

    Examples: 
      | First Name | Last Name | Work Email            | New Password    | Confirm Password |
      | Vanthana   | A         | vanthana567@gmail.com | Ashapriya12pts$ | Ashapriya12pts$  |

  @CompanySignUP
  Scenario Outline: Verifying SignUp functionality for Company SignUp
   Given user is on Yujj SignIn page
    When user click the Sign up here
    And user click the Company SignUp radio button
    And user enters company signup "<First Name>" and "<Last Name>" and "<Work Email>" and "<New Password>" and "<Confirm Password>"
    And user click the By company signing up, you agreed with terms & condition
    And user click the company SignUp button
    And user click One more pop up should open with email Yes and edit button should be there and click on Yes button
    Then Welcome Yujj Card Homepage is displayed

    Examples: 
      | First Name | Last Name | Work Email        | New Password | Confirm Password |
      | Aishu      | V        | lkjjk44@gmail.com | Abcdefg$12   | Abcdefg$12       |

      
 @UserRegisterCameraIcon
  Scenario Outline: Verifying SignUp functionality for user Register of CameraIcon
   Given user is on Yujj SignIn page
   When user click the Sign up here
   And user click on Camera Icon
   And user Upload the file
   
   
   
 
 