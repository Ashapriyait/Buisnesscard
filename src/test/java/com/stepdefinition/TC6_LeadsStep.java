package com.stepdefinition;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.WebDriver;

import com.base.BaseClass;
import com.manager.PageObjectManager;

import io.cucumber.java.en.When;

public class TC6_LeadsStep extends BaseClass {
	
	//WebDriver driver;
	PageObjectManager pom3=new PageObjectManager();
	String parent;
	
	@When("user click on three dots")
	public void user_click_on_three_dots() throws InterruptedException {
		Thread.sleep(4000);
       pom3.getLeadsPage().getClickThreeDots().click();
	}
	@When("user click on Leads Icon")
	public void user_click_on_leads_icon() throws InterruptedException {
		Thread.sleep(1000);
		pom3.getLeadsPage().getClickLeadIcon().click();

	}
	@When("user click on any one Lead")
	public void user_click_on_any_one_lead() throws InterruptedException {
		Thread.sleep(7000);
		pom3.getLeadsPage().getClickCheckBox().click();
	}
	@When("user click on Save to One Drive Logo")
	public void user_click_on_save_to_one_drive_logo() throws InterruptedException {
		Thread.sleep(7000);
       pom3.getLeadsPage().getClickOneDrive().click();
       
	}
	
	@When("user enter microsoft signin {string}")
	public void user_enter_microsoft_signin(String  EmailPhoneorSkype  ) throws InterruptedException {
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 parent = driver.getWindowHandle();
		Set<String> windowHandles = driver.getWindowHandles();
		for (String string : windowHandles) {
			if(!(string.equals(parent))) {
				driver.switchTo().window(string);
			}
			
		}
	  pom3.getLeadsPage().getTxtEmailPhoneorSkype().sendKeys(EmailPhoneorSkype);
	}
	@When("user click on Microsoft Next button")
	public void user_click_on_microsoft_next_button() throws InterruptedException {
		Thread.sleep(2000);
		pom3.getLeadsPage().getClickNext().click();
	
	}
	@When("user enter pts signin {string} and {string}")
	public void user_enter_pts_signin_and(String Username, String Password) {
         
		pom3.getLeadsPage().getTxtUsername().sendKeys(Username);
		pom3.getLeadsPage().getTxtPassword().sendKeys(Password);
		
	
	}
	@When("user click on pts Remember Box")
	public void user_click_on_pts_remember_box() throws InterruptedException {
		Thread.sleep(2000);
		pom3.getLeadsPage().getClickRememberBox().click();
	
	}
	@When("user click on pts Signin")
	public void user_click_on_pts_signin() throws InterruptedException {
		Thread.sleep(2000);
		pom3.getLeadsPage().getClickSignin().click();
	
	}

	@When("user click on Okta Verify SendPush button")
	public void user_click_on_okta_verify_send_push_button() throws InterruptedException {
		Thread.sleep(1000);
        pom3.getLeadsPage().getClickSendPush().click();
	
	}

	@When("user click on Dont show this again CheckBox")
	public void user_click_on_dont_show_this_again_check_box() throws InterruptedException {
		Thread.sleep(5000);
		pom3.getLeadsPage().getDontshowthisagainCheckBox().click();
	}
	@When("user click on Yes button")
	public void user_click_on_yes_button() throws InterruptedException {
		Thread.sleep(5000);
		pom3.getLeadsPage().getClickYes().click();
	}


	@When("user click on Any folder and click on Microsoft Teams Chat Files")
	public void user_click_on_any_folder_and_click_on_microsoft_teams_chat_files() throws InterruptedException {
		Thread.sleep(5000);
		
		driver.switchTo().window(parent);
		pom3.getLeadsPage(). getClickMicrosoftChatFile().click();
		
	}
	@When("user click on Save button")
	public void user_click_on_save_button() throws InterruptedException {
		Thread.sleep(7000);
		 pom3.getLeadsPage().getClickSaveButton().click();
	}

	  

}
