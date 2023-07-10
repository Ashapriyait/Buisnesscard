@SystemPreference
Feature: Verifiying the System Preferences page of Yujj BusinessCard

  @Update
  Scenario Outline: Verifying SystemPreferences of Update Details
    Given user is on Yujj SignIn page
    When user enters "<email>" and "<password>"
    And user click the Remember Me box
    And user click the SignIn button
    And user click the Notification button
    And user click on Company/AdminProfile button
    And user click on systemPreferences logo
    And user editwebsit enters "<CompanyName>" and "<CompanyWebsite>" and "<address>" and "<Country>" and "<State>" and "<City>" and "<Zipcode>"
    And user click on Update Details
    Then User should verify after success message "CompanyUpdatedSuccessfully"

    Examples: 
      | email                     | password     | CompanyName | CompanyWebsite | address | Country | State    | City      | Zipcode |
      | ashapriyait0201@gmail.com | Ashamano@123 | TCS         | tcs.com        | CXCCC   | Albania | AinDefla | Birkhadem |  657778 |

  @Delete
  Scenario Outline: Verifying SystemPreferences of Delete Details
    Given user is on Yujj SignIn page
    When user enters "<email>" and "<password>"
    And user click the Remember Me box
    And user click the SignIn button
    And user click the Notification button
    And user click on Company/AdminProfile button
    And user click on systemPreferences logo
    And user click on Delete MyAccount
    And user enters "<PleasetypeDeletetoconfirm>"
    And user click on Delete button

    Examples: 
      | email          | password   | PleasetypeDeletetoconfirm |
      | abcd@gmail.com | Suite@595$ | Delete                    |

  @ChangePassword
  Scenario Outline: Verifying SystemPreferences of ChangePassword Details
    Given user is on Yujj SignIn page
    When user enters "<email>" and "<password>"
    And user click the Remember Me box
    And user click the SignIn button
    And user click the Notification button
    And user click on systemPreferences logo
    And user enters "<CurrentPassword>" and "<NewPassword>" and "<ConfirmPassword>"
    And user click on ChangePassword
    Then user should after Verifying PasswordUpdate Success Message

    Examples: 
      | email              | password   | CurrentPassword | NewPassword | ConfirmPassword |
      | rusty876@gmail.com | Suite@595$ | Suite@595$      | Asha@123    | Asha@123        |
