package com.stepdefinition;

import java.io.IOException;
import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.base.BaseClass;
import com.manager.PageObjectManager;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC1_LogInStep extends BaseClass {
	
	PageObjectManager pom=new PageObjectManager();
	
	@When("user enters email and Password")
	public void user_enters_email_and_password() throws IOException, InterruptedException {
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		pom.getLoginInPage().getTxtemail().sendKeys(getData("LogIn",1,0));
		pom.getLoginInPage().getTxtPassword().sendKeys(getData("LogIn",1,1));
		
	}
    @When("user click the Remember Me box")
	public void user_click_the_remember_me_box() {
		pom.getLoginInPage().getCheckboxClick().click();
	}
	@When("user click the SignIn button")
	public void user_click_the_sign_in_button() {
		pom.getLoginInPage().getBtnClick().click();
	}
	@Then("User Should verify after signin success message {string}")
	public void user_should_verify_after_signin_success_message(String expCardName) {

		
		//WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(600));
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/h2[@class=\"contactname\"]")));
		 String actCardName = pom.getLoginInPage().getActCardName().getText();
		Assert.assertEquals("Unable to login. Please try again",expCardName,actCardName);
	}
	
	
	//InValid Email and Valid Password

	@When("user enters Invalid email and Password")
	public void user_enters_invalid_email_and_password() throws IOException {
         pom.getLoginInPage().getTxtemail().sendKeys(getData("LogIn",2,0));
         pom.getLoginInPage().getTxtPassword().sendKeys(getData("LogIn",1,1));
	
	}
	@Then("User should verify after enter invalid date error message {string}")
	public void user_should_verify_after_enter_invalid_date_error_message(String expErrorEmail) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		String ActErrorEmail = pom.getLoginInPage().getActErrorEmail().getText();
			Assert.assertEquals("Unable to login. Please try again",expErrorEmail,ActErrorEmail);
	
	}
	
  //Valid Email and Invalid Password
	

	@When("user enters valid email and Invalid Password")
	public void user_enters_valid_email_and_invalid_password() throws IOException {
		 pom.getLoginInPage().getTxtemail().sendKeys(getData("LogIn",1,0));
         pom.getLoginInPage().getTxtPassword().sendKeys(getData("LogIn",2,1));
		
	}
	
	//InValid Email and Invalid Password
	

	@When("user enters Invalid email and Invalid Password")
	public void user_enters_invalid_email_and_invalid_password() throws IOException {
	
		 pom.getLoginInPage().getTxtemail().sendKeys(getData("LogIn",2,0));
         pom.getLoginInPage().getTxtPassword().sendKeys(getData("LogIn",2,1));
	}
	
	//RememberMe

	@Then("user Verify after should error message is displayed {string}")
	public void userVerifyAfterShouldErrorMessageIsDisplayed(String expAnabletoLoginMessagElement) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		String ActAnabletoLoginMessagElement = pom.getLoginInPage().getActAnabletoLoginMessagElement().getText();
		Assert.assertEquals("Sign in to your account.",expAnabletoLoginMessagElement,ActAnabletoLoginMessagElement);

	
	}



	
	//ValidLogin
	

	@When("user click on Three Dots")
	public void user_click_on_three_dots() {
		pom.getLoginInPage().getClickThreeDots().click();
	
	}
	@When("user click on SignOut button")
	public void user_click_on_log_out_button() {
		pom.getLoginInPage().getClickSignOut().click();
        
	
	}
	@Then("User should verify after Signout successfull SignIn Page {string}")
	public void user_should_verify_after_logout_successfull_sign_in_page(String expSiginPageMessage) {
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		String ActSiginPageMessage = pom.getLoginInPage().getActSiginPageMessage().getText();
			Assert.assertEquals("Sign in to your account.",expSiginPageMessage,ActSiginPageMessage);
	

	
	}
	

	@When("user click on Eye Icon")
	public void userClickOnEyeIcon() {
		pom.getLoginInPage().getClickEyeIconElement().click();

	}
	
	//ForgetPassword
	
	@When("user should click on Forget Password")
	public void userShouldClickOnForgetPassword() {
		pom.getForgetPasswordPage().getClickForgetPassword().click();

	}
	@When("user should enters Email")
	public void userShouldEntersEmail() throws IOException, InterruptedException {
		pom.getForgetPasswordPage().getTxtEmailAddress().sendKeys(getData("LogIn",3,0));

	}
	@When("user should click on ResetPassword")
	public void userShouldClickOnResetPassword() {
		pom.getForgetPasswordPage().getClickResetPassword().click();
	}

	@Then("user should Verifying Message is Displayed {string}")
	public void userShouldVerifyingMessageIsDisplayed(String expActMessagElement) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		String ActMessagElement = pom.getForgetPasswordPage().getActMessagElement().getText();
		Assert.assertEquals("Sign in to your account.",expActMessagElement,ActMessagElement);

	
	}



	
    

}