package com.stepdefinition;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

import org.junit.Assert;

import com.base.BaseClass;
import com.manager.PageObjectManager;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC2_PersionalSignUpStep extends BaseClass{
	PageObjectManager pom=new PageObjectManager();

	@Given("User is on Yujj SignIn page")
	public void user_is_on_yujj_sign_in_page() throws FileNotFoundException, IOException {
		GetDriver();
        enterUrl(getPropertyFileValue("url"));
        maximizeWindow();

	}




	
	@When("User click the Sign up here")
	public void user_click_the_sign_up_here() {
		pom.getPersionalSignUp().getClickSignUpHere().click();
 
	}
	@When("User click the Persional SignUp radio button")
	public void user_click_the_persional_sign_up_radio_button() throws InterruptedException {
		Thread.sleep(3000);
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60)); 
		pom.getPersionalSignUp().getRatiobtnClick().click();

	
	}
	@When("User click the SignUp button")
	public void user_click_the_sign_up_button() {

		pom.getPersionalSignUp().getSignUpbtnClick().click();

	}
	@Then("User Should Verify after error message should come {string}")
	public void user_should_verify_after_error_message_should_come(String ExpEnterAllFields) throws InterruptedException {
//		Thread.sleep(1000);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(80));
		String ActEnterAllFields = pom.getPersionalSignUp().getActEnterAllFields().getText();
			Assert.assertEquals("Enter all Fields",ExpEnterAllFields,ActEnterAllFields);

	}
	@When("User click on Back button")
	public void user_click_on_back_button() {
		pom.getPersionalSignUp().getClickBackbutton().click();
		
	}
	@Then("User Should Verify after SignIn Page should come {string}")
	public void user_should_verify_after_sign_in_page_should_come(String expSiginPageMessage) throws InterruptedException {
//		Thread.sleep(1000);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		String ActSiginPageMessage = pom.getLoginInPage().getActSiginPageMessage().getText();
			Assert.assertEquals("Sign in to your account.",expSiginPageMessage,ActSiginPageMessage);

	}
	@When("user Enter only numbers in First name and Last name")
	public void user_enter_only_numbers_in_first_name_and_last_name() throws IOException {
		pom.getPersionalSignUp().getTxtFirstName().sendKeys(getData("LogIn",3,2));
		pom.getPersionalSignUp().getTxtLastName().sendKeys(getData("LogIn",3,3));

	}
	@When("User click on SignUp button")
	public void user_click_on_sign_up_button() {
		pom.getPersionalSignUp().getSignUpbtnClick().click();

	}
	@Then("User Should Verify after Wrong format error message should come Firstname and Lastname {string}")
	public void user_should_verify_after_wrong_format_error_message_should_come_firstname_and_lastname(String ExpEnterAllFields) throws InterruptedException {
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		String ActEnterAllFields = pom.getPersionalSignUp().getActEnterAllFields().getText();
			Assert.assertEquals("Enter all Fields",ExpEnterAllFields,ActEnterAllFields);

	}
	@When("User Enter only special characters in First name and Last name")
	public void user_enter_only_special_characters_in_first_name_and_last_name() throws IOException {
		pom.getPersionalSignUp().getTxtFirstName().clear();
		pom.getPersionalSignUp().getTxtFirstName().sendKeys(getData("LogIn",4,2));
		pom.getPersionalSignUp().getTxtLastName().clear();
		pom.getPersionalSignUp().getTxtLastName().sendKeys(getData("LogIn",4,3));
		

	
	}
	@When("User Enter Valid First name and Valid LastName and Invalid Work Email")
	public void user_enter_valid_first_name_and_valid_last_name_and_invalid_work_email() throws IOException {
		pom.getPersionalSignUp().getTxtFirstName().clear();
		pom.getPersionalSignUp().getTxtFirstName().sendKeys(getData("LogIn",1,2));
		pom.getPersionalSignUp().getTxtLastName().clear();
		pom.getPersionalSignUp().getTxtLastName().sendKeys(getData("LogIn",1,3));
		pom.getPersionalSignUp().getTxtEmail().sendKeys(getData("LogIn",3,4));

	
	}
	@Then("User Wrong format error message should come for work email field {string}")
	public void user_wrong_format_error_message_should_come_for_work_email_field(String ExpEnterAllFields) throws InterruptedException {
		//Thread.sleep(1000);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		String ActEnterAllFields = pom.getPersionalSignUp().getActEnterAllFields().getText();
			Assert.assertEquals("Enter all Fields",ExpEnterAllFields,ActEnterAllFields);

	}

	@When("User enters Valid Firstname and Valid Lastname and Valid Email")
	public void user_enters_valid_firstname_and_valid_lastname_and_valid_email() throws IOException {
		pom.getPersionalSignUp().getTxtFirstName().clear();
		pom.getPersionalSignUp().getTxtFirstName().sendKeys(getData("LogIn",1,2));
		pom.getPersionalSignUp().getTxtLastName().clear();
		pom.getPersionalSignUp().getTxtLastName().sendKeys(getData("LogIn",1,3));
		pom.getPersionalSignUp().getTxtEmail().clear();
		pom.getPersionalSignUp().getTxtEmail().sendKeys(getData("LogIn",1,4));
		
	}
	@When("User Enters Valid Firstname and Valid Lastname and Valid Email and Valid NewPassword")
	public void user_enters_valid_firstname_and_valid_lastname_and_valid_email_and_valid_newpassword() throws IOException {
		pom.getPersionalSignUp().getTxtFirstName().clear();
		pom.getPersionalSignUp().getTxtFirstName().sendKeys(getData("LogIn",1,2));
		pom.getPersionalSignUp().getTxtLastName().clear();
		pom.getPersionalSignUp().getTxtLastName().sendKeys(getData("LogIn",1,3));
		pom.getPersionalSignUp().getTxtEmail().clear();
		pom.getPersionalSignUp().getTxtEmail().sendKeys(getData("LogIn",1,4));
		pom.getPersionalSignUp().getTxtNewPassword().sendKeys(getData("LogIn",1,5));

	}
	@Then("User Should Mandatory error message should come for confirm password field or field should gets highlighted with red color {string}")
	public void user_should_mandatory_error_message_should_come_for_confirm_password_field_or_field_should_gets_highlighted_with_red_color(String ExpEnterAllFields) throws InterruptedException {
//		Thread.sleep(1000);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		String ActEnterAllFields = pom.getPersionalSignUp().getActEnterAllFields().getText();
			Assert.assertEquals("Enter all Fields",ExpEnterAllFields,ActEnterAllFields);
	}
	@When("User Enters Valid Firstname and Valid Lastname and Valid Email and Valid NewPassword and Invalid ConfirmPassword")
	public void user_enters_valid_firstname_and_valid_lastname_and_valid_email_and_valid_newpassword_and_invalid_confirmpassword() throws IOException {
		pom.getPersionalSignUp().getTxtFirstName().clear();
		pom.getPersionalSignUp().getTxtFirstName().sendKeys(getData("LogIn",1,2));
		pom.getPersionalSignUp().getTxtLastName().clear();
		pom.getPersionalSignUp().getTxtLastName().sendKeys(getData("LogIn",1,3));
		pom.getPersionalSignUp().getTxtEmail().clear();
		pom.getPersionalSignUp().getTxtEmail().sendKeys(getData("LogIn",1,4));
		pom.getPersionalSignUp().getTxtNewPassword().clear();
		pom.getPersionalSignUp().getTxtNewPassword().sendKeys(getData("LogIn",1,5));
		pom.getPersionalSignUp().getTxtConfirmPassword().sendKeys(getData("LogIn",1,7));
	}
	@Then("User Should Verify after InValid Password error message should come {string}")
	public void user_should_verify_after_in_valid_password_error_message_should_come(String ExpPassworddidnotmatch) throws InterruptedException {
//		Thread.sleep(3000);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		String ActPassworddidnotmatch = pom.getPersionalSignUp().getActPassworddidnotmatch().getText();
		Assert.assertEquals("Password did not match or password did not match pattern",ExpPassworddidnotmatch,ActPassworddidnotmatch);
	}
	
	@When("User Enters Valid Firstname and Valid Lastname and Valid Email and Valid NewPassword and valid ConfirmPassword")
	public void user_enters_valid_firstname_and_valid_lastname_and_valid_email_and_valid_newpassword_and_valid_confirmpassword() throws IOException {
		pom.getPersionalSignUp().getTxtFirstName().clear();
		pom.getPersionalSignUp().getTxtFirstName().sendKeys(getData("LogIn",1,2));
		pom.getPersionalSignUp().getTxtLastName().clear();
		pom.getPersionalSignUp().getTxtLastName().sendKeys(getData("LogIn",1,3));
		pom.getPersionalSignUp().getTxtEmail().clear();
		pom.getPersionalSignUp().getTxtEmail().sendKeys(getData("LogIn",1,4));
		pom.getPersionalSignUp().getTxtNewPassword().clear();
		pom.getPersionalSignUp().getTxtNewPassword().sendKeys(getData("LogIn",1,5));
		pom.getPersionalSignUp().getTxtConfirmPassword().clear();
		pom.getPersionalSignUp().getTxtConfirmPassword().sendKeys(getData("LogIn",1,6));
	
	}
	@When("user click the Chechbox By signing up, you agreed with terms & condition")
	public void user_click_the_chechbox_by_signing_up_you_agreed_with_terms_condition() {
		pom.getPersionalSignUp().getCheckboxClick().click();

	}
	
	@When("user click One more pop up should open with Yes and edit button should be there and click on Yes button")
	public void user_click_one_more_pop_up_should_open_with_yes_and_edit_button_should_be_there_and_click_on_yes_button() {
		pom.getPersionalSignUp().getBtnClick().click();
	}
	
	@Then("User Should Verify after Successfully YujjCard Page is displayed {string}")
	public void user_should_verify_after_successfully_yujj_card_page_is_displayed(String ExpName) throws InterruptedException {
//		Thread.sleep(9000);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(70));
		String ActName = pom.getPersionalSignUp().getActName().getText();
			Assert.assertEquals("AM M",ExpName,ActName);

	}
	
		
	
	
	
	
	
	

	



	
	
	
	
	
	
	
	






	

	














	
	
	




}
