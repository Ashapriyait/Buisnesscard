package com.stepdefinition;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.WebDriver;

import com.base.BaseClass;
import com.manager.PageObjectManager;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC4_LeadsStep extends BaseClass {
	
	//WebDriver driver;
	PageObjectManager pom3=new PageObjectManager();
	String parent;

	@When("user click on Add Lead")
	public void user_click_on_add_lead() throws InterruptedException {
		Thread.sleep(1000);
		pom3.getLeadsPage().getClickAddLead().click();
	
	}
	@When("user enters {string} and {string} and {string} and {string} and {string} and {string}")
	public void user_enters_and_and_and_and_and(String FirstName, String LastName, String Email, String PhoneNumber, String CompanyName, String Address) {
		pom3.getLeadsPage().getTxtFirstName().sendKeys(FirstName);
		pom3.getLeadsPage().getTxtLastName().sendKeys(LastName);
		pom3.getLeadsPage(). getTxtEmail().sendKeys(Email);
		pom3.getLeadsPage().getTxtPhoneNumber().sendKeys(PhoneNumber);
		pom3.getLeadsPage().getTxtCompanyName().sendKeys(CompanyName);
		pom3.getLeadsPage().getTxtAddress().sendKeys(Address);
	
	}
	@Then("user should after Verifying SuccessMessage is Displayed")
	public void user_should_after_verifying_success_message_is_displayed() throws InterruptedException {
		System.out.println("Verifying Contact Detaile Save Successfully");
		
	
	}



	
	@When("user click on three dots")
	public void user_click_on_three_dots() throws InterruptedException {
		Thread.sleep(8000);
       pom3.getLeadsPage().getClickThreeDots().click();
	}
	@When("user click on Leads Icon")
	public void user_click_on_leads_icon() throws InterruptedException {
		Thread.sleep(1000);
		pom3.getLeadsPage().getClickLeadIcon().click();

	}
	@When("user click on any one Lead")
	public void user_click_on_any_one_lead() throws InterruptedException {
		Thread.sleep(7000);
		pom3.getLeadsPage().getClickCheckBox().click();
	}
	@When("user click on Save to One Drive Logo")
	public void user_click_on_save_to_one_drive_logo() throws InterruptedException {
		Thread.sleep(7000);
       pom3.getLeadsPage().getClickOneDrive().click();
       
	}
	
	@When("user enter microsoft signin {string}")
	public void user_enter_microsoft_signin(String  EmailPhoneorSkype  ) throws InterruptedException {
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 parent = driver.getWindowHandle();
		Set<String> windowHandles = driver.getWindowHandles();
		for (String string : windowHandles) {
			if(!(string.equals(parent))) {
				driver.switchTo().window(string);
			}
			
		}
	  pom3.getLeadsPage().getTxtEmailPhoneorSkype().sendKeys(EmailPhoneorSkype);
	}
	@When("user click on Microsoft Next button")
	public void user_click_on_microsoft_next_button() throws InterruptedException {
		Thread.sleep(2000);
		pom3.getLeadsPage().getClickNext().click();
	
	}
	@When("user enter pts signin {string} and {string}")
	public void user_enter_pts_signin_and(String Username, String Password) {
         
		pom3.getLeadsPage().getTxtUsername().sendKeys(Username);
		pom3.getLeadsPage().getTxtPassword().sendKeys(Password);
		
	
	}
	@When("user click on pts Remember Box")
	public void user_click_on_pts_remember_box() throws InterruptedException {
		Thread.sleep(2000);
		pom3.getLeadsPage().getClickRememberBox().click();
	
	}
	@When("user click on pts Signin")
	public void user_click_on_pts_signin() throws InterruptedException {
		Thread.sleep(2000);
		pom3.getLeadsPage().getClickSignin().click();
	
	}

	@When("user click on Okta Verify SendPush button")
	public void user_click_on_okta_verify_send_push_button() throws InterruptedException {
		Thread.sleep(1000);
        pom3.getLeadsPage().getClickSendPush().click();
	
	}

	@When("user click on Dont show this again CheckBox")
	public void user_click_on_dont_show_this_again_check_box() throws InterruptedException {
		Thread.sleep(11000);
		pom3.getLeadsPage().getDontshowthisagainCheckBox().click();
	}
	@When("user click on Yes button")
	public void user_click_on_yes_button() throws InterruptedException {
		Thread.sleep(5000);
		pom3.getLeadsPage().getClickYes().click();
	}


	@When("user click on Any folder and click on Microsoft Teams Chat Files")
	public void user_click_on_any_folder_and_click_on_microsoft_teams_chat_files() throws InterruptedException {
		Thread.sleep(5000);
		
		driver.switchTo().window(parent);
		pom3.getLeadsPage(). getClickMicrosoftChatFile().click();
		
	}
	@When("user click on Save button")
	public void user_click_on_save_button() throws InterruptedException {
		Thread.sleep(9000);
		 pom3.getLeadsPage().getClickSaveButton().click();
	}
	

	@When("user click on Save to One Outlook Logo")
	public void user_click_on_save_to_one_outlook_logo() throws InterruptedException {
		Thread.sleep(7000);
		 pom3.getLeadsPage().getClickOutlookLogo().click();
	
	}
	

	@When("user click on Save to One Hubspot Logo")
	public void user_click_on_save_to_one_hubspot_logo() throws InterruptedException {
		Thread.sleep(7000);
		pom3.getLeadsPage().getClickHubSpotLogo().click();
	
	}


	@When("user enters Hubspot {string} and {string}")
	public void user_enters_hubspot_and(String Username, String Password) throws InterruptedException {
		Thread.sleep(7000);
		pom3.getLeadsPage().getTxtHubUsername().sendKeys(Username);
		pom3.getLeadsPage().getTxtHubPassword().sendKeys(Password);
		
	}
	@When("user click on Remember me Box")
	public void user_click_on_remember_me_box() throws InterruptedException {
		Thread.sleep(7000);
		pom3.getLeadsPage().getClickHubRememberBox().click();
		
	}
	@When("user click on Login")
	public void user_click_on_login() throws InterruptedException {
		Thread.sleep(9000);
		pom3.getLeadsPage(). getClickLogin().click();
	}

//	@When("user enters {string}")
//	public void user_enters(String EnterCode) throws InterruptedException {
//		Thread.sleep(7000);
//		pom3.getLeadsPage().getTxtCode().sendKeys(EnterCode);
//	}
	

	@When("user click on Hubspot Login")
	public void user_click_on_hubspot_login() throws InterruptedException {
		Thread.sleep(7000);
		pom3.getLeadsPage().getClickHubspotLogin().click();
	
	}
	

	@When("user click on Three Lead")
	public void user_click_on_three_lead() throws InterruptedException {
		Thread.sleep(7000);
		pom3.getLeadsPage().getClickCheckBox().click();
		Thread.sleep(7000);
		pom3.getLeadsPage().getClickSecondCheckBox().click();
		Thread.sleep(7000);
		pom3.getLeadsPage().getClickThreadCheckBox().click();

	
	}














	

	













	  

}
