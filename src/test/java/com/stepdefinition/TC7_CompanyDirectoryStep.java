package com.stepdefinition;

import com.base.BaseClass;
import com.manager.PageObjectManager;

import io.cucumber.java.en.When;

public class TC7_CompanyDirectoryStep extends BaseClass {
	
	PageObjectManager pom=new PageObjectManager();

	@When("user click on Company Directory button")
	public void user_click_on_company_directory_button() throws InterruptedException {
		Thread.sleep(5000);
		pom.getCompanyDirectoryPage().getClickCompanyDirectory().click();
	
	}
	@When("user click on Ringcentral Logo")
	public void user_click_on_ringcentral_logo() throws InterruptedException {

		Thread.sleep(3000);
		pom.getCompanyDirectoryPage().getClickRinCentral().click();
	}
	@When("user click on Any Number")
	public void user_click_on_any_number() throws InterruptedException {
		Thread.sleep(3000);
		pom.getCompanyDirectoryPage().getClickNumber().click();
	
	}

	@When("user click on Teams Logo")
	public void user_click_on_teams_logo() throws InterruptedException {
		Thread.sleep(3000);
		pom.getCompanyDirectoryPage(). getClickTeams().click();
	
	}
	
	

	@When("user click on Call Logo")
	public void user_click_on_call_logo() throws InterruptedException {
		Thread.sleep(3000);
		pom.getCompanyDirectoryPage().getClickCallLogo().click();
	
	}
	






	
	
	




}
