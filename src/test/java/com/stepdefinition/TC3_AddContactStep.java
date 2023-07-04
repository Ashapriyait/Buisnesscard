package com.stepdefinition;

import org.openqa.selenium.WebDriver;

import com.base.BaseClass;
import com.manager.PageObjectManager;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC3_AddContactStep extends BaseClass{
	WebDriver driver;
	PageObjectManager pom1=new PageObjectManager();
	
	
	@When("user click the Notification button")
     public void user_click_the_notification_button() throws InterruptedException {
		Thread.sleep(8000);
		//driver.findElement(By.xpath("//i[@id=\"togglesidebaricon\"]")).click();
	   pom1.getAddContactPage().getClickNotification().click();
    }
    @When("user click on Company\\/AdminProfile button")
	public void user_click_on_company_admin_profile_button() throws InterruptedException {
		Thread.sleep(2000);
		pom1.getAddContactPage().getClickCompanyAdminProfile().click();
	}
	@When("user click on AddContact button")
	public void user_click_on_add_contact_button() throws InterruptedException {
		Thread.sleep(2000);
        pom1.getAddContactPage().getClickAddContact().click();
	}
	@Then("user should addcontact select all fields enters {string} and {string} and {string} and {string} and {string} and {string} and {string} and {string} and {string} and {string}")
	public void user_should_addcontact_select_all_fields_enters_and_and_and_and_and_and_and_and_and(String JobTittle, String Email, String FirstName, String LastName, String PhoneType, String Number, String SocialNetworkType, String URL, String ReportingManager, String AccessRole) throws InterruptedException {
		Thread.sleep(3000);
		pom1.getAddContactPage().getTxtJobTittle().sendKeys(JobTittle);
		pom1.getAddContactPage().getTxtEmailAddress().sendKeys(Email);
		pom1.getAddContactPage().getTxtFirstName().sendKeys(FirstName);
		pom1.getAddContactPage().getTxtLastName().sendKeys(LastName);
		pom1.getAddContactPage().getClickPhoneType().click();
		pom1.getAddContactPage().getClickMobile().click();
		pom1.getAddContactPage().getTxtPhnNo().sendKeys(Number);
		pom1.getAddContactPage().getClickSocialNetwork().click();
		pom1.getAddContactPage().getClickFaceBook().click();
		pom1.getAddContactPage().getTxtURL().sendKeys(URL);
		pom1.getAddContactPage().getClickReportingManager().click();
		pom1.getAddContactPage().getClickHimselfHerself().click();
		pom1.getAddContactPage().getClickAccessRole().click();
		pom1.getAddContactPage().getClickProfileViewer().click();
		
		
		
		
	}
	@When("user click on Create button")
	public void user_click_on_create_button() throws InterruptedException {
		Thread.sleep(2000);
		pom1.getAddContactPage().getClickCreate().click();
	}
	@Then("user Verify after Update Contact Added uccessfully message id displayed")
	public void user_verify_after_update_contact_added_uccessfully_message_id_displayed() {

	}
	
	

	@When("user click on Ringcentral logo")
	public void user_click_on_ringcentral_logo() throws InterruptedException {
		Thread.sleep(3000);
	    pom1.getAddContactPage().getClickRingCentralbtn().click();
	
	}
	@When("user click on any Contact Number")
	public void user_click_on_any_contact_number() throws InterruptedException {
		Thread.sleep(5000);
	    pom1.getAddContactPage().getClickPhnNo().click();
	
	}
	

	@When("user click on Call logo")
	public void user_click_on_call_logo() throws InterruptedException {
		Thread.sleep(3000);
       pom1.getAddContactPage().getClickCallLogo().click();
	
	}
	

	@When("user click on Callany Contact Number")
	public void user_click_on_callany_contact_number() throws InterruptedException {
		Thread.sleep(6000);
        pom1.getAddContactPage().getClickCallPhnNo().click();
	
	}



	

	@When("user click on Teams logo")
	public void user_click_on_teams_logo() throws InterruptedException {
		Thread.sleep(3000);
       pom1.getAddContactPage().getClickTeamsLogo().click();
	
	}














}
