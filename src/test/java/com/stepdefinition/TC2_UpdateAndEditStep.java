package com.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.base.BaseClass;
import com.manager.PageObjectManager;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC2_UpdateAndEditStep extends BaseClass {
	WebDriver driver;
	PageObjectManager pom2=new PageObjectManager();
	
    

	@When("user click on View button")
	public void user_click_on_view_button() throws InterruptedException {
		Thread.sleep(12000);
		pom2.getUpdateAndEditPage().getClickViewBtn().click();
	}
	
	@When("user click on Edit Contact")
	public void user_click_on_edit_contact() throws InterruptedException {
		Thread.sleep(6000);
		pom2.getUpdateAndEditPage().getClickEditBtn().click();
	}
	

	@When("user should enters {string} and {string} and {string} and {string} and {string} and {string} and {string} and {string} and {string}")
	public void user_should_enters_and_and_and_and_and_and_and_and(String FirstName, String LastName, String add, String PhoneType, String Numbers, String addNetwork, String SocialNetworkType, String URL, String AccessRole) throws InterruptedException {
       Thread.sleep(6000); 
       pom2.getUpdateAndEditPage().getTxtFirstName().clear();
		pom2.getUpdateAndEditPage().getTxtFirstName().sendKeys(FirstName);
		pom2.getUpdateAndEditPage().getTxtLastName().clear();
        pom2.getUpdateAndEditPage().getTxtLastName().sendKeys(LastName);
        pom2.getUpdateAndEditPage().getClickAddPhnType().click();
        pom2.getUpdateAndEditPage().getClickPhoneType().click();
        pom2.getUpdateAndEditPage().getClickWork().click();
        pom2.getUpdateAndEditPage().getTxtPhnNo().sendKeys(Numbers);
        pom2.getUpdateAndEditPage().getClickSocialNetworkURL().click();
        pom2.getUpdateAndEditPage().getClickSocialNetwork().click();
        pom2.getUpdateAndEditPage().getClickInstagram().click();
       // pom2.getUpdateAndEditPage().getTxtURL().sendKeys(URL);
        pom2.getUpdateAndEditPage().getClickAccessRole().click();
        pom2.getUpdateAndEditPage().getClickProfileViewer().click();
	}



	@When("user click on Update button")
	public void user_click_on_update_button() throws InterruptedException {
	    Thread.sleep(6000);
		pom2.getUpdateAndEditPage().getClickUpdate().click();
	}
	@Then("user shold be Verifing Updating SuccessMessage")
	public void user_shold_be_verifing_updating_success_message() {

	}



	


}