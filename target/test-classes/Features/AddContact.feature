@CreateContact
Feature: Verifiying the AddContact page of Yujj BusinessCard

  @add
  Scenario Outline: Verifiying the AddContact Page of Yujj by selecting All the Fields
    Given user is on Yujj SignIn page
    When user enters "<email>" and "<password>"
    And user click the Remember Me box
    And user click the SignIn button
    And Welcome Yujj Card page is displayed
    When user click the Notification button
    And user click on Company/AdminProfile button
    And user click on AddContact button
    And user should addcontact select all fields enters "<JobTittle>" and "<Email>" and "<FirstName>" and "<LastName>" and "<PhoneType>" and "<Number>" and "<SocialNetworkType>" and "<URL>" and "<ReportingManager>" and "<AccessRole>"
    And user click on Create button
    Then user Verify after created Contact Added uccessfully message id displayed

    Examples: 
      | email                     | password   | JobTittle  | Email           | FirstName | LastName | PhoneType | Number     | SocialNetworkType | URL          | ReportingManager | AccessRole   |
      | ashapriyait0201@gmail.com | Abcdefg$12 | QA Analyst | ccc23@gmail.com | CCCCC     | R        | Mobile    | 9876543211 | Facebook          | facebook.com | Himself          | ProfileAdmin |

  @Ringcentral
  Scenario Outline: Verifiying the AddContact Page of call on RingCentral
    Given user is on Yujj SignIn page
    When user enters "<email>" and "<password>"
    And user click the Remember Me box
    And user click the SignIn button
    And Welcome Yujj Card page is displayed
    When user click the Notification button
    And user click on Company/AdminProfile button
    And user click on AddContact button
    And user should addcontact select all fields enters "<JobTittle>" and "<Email>" and "<FirstName>" and "<LastName>" and "<PhoneType>" and "<Number>" and "<SocialNetworkType>" and "<URL>" and "<ReportingManager>" and "<AccessRole>"
    And user click on Create button
    And user click on Ringcentral logo
    And user click on any Contact Number

    Examples: 
      | email                     | password   | JobTittle  | Email            | FirstName | LastName | PhoneType | Number     | SocialNetworkType | URL          | ReportingManager | AccessRole   |
      | ashapriyait0201@gmail.com | Abcdefg$12 | QA Analyst | kkk123@gmail.com | KKK       | M        | Mobile    | 7010203254 | Facebook          | facebook.com | Himself          | ProfileAdmin |

  @Call
  Scenario Outline: Verifiying the AddContact Page of call on CallLogo
    Given user is on Yujj SignIn page
    When user enters "<email>" and "<password>"
    And user click the Remember Me box
    And user click the SignIn button
    And Welcome Yujj Card page is displayed
    When user click the Notification button
    And user click on Company/AdminProfile button
    And user click on AddContact button
    And user should addcontact select all fields enters "<JobTittle>" and "<Email>" and "<FirstName>" and "<LastName>" and "<PhoneType>" and "<Number>" and "<SocialNetworkType>" and "<URL>" and "<ReportingManager>" and "<AccessRole>"
    And user click on Create button
    And user click on Call logo
    And user click on Callany Contact Number

    Examples: 
      | email                     | password   | JobTittle  | Email            | FirstName | LastName | PhoneType | Number     | SocialNetworkType | URL          | ReportingManager | AccessRole   |
      | ashapriyait0201@gmail.com | Abcdefg$12 | QA Analyst | vvv123@gmail.com | HHHHHS    | N        | Mobile    | 7010203254 | Facebook          | facebook.com | Himself          | ProfileAdmin |

  @Teams
  Scenario Outline: Verifiying the AddContact Page of call on TeamsLogo
    Given user is on Yujj SignIn page
    When user enters "<email>" and "<password>"
    And user click the Remember Me box
    And user click the SignIn button
    And Welcome Yujj Card page is displayed
    When user click the Notification button
    And user click on Company/AdminProfile button
    And user click on AddContact button
    And user should addcontact select all fields enters "<JobTittle>" and "<Email>" and "<FirstName>" and "<LastName>" and "<PhoneType>" and "<Number>" and "<SocialNetworkType>" and "<URL>" and "<ReportingManager>" and "<AccessRole>"
    And user click on Create button
    And user click on Teams logo

    Examples: 
      | email                     | password   | JobTittle  | Email             | FirstName | LastName | PhoneType | Number     | SocialNetworkType | URL          | ReportingManager | AccessRole   |
      | ashapriyait0201@gmail.com | Abcdefg$12 | QA Analyst | pppp123@gmail.com | PPPP      | M        | Mobile    | 7010203254 | Facebook          | facebook.com | Himself          | ProfileAdmin |
