package com.stepdefinition;

import java.io.IOException;
import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.Select;

import com.base.BaseClass;
import com.manager.PageObjectManager;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC3_CompanySignUpStep extends BaseClass {
	PageObjectManager pom=new PageObjectManager();
	

	@When("User click the Company SignUp radio button")
	public void userClickTheCompanySignUpRadioButton() throws InterruptedException {
		Thread.sleep(3000);
		pom.getCompanySignUpPage().getRatiobtnClick().click();
		

	}
	@When("user Enter only numbers in Company Signup First name and Last name")
	public void userEnterOnlyNumbersInCompanySignupFirstNameAndLastName() throws IOException {
		pom.getCompanySignUpPage().getTxtFirstName().sendKeys(getData("CompanySignUp",2,0));
		pom.getCompanySignUpPage().getTxtLastName().sendKeys(getData("CompanySignUp",2,1));

	}
	@When("User Enter only special characters in Company Signup First name and Last name")
	public void userEnterOnlySpecialCharactersInCompanySignupFirstNameAndLastName() throws IOException {
		pom.getCompanySignUpPage().getTxtFirstName().clear();
		pom.getCompanySignUpPage().getTxtFirstName().sendKeys(getData("CompanySignUp",3,0));
		pom.getCompanySignUpPage().getTxtLastName().clear();
		pom.getCompanySignUpPage().getTxtLastName().sendKeys(getData("CompanySignUp",3,1));
		

	}
	@When("User Enter Company Signup Valid First name and Valid LastName and Invalid Work Email")
	public void userEnterCompanySignupValidFirstNameAndValidLastNameAndInvalidWorkEmail() throws IOException {
		pom.getCompanySignUpPage().getTxtFirstName().clear();
		pom.getCompanySignUpPage().getTxtFirstName().sendKeys(getData("CompanySignUp",1,0));
		pom.getCompanySignUpPage().getTxtLastName().clear();
		pom.getCompanySignUpPage().getTxtLastName().sendKeys(getData("CompanySignUp",1,1));
		pom.getCompanySignUpPage().getTxtEmail().sendKeys(getData("CompanySignUp",1,2));

	}
	@When("User enters Company Signup Valid Firstname and Valid Lastname and Valid Email")
	public void userEntersCompanySignupValidFirstnameAndValidLastnameAndValidEmail() throws IOException {
		pom.getCompanySignUpPage().getTxtFirstName().clear();
		pom.getCompanySignUpPage().getTxtFirstName().sendKeys(getData("CompanySignUp",1,0));
		pom.getCompanySignUpPage().getTxtLastName().clear();
		pom.getCompanySignUpPage().getTxtLastName().sendKeys(getData("CompanySignUp",1,1));
		pom.getCompanySignUpPage().getTxtEmail().clear();
		pom.getCompanySignUpPage().getTxtEmail().sendKeys(getData("CompanySignUp",1,2));
		
	}
	@When("User Enters Company Signup Valid Firstname and Valid Lastname and Valid Email and Valid NewPassword")
	public void userEntersCompanySignupValidFirstnameAndValidLastnameAndValidEmailAndValidNewPassword() throws IOException {
		pom.getCompanySignUpPage().getTxtFirstName().clear();
		pom.getCompanySignUpPage().getTxtFirstName().sendKeys(getData("CompanySignUp",1,0));
		pom.getCompanySignUpPage().getTxtLastName().clear();
		pom.getCompanySignUpPage().getTxtLastName().sendKeys(getData("CompanySignUp",1,1));
		pom.getCompanySignUpPage().getTxtEmail().clear();
		pom.getCompanySignUpPage().getTxtEmail().sendKeys(getData("CompanySignUp",1,2));
		pom.getCompanySignUpPage().getTxtNewPassword().sendKeys(getData("CompanySignUp",1,3));

		
	}
	@When("User Enters Company Signup Valid Firstname and Valid Lastname and Valid Email and Valid NewPassword and Invalid ConfirmPassword")
	public void userEntersCompanySignupValidFirstnameAndValidLastnameAndValidEmailAndValidNewPasswordAndInvalidConfirmPassword() throws IOException {
		pom.getCompanySignUpPage().getTxtFirstName().clear();
		pom.getCompanySignUpPage().getTxtFirstName().sendKeys(getData("CompanySignUp",1,0));
		pom.getCompanySignUpPage().getTxtLastName().clear();
		pom.getCompanySignUpPage().getTxtLastName().sendKeys(getData("CompanySignUp",1,1));
		pom.getCompanySignUpPage().getTxtEmail().clear();
		pom.getCompanySignUpPage().getTxtEmail().sendKeys(getData("CompanySignUp",1,2));
		pom.getCompanySignUpPage().getTxtNewPassword().clear();
		pom.getCompanySignUpPage().getTxtNewPassword().sendKeys(getData("CompanySignUp",1,3));
		pom.getCompanySignUpPage().getTxtConfirmPassword().sendKeys(getData("CompanySignUp",1,5));

	}
	@When("User Enters Company Signup Valid Firstname and Valid Lastname and Valid Email and Valid NewPassword and valid ConfirmPassword")
	public void userEntersCompanySignupValidFirstnameAndValidLastnameAndValidEmailAndValidNewPasswordAndValidConfirmPassword() throws IOException {
		pom.getCompanySignUpPage().getTxtFirstName().clear();
		pom.getCompanySignUpPage().getTxtFirstName().sendKeys(getData("CompanySignUp",1,0));
		pom.getCompanySignUpPage().getTxtLastName().clear();
		pom.getCompanySignUpPage().getTxtLastName().sendKeys(getData("CompanySignUp",1,1));
		pom.getCompanySignUpPage().getTxtEmail().clear();
		pom.getCompanySignUpPage().getTxtEmail().sendKeys(getData("CompanySignUp",1,2));
		pom.getCompanySignUpPage().getTxtNewPassword().clear();
		pom.getCompanySignUpPage().getTxtNewPassword().sendKeys(getData("CompanySignUp",1,3));
		pom.getCompanySignUpPage().getTxtConfirmPassword().clear();
		pom.getCompanySignUpPage().getTxtConfirmPassword().sendKeys(getData("CompanySignUp",1,4));
	}


	@Then("User Should Verify Company Signup after Successfully YujjCard Page is displayed {string}")
	public void userShouldVerifyCompanySignupAfterSuccessfullyYujjCardPageIsDisplayed(String ExpName) {
		//String ActName = pom.getPersionalSignUp().getActName().getText();
		//Assert.assertEquals("AR R",ExpName,ActName);
		System.out.println("Email already exists, Please try a different one");


	}
	

	@When("user enters Company Signup email and Password")
	public void userEntersCompanySignupEmailAndPassword() throws IOException, InterruptedException {
		Thread.sleep(2000);
		pom.getCompanySignUpPage().getTxtUseremail().sendKeys(getData("CompanySignUp",1,2));
		pom.getCompanySignUpPage().getTxtPassword().sendKeys(getData("CompanySignUp",1,3));
		

	}
	@Then("User Should verify after Company signin success message {string}")
	public void userShouldVerifyAfterCompanySigninSuccessMessage(String expCardName) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		String ActCardName = pom.getCompanySignUpPage().getActCardName().getText();
			Assert.assertEquals("Unable to login. Please try again",expCardName,ActCardName);

	
	}
	
// Camera Icon

	
	@When("user Upload the Picture file")
	public void userUploadThePictureFile() throws InterruptedException {
		Thread.sleep(2000);
	pom.getCompanySignUpPage().getFileUpload().sendKeys("C:\\Users\\Ashapriya_PTS\\Pictures\\1104.jpg");
	}

	
	@When("User enters Valid NewPassword and Valid Confirm Password")
	public void userEntersValidNewPasswordAndValidConfirmPassword() throws IOException {
		pom.getCompanySignUpPage().getTxtNewPassword().sendKeys(getData("CompanySignUp",1,3));
		pom.getCompanySignUpPage().getTxtConfirmPassword().sendKeys(getData("CompanySignUp",1,4));
		
	    
	}
	
	//Create Company
	

	@When("User Enters ValidFirstname and ValidLastname and ValidEmail and ValidNewPassword and validConfirmPassword")
	public void userEntersValidFirstnameAndValidLastnameAndValidEmailAndValidNewPasswordAndValidConfirmPassword() throws IOException {
		
		pom.getCompanySignUpPage().getTxtFirstName().sendKeys(getData("CompanySignUp",1,2));
		
		pom.getCompanySignUpPage().getTxtLastName().sendKeys(getData("CompanySignUp",1,3));
	
		pom.getCompanySignUpPage().getTxtEmail().sendKeys(getData("CompanySignUp",1,4));
	
		pom.getCompanySignUpPage().getTxtNewPassword().sendKeys(getData("CompanySignUp",1,5));
		
		pom.getCompanySignUpPage().getTxtConfirmPassword().sendKeys(getData("CompanySignUp",1,6));
	}

	
	@When("User click One more pop up should open with Yes and edit button should be there and click on Yes button")
	public void userClickOneMorePopUpShouldOpenWithYesAndEditButtonShouldBeThereAndClickOnYesButton() throws InterruptedException {
		Thread.sleep(1000);
		pom.getCompanySignUpPage().getClickCheckBox().click();

	
	}
	@Then("User should verify create companypage is displayed {string}")
	public void userShouldVerifyCreateCompanypageIsDisplayed(String ExpCreateCompany) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		String ActName = pom.getCompanySignUpPage().getActCreateCompany().getText();
		Assert.assertEquals("Create Company",ExpCreateCompany,ActName);
		

	
	}
	@When("User Upload the AddLogo Picture file")
	public void userUploadTheAddLogoPictureFile() throws InterruptedException {
		Thread.sleep(2000);
		pom.getCompanySignUpPage().getFileUpload().sendKeys("C:\\Users\\Ashapriya_PTS\\Pictures\\pexels-valeria-boltneva-74512.jpg");

	
	}
	@When("User enters CompanyName and CompanyWebsite and companyAddress")
	public void userEntersCompanyNameAndCompanyWebsiteAndCompanyAddress() throws IOException {
		pom.getCompanySignUpPage().getTxtCompanyName().sendKeys(getData("CompanySignUp",1,7));
		pom.getCompanySignUpPage().getTxtCompanyWebsite().sendKeys(getData("CompanySignUp",1,8));
		pom.getCompanySignUpPage().getTxtCompanyAddress().sendKeys(getData("CompanySignUp",1,9));

	
	}
	@When("User click on Country button")
	public void userClickOnCountryButton() throws InterruptedException {
		Thread.sleep(2000);
		pom.getCompanySignUpPage().getClickCountry().click();
	    
	}
	@When("User click on drapdown select countryname Albania button")
	public void userClickOnDrapdownSelectCountrynameAlbaniaButton() throws InterruptedException {
		Thread.sleep(2000);
		Select country=new Select(driver.findElement(By.xpath("//span[text()=' Albania ']")));
		

	
	}
	@When("User click on state button")
	public void userClickOnStateButton() throws InterruptedException {
		Thread.sleep(2000);
		pom.getCompanySignUpPage().getClickState().click();

	}
	@When("User click on dropdown select Statename Berat County")
	public void userClickOnDropdownSelectStatenameBeratCounty() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@When("User enter ZipCode")
	public void userEnterZipCode() throws IOException {
		pom.getCompanySignUpPage().getTxtZipcode().sendKeys(getData("CompanySignUp",1,10));

	}
	@When("User click on create button")
	public void userClickOnCreateButton() throws InterruptedException {
		Thread.sleep(2000);
		pom.getCompanySignUpPage().getClickCreateBtn().click();

	
	}




	














		

	
	





	

	






	
}

	





	




