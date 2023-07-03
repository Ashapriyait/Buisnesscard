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
		Thread.sleep(5000);
		pom1.getAddContactPage().getClickNotification().click();
	}
    @When("user click on Company\\/AdminProfile button")
	public void user_click_on_company_admin_profile_button() throws InterruptedException {
		Thread.sleep(2000);
		pom1.getAddContactPage().getClickCompanyAdminProfile().click();
	}
	@When("user click on AddContact button")
	public void user_click_on_add_contact_button() {
        pom1.getAddContactPage().getClickAddContact().click();
	}
	@Then("user should addcontact select all fields enters {string} and {string} and {string} and {string} and {string} and {string} and {string} and {string} and {string} and {string}")
	public void user_should_addcontact_select_all_fields_enters_and_and_and_and_and_and_and_and_and(String string, String string2, String string3, String string4, String string5, String string6, String string7, String string8, String string9, String string10) {

	}
	@When("user click on Create button")
	public void user_click_on_create_button() {

	}
	@Then("user Verify after Update Contact Added uccessfully message id displayed")
	public void user_verify_after_update_contact_added_uccessfully_message_id_displayed() {

	}





}
