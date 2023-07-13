package com.stepdefinition;

import java.io.IOException;
import java.time.Duration;

import com.base.BaseClass;
import com.manager.PageObjectManager;

import io.cucumber.java.en.When;

public class TC3_CompanySignUpStep extends BaseClass {
	PageObjectManager pom=new PageObjectManager();
	

	@When("user click the Company SignUp radio button")
	public void user_click_the_company_sign_up_radio_button() {
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		pom.getCompanySignUpPage().getRatiobtnClick().click();

	
	}

	@When("user enters Company First Name and Last Name and Work Email and New Password and Confirm Password")
	public void user_enters_company_first_name_and_last_name_and_work_email_and_new_password_and_confirm_password() throws IOException {
		pom.getCompanySignUpPage().getTxtFirstName().sendKeys(getData("LogIn",2,2));
		pom.getCompanySignUpPage().getTxtLastName().sendKeys(getData("LogIn",2,3));
		pom.getCompanySignUpPage().getTxtEmail().sendKeys(getData("LogIn",2,4));
		pom.getCompanySignUpPage().getTxtNewPassword().sendKeys(getData("LogIn",2,5));
		pom.getCompanySignUpPage().getTxtConfirmPassword().sendKeys(getData("LogIn",2,6));
		
	}
	

	@When("user enters Company First Name and Last Name and Work Email and Valid New Password and InValid Confirm Password")
	public void user_enters_company_first_name_and_last_name_and_work_email_and_valid_new_password_and_in_valid_confirm_password() throws IOException {
		pom.getCompanySignUpPage().getTxtFirstName().sendKeys(getData("LogIn",2,2));
		pom.getCompanySignUpPage().getTxtLastName().sendKeys(getData("LogIn",2,3));
		pom.getCompanySignUpPage().getTxtEmail().sendKeys(getData("LogIn",2,4));
		pom.getCompanySignUpPage().getTxtNewPassword().sendKeys(getData("LogIn",2,5));
		pom.getCompanySignUpPage().getTxtConfirmPassword().sendKeys(getData("LogIn",1,7));
	
	
	}










}
