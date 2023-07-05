Feature: Verifiying Yujj Edit CardPage

  @EditContact
  Scenario Outline: Verifiying Edit Contact Details
    Given user is on Yujj SignIn page
    When user enters "<email>" and "<password>"
    And user click the Remember Me box
    And user click the SignIn button
    When user click the Notification button
    And user click on Company/AdminProfile button
    And user click on View button
    And user click on Edit Contact
    And user should enters "<FirstName>" and "<LastName>" and "<add>" and "<PhoneType>" and "<Numbers>" and "<addNetwork>" and "<SocialNetworkType>" and "<URL>" and "<AccessRole>"
    And user click on Update button
    Then user shold be Verifing Updating SuccessMessage

    Examples: 
      | email                     | password   | PhoneType | Numbers    | FirstName | LastName | SocialNetworkType | URL                        | AccessRole    |
      | ashapriyait0201@gmail.com | Abcdefg$12 | Mobile    | 8667792850 | Julee     | V        | Instagram         | https://www.Instagram.com/ | ProfileViewer |
