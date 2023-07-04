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
    And user click on add contact button
    And user should enters "<PhoneType>" and "<Numbers>" and "<FirstName>" and "<LastName>"
    And user click on Update button
    Then user shold be Verifing Updating SuccessMessage

    Examples: 
      | email                     | password   | PhoneType | Numbers    | FirstName | LastName |
      | ashapriyait0201@gmail.com | Abcdefg$12 | Mobile    | 8667792850 | Joyi      | Vaish    |
