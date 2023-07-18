package com.stepdefinition;

import java.io.IOException;

import com.base.BaseClass;
import com.manager.PageObjectManager;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC1_HomePage extends BaseClass{
	PageObjectManager pom=new PageObjectManager();

	@When("User enter valid Email id and Password")
	public void userEnterValidEmailIdAndPassword() throws IOException {
		pom.getLoginInPage().getTxtemail().sendKeys(getData("HomePage",1,0));
		pom.getLoginInPage().getTxtPassword().sendKeys(getData("HomePage",1,1));

	}
	@When("User click on Sign In button")
	public void userClickOnSignInButton() throws InterruptedException {
		Thread.sleep(1000);
		pom.getLoginInPage().getBtnClick().click();
		

	}
	@Then("User should verify the success message {string}")
	public void userShouldVerifyTheSuccessMessage(String string) {
	

	}




}
