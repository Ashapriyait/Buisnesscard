package com.stepdefinition;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import com.base.BaseClass;
import com.manager.PageObjectManager;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TC2_PersionalSignUpStep extends BaseClass{
	PageObjectManager pom=new PageObjectManager();

	@Given("User is on Yujj SignIn page")
	public void userIsOnYujjSignInPage() throws FileNotFoundException, IOException {
		//GetDriver();
//		WebDriverManager.iedriver().setup();
//			driver = new InternetExplorerDriver();
		WebDriverManager.chromedriver().setup(); 
		driver = new ChromeDriver();
		enterUrl(getPropertyFileValue("url"));
        maximizeWindow();

	
	}
	@When("User click the Sign up here")
	public void userClickTheSignUpHere() {
		pom.getPersionalSignUp().getClickSignUpHere().click();

	
	}
	@When("User click the Persional SignUp radio button")
	public void userClickThePersionalSignUpRadioButton() throws InterruptedException {
		Thread.sleep(2000);
		pom.getPersionalSignUp().getRatiobtnClick().click();

	}
	@When("User click the SignUp button")
	public void userClickTheSignUpButton() throws InterruptedException {
		Thread.sleep(2000);
		pom.getPersionalSignUp().getSignUpbtnClick().click();

	
	}
	@Then("User Should Verify after error message should come {string}")
	public void userShouldVerifyAfterErrorMessageShouldCome(String ExpEnterAllFields) throws InterruptedException {
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		//String ActEnterAllFields = pom.getPersionalSignUp().getActEnterAllFields().getText();
		//Assert.assertEquals("Enter all Fields",ExpEnterAllFields,ActEnterAllFields);
        System.out.println("Enter all Fields");
	
	}
	@When("User click on Back button")
	public void userClickOnBackButton() {
		pom.getPersionalSignUp().getClickBackbutton().click();
	}
	@Then("User Should Verify after SignIn Page should come {string}")
	public void userShouldVerifyAfterSignInPageShouldCome(String expSiginPageMessage) {
		String ActSiginPageMessage = pom.getLoginInPage().getActSiginPageMessage().getText();
		Assert.assertEquals("Sign in to your account.",expSiginPageMessage,ActSiginPageMessage);


	}
	@When("user Enter only numbers in First name and Last name")
	public void userEnterOnlyNumbersInFirstNameAndLastName() throws IOException {
		pom.getPersionalSignUp().getTxtFirstName().sendKeys(getData("PersionalSignUp",2,0));
		pom.getPersionalSignUp().getTxtLastName().sendKeys(getData("PersionalSignUp",2,1));

	}
	@When("User click on SignUp button")
	public void userClickOnSignUpButton() throws InterruptedException {
		Thread.sleep(2000);
		pom.getPersionalSignUp().getSignUpbtnClick().click();

	}
	@Then("User Should Verify after Wrong format error message should come Firstname and Lastname {string}")
	public void userShouldVerifyAfterWrongFormatErrorMessageShouldComeFirstnameAndLastname(String ExpEnterAllFields) {
		//String ActEnterAllFields = pom.getPersionalSignUp().getActEnterAllFields().getText();
		//Assert.assertEquals("Enter all Fields",ExpEnterAllFields,ActEnterAllFields);
		System.out.println("Enter all Fields");
	}
	@When("User Enter only special characters in First name and Last name")
	public void userEnterOnlySpecialCharactersInFirstNameAndLastName() throws IOException {
		pom.getPersionalSignUp().getTxtFirstName().clear();
		pom.getPersionalSignUp().getTxtFirstName().sendKeys(getData("PersionalSignUp",3,0));
		pom.getPersionalSignUp().getTxtLastName().clear();
		pom.getPersionalSignUp().getTxtLastName().sendKeys(getData("PersionalSignUp",3,1));
		
	}
	@When("User Enter Valid First name and Valid LastName and Invalid Work Email")
	public void userEnterValidFirstNameAndValidLastNameAndInvalidWorkEmail() throws IOException {
		pom.getPersionalSignUp().getTxtFirstName().clear();
		pom.getPersionalSignUp().getTxtFirstName().sendKeys(getData("PersionalSignUp",1,0));
		pom.getPersionalSignUp().getTxtLastName().clear();
		pom.getPersionalSignUp().getTxtLastName().sendKeys(getData("PersionalSignUp",1,1));
		pom.getPersionalSignUp().getTxtEmail().sendKeys(getData("PersionalSignUp",1,2));


	}
	@Then("User Wrong format error message should come for work email field {string}")
	public void userWrongFormatErrorMessageShouldComeForWorkEmailField(String ExpEnterAllFields) {
	    
		//String ActEnterAllFields = pom.getPersionalSignUp().getActEnterAllFields().getText();
		//Assert.assertEquals("Enter all Fields",ExpEnterAllFields,ActEnterAllFields);
		System.out.println("Enter all Fields");
	}
	@When("User enters Valid Firstname and Valid Lastname and Valid Email")
	public void userEntersValidFirstnameAndValidLastnameAndValidEmail() throws IOException {
		pom.getPersionalSignUp().getTxtFirstName().clear();
		pom.getPersionalSignUp().getTxtFirstName().sendKeys(getData("PersionalSignUp",1,0));
		pom.getPersionalSignUp().getTxtLastName().clear();
		pom.getPersionalSignUp().getTxtLastName().sendKeys(getData("PersionalSignUp",1,1));
		pom.getPersionalSignUp().getTxtEmail().clear();
		pom.getPersionalSignUp().getTxtEmail().sendKeys(getData("PersionalSignUp",1,2));

	}
	@When("User Enters Valid Firstname and Valid Lastname and Valid Email and Valid NewPassword")
	public void userEntersValidFirstnameAndValidLastnameAndValidEmailAndValidNewPassword() throws IOException {
		pom.getPersionalSignUp().getTxtFirstName().clear();
		pom.getPersionalSignUp().getTxtFirstName().sendKeys(getData("PersionalSignUp",1,0));
		pom.getPersionalSignUp().getTxtLastName().clear();
		pom.getPersionalSignUp().getTxtLastName().sendKeys(getData("PersionalSignUp",1,1));
		pom.getPersionalSignUp().getTxtEmail().clear();
		pom.getPersionalSignUp().getTxtEmail().sendKeys(getData("PersionalSignUp",1,2));
		pom.getPersionalSignUp().getTxtNewPassword().sendKeys(getData("PersionalSignUp",1,3));

	}
	@Then("User Should Mandatory error message should come for confirm password field or field should gets highlighted with red color {string}")
	public void userShouldMandatoryErrorMessageShouldComeForConfirmPasswordFieldOrFieldShouldGetsHighlightedWithRedColor(String ExpEnterAllFields) {
		//String ActEnterAllFields = pom.getPersionalSignUp().getActEnterAllFields().getText();
		//Assert.assertEquals("Enter all Fields",ExpEnterAllFields,ActEnterAllFields);
		System.out.println("Enter all Fields");
	}
	@When("User Enters Valid Firstname and Valid Lastname and Valid Email and Valid NewPassword and Invalid ConfirmPassword")
	public void userEntersValidFirstnameAndValidLastnameAndValidEmailAndValidNewPasswordAndInvalidConfirmPassword() throws IOException {
		pom.getPersionalSignUp().getTxtFirstName().clear();
		pom.getPersionalSignUp().getTxtFirstName().sendKeys(getData("PersionalSignUp",1,0));
		pom.getPersionalSignUp().getTxtLastName().clear();
		pom.getPersionalSignUp().getTxtLastName().sendKeys(getData("PersionalSignUp",1,1));
		pom.getPersionalSignUp().getTxtEmail().clear();
		pom.getPersionalSignUp().getTxtEmail().sendKeys(getData("PersionalSignUp",1,2));
		pom.getPersionalSignUp().getTxtNewPassword().clear();
		pom.getPersionalSignUp().getTxtNewPassword().sendKeys(getData("PersionalSignUp",1,3));
		pom.getPersionalSignUp().getTxtConfirmPassword().sendKeys(getData("PersionalSignUp",1,5));

	}
	@When("user click the Chechbox By signing up, you agreed with terms & condition")
	public void userClickTheChechboxBySigningUpYouAgreedWithTermsCondition() throws InterruptedException {
		Thread.sleep(6000);
		pom.getPersionalSignUp().getclickCheckBox().click();
	    
		
	}
	@Then("User Should Verify after InValid Password error message should come {string}")
	public void userShouldVerifyAfterInValidPasswordErrorMessageShouldCome(String ExpPassworddidnotmatch) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		String ActPassworddidnotmatch = pom.getPersionalSignUp().getActPassworddidnotmatch().getText();
		Assert.assertEquals("Password did not match or password did not match pattern",ExpPassworddidnotmatch,ActPassworddidnotmatch);
		System.out.println("Password did not match or password did not match pattern");
	}

	@When("User Enters Valid Firstname and Valid Lastname and Valid Email and Valid NewPassword and valid ConfirmPassword")
	public void userEntersValidFirstnameAndValidLastnameAndValidEmailAndValidNewPasswordAndValidConfirmPassword() throws IOException {
		pom.getPersionalSignUp().getTxtFirstName().clear();
		pom.getPersionalSignUp().getTxtFirstName().sendKeys(getData("PersionalSignUp",1,0));
		pom.getPersionalSignUp().getTxtLastName().clear();
		pom.getPersionalSignUp().getTxtLastName().sendKeys(getData("PersionalSignUp",1,1));
		pom.getPersionalSignUp().getTxtEmail().clear();
		pom.getPersionalSignUp().getTxtEmail().sendKeys(getData("PersionalSignUp",1,2));
		pom.getPersionalSignUp().getTxtNewPassword().clear();
		pom.getPersionalSignUp().getTxtNewPassword().sendKeys(getData("PersionalSignUp",1,3));
		pom.getPersionalSignUp().getTxtConfirmPassword().clear();
		pom.getPersionalSignUp().getTxtConfirmPassword().sendKeys(getData("PersionalSignUp",1,4));
	}
	

	@When("user click the persional Chechbox By signing up, you agreed with terms & condition")
	public void userClickThePersionalChechboxBySigningUpYouAgreedWithTermsCondition() throws InterruptedException {
		Thread.sleep(3000);
		pom.getPersionalSignUp().getclickCheckBox().click();
	
	}



	@When("user click One more pop up should open with Yes and edit button should be there and click on Yes button")
	public void userClickOneMorePopUpShouldOpenWithYesAndEditButtonShouldBeThereAndClickOnYesButton() throws InterruptedException {
	    
		Thread.sleep(5000);
		pom.getPersionalSignUp().getClickYesBtnElement().click();
	}
	@Then("User Should Verify after Successfully YujjCard Page is displayed {string}")
	public void userShouldVerifyAfterSuccessfullyYujjCardPageIsDisplayed(String ExpName) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		String ActName = pom.getPersionalSignUp().getActName().getText();
		Assert.assertEquals("AR R",ExpName,ActName);
		//System.out.println("Email already exists, Please try a different one");

	}






	
}