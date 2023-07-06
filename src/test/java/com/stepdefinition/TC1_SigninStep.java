package com.stepdefinition;


import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import com.base.BaseClass;
import com.manager.PageObjectManager;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC1_SigninStep extends BaseClass{
	
	WebDriver driver;
	PageObjectManager pom=new PageObjectManager();
	
	//@Given("user is on Yujj SignIn page")
	//public void user_is_on_yujj_sign_in_page() throws  FileNotFoundException, IOException {
		
		//getDriverType(getPropertyFileValue("browser"));
       // enterUrl(getPropertyFileValue("url"));
       // maximizeWindow();
		
		
	//}
	@When("user enters {string} and {string}")
	public void user_enters_and(String email, String password) throws InterruptedException {
		//driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS) ;
		pom.getSignInPage().getTxtemail().sendKeys(email);
		pom.getSignInPage().getTxtPassword().sendKeys(password);
		Thread.sleep(3000);
		
	}
	@When("user click the Remember Me box")
	public void user_click_the_remember_me_box() {
		pom.getSignInPage().getCheckboxClick().click();
		
	
	}
	@When("user click the SignIn button")
	public void user_click_the_sign_in_button() {
		pom.getSignInPage().getBtnClick().click();

	}
	@When("Welcome Yujj Card page is displayed")
	public void welcome_yujj_card_page_is_displayed() throws InterruptedException {
		Thread.sleep(2000);
		pom.getSignInPage().getMessage();
		
		
		
}
	@When("user click the three dots")
	public void user_click_the_three_dots() throws InterruptedException {
		//Actions ac = new Actions(driver);
		Thread.sleep(9000);
		pom.getSignInPage().getClickThreeDots().click();
	
	}

	@When("user click the Signout")
	public void user_click_the_signout() throws InterruptedException {
		Thread.sleep(5000);
       pom.getSignInPage().getClickSignOut().click();
		//driver.findElement(By.xpath("//i[@class='pi pi-sign-out']")).sendKeys(Keys.ENTER);
	}

	@Then("Sign in to your account page is displayed")
	public void sign_in_to_your_account_page_is_displayed() throws InterruptedException {
		Thread.sleep(2000);
		pom.getSignInPage().getSiginPageMessage();
		Assert.assertTrue("Verify after Sign in to your account",true);
		
	}
	@When("user click the Sign up here")
	public void user_click_the_sig_n_up_here() throws InterruptedException {
		Thread.sleep(6000);
		pom.getPersionalSignUp().getClickSignUpHere().click();
		
	}

	@When("user click the Persional SignUp radio button")
	public void user_click_the_persional_sign_up_radio_button() throws InterruptedException {
		Thread.sleep(7000);
       pom.getPersionalSignUp().getRatiobtnClick().click();
	
	}



	@When("user enters {string} and {string} and {string} and {string} and {string}")
	public void user_enters_and_and_and_and(String FirstName, String LastName, String WorkEmail, String NewPassword, String ConfirmPassword) {
         
		pom.getPersionalSignUp().getTxtFirstName().sendKeys(FirstName);
		pom.getPersionalSignUp().getTxtLastName().sendKeys(LastName);
		pom.getPersionalSignUp().getTxtEmail().sendKeys(WorkEmail);
		pom.getPersionalSignUp().getTxtNewPassword().sendKeys(NewPassword);
		pom.getPersionalSignUp().getTxtConfirmPassword().sendKeys(ConfirmPassword);
		
		
	}
	@When("user click the By signing up, you agreed with terms & condition")
	public void user_click_the_by_signing_up_you_agreed_with_terms_condition() throws InterruptedException {
		Thread.sleep(7000);
       pom.getPersionalSignUp().getCheckboxClick().click();
       
	}
	@When("user click the SignUp button")
	public void user_click_the_sign_up_button() throws InterruptedException {
		Thread.sleep(7000);
       pom.getPersionalSignUp().getSignUpbtnClick().click();
	}
	@When("user click One more pop up should open with Yes and edit button should be there and click on Yes button")
	public void user_click_one_more_pop_up_should_open_with_yes_and_edit_button_should_be_there_and_click_on_yes_button() throws InterruptedException {
		Thread.sleep(8000);
		pom.getPersionalSignUp().getBtnClick().click();
       
	}

	
	@When("user click the Company SignUp radio button")
	public void user_click_the_Company_sign_up_radio_button() throws InterruptedException {
		Thread.sleep(7000);
       pom.getCompanySignUpPage().getRatiobtnClick().click();
	
	}

	@When("user enters company signup {string} and {string} and {string} and {string} and {string}")
	public void user_enters_company_signup_and_and_and_and(String FirstName, String LastName, String WorkEmail, String NewPassword, String ConfirmPassword) {
		pom.getCompanySignUpPage().getTxtFirstName().sendKeys(FirstName);
        pom.getCompanySignUpPage().getTxtLastName().sendKeys(LastName);
		pom.getCompanySignUpPage().getTxtEmail().sendKeys(WorkEmail);
		pom.getCompanySignUpPage().getTxtNewPassword().sendKeys(NewPassword);
		pom.getCompanySignUpPage().getTxtConfirmPassword().sendKeys(ConfirmPassword);
		
        
        
	}
	@When("user click the By company signing up, you agreed with terms & condition")
	public void user_click_the_by_company_signing_up_you_agreed_with_terms_condition() throws InterruptedException {
        Thread.sleep(6000);
		pom.getCompanySignUpPage().getCheckboxClick().click();
	}
	@When("user click the company SignUp button")
	public void user_click_the_company_sign_up_button() throws InterruptedException {
		Thread.sleep(7000);
	       pom.getCompanySignUpPage().getSignUpbtnClick().click();
	
	}
	@When("user click One more pop up should open with email Yes and edit button should be there and click on Yes button")
	public void user_click_one_more_pop_up_should_open_with_email_yes_and_edit_button_should_be_there_and_click_on_yes_button() throws InterruptedException {

		Thread.sleep(8000);
		pom.getCompanySignUpPage().getEmailbtnClick().click();
	}

	@Then("Welcome Yujj Card Homepage is displayed")
	public void welcome_yujj_card_homepage_is_displayed() {
	    pom.getCompanySignUpPage().getMessage();
	    Assert.assertTrue("Verify after Welcom Yujj Card is displayed",true);
	
	}



	

}

	
	





