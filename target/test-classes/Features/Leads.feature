Feature: Verifiying the Leads page of Yujj BusinessCard

  @SaveDriveLogo
  Scenario Outline: Verifying Single lead saving to one drive Details
    Given user is on Yujj SignIn page
    When user enters "<email>" and "<password>"
    And user click the Remember Me box
    And user click the SignIn button
    And user click the Notification button
    And user click on Company/AdminProfile button
    And user click on three dots
    And user click on Leads Icon
    And user click on any one Lead
    And user click on Save to One Drive Logo
    And user enter microsoft signin "<EmailPhoneorSkype>"
    And user click on Microsoft Next button
    And user enter pts signin "<Username>" and "<Password>"
    And user click on pts Remember Box
    And user click on pts Signin
    And user click on Okta Verify SendPush button
    And user click on Dont show this again CheckBox
    And user click on Yes button
    And user click on Any folder and click on Microsoft Teams Chat Files
    And user click on Save button

    Examples: 
      | email                     | password   | EmailPhoneorSkype          | Username            | Password   |
      | ashapriyait0201@gmail.com | Abcdefg$12 | ashapriya@ptscservices.com | ashapriya@pts.local | Suite@595$ |

  @SaveOutLookLogo
  Scenario Outline: Verifying Single lead saving to one drive Details
    Given user is on Yujj SignIn page
    When user enters "<email>" and "<password>"
    And user click the Remember Me box
    And user click the SignIn button
    And user click the Notification button
    And user click on Company/AdminProfile button
    And user click on three dots
    And user click on Leads Icon
    And user click on any one Lead
    And user click on Save to One Outlook Logo
    And user enter microsoft signin "<EmailPhoneorSkype>"
    And user click on Microsoft Next button
    And user enter pts signin "<Username>" and "<Password>"
    And user click on pts Remember Box
    And user click on pts Signin
    And user click on Okta Verify SendPush button
    And user click on Dont show this again CheckBox
    And user click on Yes button

    Examples: 
      | email                     | password   | EmailPhoneorSkype          | Username            | Password   |
      | ashapriyait0201@gmail.com | Abcdefg$12 | ashapriya@ptscservices.com | ashapriya@pts.local | Suite@595$ |

  @SaveHubSpotLogo
  Scenario Outline: Verifying Single lead saving to one drive Details
    Given user is on Yujj SignIn page
    When user enters "<email>" and "<password>"
    And user click the Remember Me box
    And user click the SignIn button
    And user click the Notification button
    And user click on Company/AdminProfile button
    And user click on three dots
    And user click on Leads Icon
    And user click on any one Lead
    And user click on Save to One Hubspot Logo
    And user enters Hubspot "<Username>" and "<Password>"
    And user click on Remember me Box
    And user click on Login

    Examples: 
      | email                     | password   | Username                   | Password   |
      | ashapriyait0201@gmail.com | Abcdefg$12 | ashapriya@ptscservices.com | Suite@595$ |

  @SaveMultipleLeadDriver
  Scenario Outline: Verifying Multiple lead saving to one drive Details
    Given user is on Yujj SignIn page
    When user enters "<email>" and "<password>"
    And user click the Remember Me box
    And user click the SignIn button
    And user click the Notification button
    And user click on Company/AdminProfile button
    And user click on three dots
    And user click on Leads Icon
    And user click on Three Lead
    And user click on Save to One Drive Logo
    And user enter microsoft signin "<EmailPhoneorSkype>"
    And user click on Microsoft Next button
    And user enter pts signin "<Username>" and "<Password>"
    And user click on pts Remember Box
    And user click on pts Signin
    And user click on Okta Verify SendPush button
    And user click on Dont show this again CheckBox
    And user click on Yes button
    And user click on Any folder and click on Microsoft Teams Chat Files
    And user click on Save button
    
    
    

   Examples: 
      | email                     | password   | EmailPhoneorSkype          | Username            | Password   |
      | ashapriyait0201@gmail.com | Abcdefg$12 | ashapriya@ptscservices.com | ashapriya@pts.local | Suite@595$ |

  @SaveMultipleLeadOutLook
  Scenario Outline: Verifying Multiple lead saving to Outlook Details
   Given user is on Yujj SignIn page
    When user enters "<email>" and "<password>"
    And user click the Remember Me box
    And user click the SignIn button
    And user click the Notification button
    And user click on Company/AdminProfile button
    And user click on three dots
    And user click on Leads Icon
    And user click on Three Lead
    And user click on Save to One Outlook Logo
    And user enter microsoft signin "<EmailPhoneorSkype>"
    And user click on Microsoft Next button
    And user enter pts signin "<Username>" and "<Password>"
    And user click on pts Remember Box
    And user click on pts Signin
    And user click on Okta Verify SendPush button
    And user click on Dont show this again CheckBox
    And user click on Yes button

    Examples: 
      | email                     | password   | EmailPhoneorSkype          | Username            | Password   |
      | ashapriyait0201@gmail.com | Abcdefg$12 | ashapriya@ptscservices.com | ashapriya@pts.local | Suite@595$ |
  
  @SaveMultipleHubSpotLogo
  Scenario Outline: Verifying Multiple lead saving to Hupspot Details
    Given user is on Yujj SignIn page
    When user enters "<email>" and "<password>"
    And user click the Remember Me box
    And user click the SignIn button
    And user click the Notification button
    And user click on Company/AdminProfile button
    And user click on three dots
    And user click on Leads Icon
    And user click on Three Lead
    And user click on Save to One Hubspot Logo
    And user enters Hubspot "<Username>" and "<Password>"
    And user click on Remember me Box
    And user click on Login

    Examples: 
      | email                     | password   | Username                   | Password   |
      | ashapriyait0201@gmail.com | Abcdefg$12 | ashapriya@ptscservices.com | Suite@595$ |
  