Feature: Verifiying Yujj Edit CardPage

  @SaveContact
  Scenario Outline: Verifiying SaveContact Details
    Given user is on Yujj SignIn page
    When user enters "<email>" and "<password>"
    And user click the Remember Me box
    And user click the SignIn button
    And Welcome Yujj Card page is displayed
    And user click on Contact View button
    And user click on SaveContact button

    Examples: 
      | email                     | password   |
      | ashapriyait0201@gmail.com | Abcdefg$12 |

  @EditContact
  Scenario Outline: Verifiying Edit Contact Details
    Given user is on Yujj SignIn page
    When user enters "<email>" and "<password>"
    And user click the Remember Me box
    And user click the SignIn button
    And user click on Contact View button
    And user click on Edit Contact
    And user click on add contact button
    And user should enters "<PhoneType>" and "<Numbers>"
    And user scrollDown for click on Update button
    Then user shold be Verifing Updating SuccessMessage

    Examples: 
      | email                     | password   | PhoneType | Numbers    |
      | ashapriyait0201@gmail.com | Abcdefg$12 | Mobile    | 8667792850 |
      
    
