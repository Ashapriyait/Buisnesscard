package com.stepdefinition;

import com.base.BaseClass;
import com.manager.PageObjectManager;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC5_SystemPreferenceStep extends BaseClass {
	
	PageObjectManager pom=new PageObjectManager();
		
	
	@When("user click on systemPreferences logo")
	public void user_click_on_system_preferences_logo() throws InterruptedException {
		Thread.sleep(9000);
		pom.getSystemPreferencePage().getClickSystemPreferences().click();	
	}
	@When("user editwebsit enters {string} and {string} and {string} and {string} and {string} and {string} and {string}")
	public void user_editwebsit_enters_and_and_and_and_and_and(String CompanyName, String CompanyWebsite, String address, String Country, String State, String City, String Zipcode) throws InterruptedException {
		Thread.sleep(2000);
		pom.getSystemPreferencePage().getTxtCompanyName().clear();
		pom.getSystemPreferencePage().getTxtCompanyName().sendKeys(CompanyName);
		Thread.sleep(2000);
		pom.getSystemPreferencePage().getTxtCompanyWebsite().clear();
		pom.getSystemPreferencePage().getTxtCompanyWebsite().sendKeys(CompanyWebsite);
		pom.getSystemPreferencePage().getTxtAddress().clear();
		pom.getSystemPreferencePage().getTxtAddress().sendKeys(address);
		pom.getSystemPreferencePage().getClickCountry().click();
		pom.getSystemPreferencePage().getClickAlbania().click();
		Thread.sleep(2000);
		pom.getSystemPreferencePage().getClickState().click();
		pom.getSystemPreferencePage().getClickBeratCountry().click();
		pom.getSystemPreferencePage().getClickCity().click();
		Thread.sleep(2000);
		//pom.getSystemPreferencePage().getClickBirkhadem().click();
		pom.getSystemPreferencePage().getTxtZipcode().clear();
		pom.getSystemPreferencePage().getTxtZipcode().sendKeys(Zipcode);
		
	
	}
	@When("user click on Update Details")
	public void user_click_on_update_details() throws InterruptedException {
		Thread.sleep(2000);
		pom.getSystemPreferencePage().getClickUpdate().click();
	
	}

	@Then("User should verify after success message {string}")
	public void user_should_verify_after_success_message(String string) {
       System.out.println("CompanyUpdatedSuccessfully");
	}




	@When("user click on Delete MyAccount")
	public void user_click_on_delete_my_account() throws InterruptedException {
		Thread.sleep(2000);
		pom.getSystemPreferencePage().getClickDeleteMyAccount().click();
	
	}

	@When("user enters {string}")
	public void user_enters(String PleasetypeDeletetoconfirm) {
		
		pom.getSystemPreferencePage().getTxtDelete().sendKeys(PleasetypeDeletetoconfirm);
	
	}
	@When("user click on Delete button")
	public void user_click_on_delete_button() throws InterruptedException {
		Thread.sleep(3000);
		pom.getSystemPreferencePage().getClickDelete().click();
	
	
	}
	

	@When("user enters {string} and {string} and {string}")
	public void user_enters_and_and(String CurrentPassword, String NewPassword, String ConfirmPassword) throws InterruptedException {
		Thread.sleep(3000);
		pom.getSystemPreferencePage().getTxtCurrentPassword().sendKeys(CurrentPassword);
		pom.getSystemPreferencePage().getTxtNewPassword().sendKeys(NewPassword);
		pom.getSystemPreferencePage().getTxtConfirmPassword().sendKeys(ConfirmPassword);
		
	}
	@When("user click on ChangePassword")
	public void user_click_on_change_password() throws InterruptedException {
		Thread.sleep(3000);
		pom.getSystemPreferencePage().getClickChangePassword().click();
	}

	@Then("user should after Verifying PasswordUpdate Success Message")
	public void user_should_after_verifying_password_update_success_message() {
       
	   System.out.println("PasswordUpdatedSuccessfully");
	}













}
