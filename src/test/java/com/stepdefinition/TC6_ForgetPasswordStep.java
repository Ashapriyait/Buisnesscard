package com.stepdefinition;

import org.openqa.selenium.WebDriver;

import com.base.BaseClass;
import com.manager.PageObjectManager;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC6_ForgetPasswordStep extends BaseClass {
	PageObjectManager pom=new PageObjectManager();
	WebDriver driver;

	@When("user should click on Forget Password")
	public void user_should_click_on_forget_password() throws InterruptedException {
		Thread.sleep(1000);
		pom.getForgetPasswordPag().getClickForgetPassword().click();
	
	}
	@When("user should enters {string}")
	public void user_should_enters(String Email) throws InterruptedException {
		Thread.sleep(1000);
		pom.getForgetPasswordPag().getTxtEmailAddress().sendKeys(Email);
	
	}
	@When("user should click on ResetPassword")
	public void user_should_click_on_reset_password() throws InterruptedException {
		Thread.sleep(1000);
		pom.getForgetPasswordPag().getClickResetPassword().click();
	
	}
	@Then("user should Verifying Password Reset Pin send to email Message is Displayed")
	public void user_should_verifying_password_reset_pin_send_to_email_message_is_displayed() {
	    System.out.println("Reset Pin Link send to Email");
	}
	

	@When("user enters Valid Resetted Password {string} and {string}")
	public void user_enters_valid_resetted_password_and(String email, String password) {
		pom.getForgetPasswordPag().getTxtEmail().sendKeys(email);
		pom.getForgetPasswordPag().getTxtResettedPassword().sendKeys(password);
	
	}







}
