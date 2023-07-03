package com.stepdefinition;

import org.openqa.selenium.WebDriver;

import com.base.BaseClass;
import com.manager.PageObjectManager;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC2_YujjHomePageStep extends BaseClass {
	WebDriver driver;
	PageObjectManager pomYujj=new PageObjectManager();
	


	@When("user click on Contact View button")
	public void user_click_on_contact_view_button() throws InterruptedException {
		Thread.sleep(6000);
		pomYujj.getYujjCardHomePage().getClickContactViewbtn().click();
	}
	@When("user click on SaveContact button")
	public void user_click_on_save_contact_button() throws InterruptedException {
		Thread.sleep(7000);
		pomYujj.getYujjCardHomePage().getClickSavebutton().click();
	}
	

	
	@When("user click on Edit Contact")
	public void user_click_on_edit_contact() throws InterruptedException {
		Thread.sleep(7000);
		pomYujj.getYujjCardHomePage().getClickEditContactbtn().click();
		
		
	}
	@When("user click on add contact button")
	public void user_click_on_add_contact_button() throws InterruptedException {
		Thread.sleep(7000);
		pomYujj.getYujjCardHomePage().getClickAdd().click();
	}
	@When("user should enters {string} and {string}")
	public void user_should_enters_and(String PhoneType, String Numbers) {
	
       pomYujj.getYujjCardHomePage().getClickPnType().sendKeys(PhoneType);
       pomYujj.getYujjCardHomePage().getTxtPhnNo().sendKeys(Numbers);
	
	}
	
	@When("user scrollDown for click on Update button")
	public void user_scroll_down_for_click_on_update_button() throws InterruptedException {
		Thread.sleep(8000);
		scrollDownJs(pomYujj.getYujjCardHomePage().getBottomPage());
		Thread.sleep(8000);
		pomYujj.getYujjCardHomePage().getClickUpdatebtn().click();
	}
	@Then("user shold be Verifing Updating SuccessMessage")
	public void user_shold_be_verifing_updating_success_message() {
		

	}




}