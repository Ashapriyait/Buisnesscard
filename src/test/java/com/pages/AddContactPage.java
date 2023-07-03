package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.base.BaseClass;
import com.manager.PageObjectManager;

public class AddContactPage extends BaseClass {
	WebDriver driver;
	PageObjectManager pomYujj=new PageObjectManager();
	
	@FindBy(xpath="//header[@class='header-collapse']")
	private WebElement clickNotification;
	
	public WebElement getClickNotification() {
		return clickNotification;
	}

	@FindBy(xpath="//i[@class='admnn pi pi-building']")
	private WebElement clickCompanyAdminProfile;
	
	@FindBy(xpath="//i[@class='pi pi-plus']")
	private WebElement clickAddContact;
	
	@FindBy(id="jobTitle")
	private WebElement txtJobTittle;
	
	@FindBy(id="emailAddress")
	private WebElement txtEmailAddress;
	
	@FindBy(id="firstName")
	private WebElement txtFirstName;
	
	@FindBy(id="lastName")
	private WebElement txtLastName;
	
	@FindBy(id="mat-select-value-1")
	private WebElement clickPhoneType;
	
	@FindBy(xpath="//span[text()=' Mobile ']")
	private WebElement clickMobile;
	
	@FindBy(id="number")
	private WebElement txtPhnNo;
	
	@FindBy(id="socialNetworkName")
	private WebElement clickSocialNetwork;
	
	@FindBy(xpath="//span[text()=' Facebook']")
	private WebElement clickFaceBook;
	
	@FindBy(id="url")
	private WebElement txtURL;
	
	@FindBy(id="mat-select-value-5")
	private WebElement clickReportingManager;
	
	@FindBy(xpath="//span[text()=' Himself/ Herself ']")
	private WebElement clickHimselfHerself;
	
	@FindBy(id="mat-select-value-7")
	private WebElement clickAccessRole;
	
	@FindBy(xpath="//span[text()=' Profile Admin ']")
	private WebElement clickProfileAdmin;
	
	@FindBy(xpath="//button[text()='Create']")
	private WebElement clickCreate;

	public WebDriver getDriver() {
		return driver;
	}

	public PageObjectManager getPomYujj() {
		return pomYujj;
	}

	

	public WebElement getClickCompanyAdminProfile() {
		return clickCompanyAdminProfile;
	}

	public WebElement getClickAddContact() {
		return clickAddContact;
	}

	public WebElement getTxtJobTittle() {
		return txtJobTittle;
	}

	public WebElement getTxtEmailAddress() {
		return txtEmailAddress;
	}

	public WebElement getTxtFirstName() {
		return txtFirstName;
	}

	public WebElement getTxtLastName() {
		return txtLastName;
	}

	public WebElement getClickPhoneType() {
		return clickPhoneType;
	}

	public WebElement getClickMobile() {
		return clickMobile;
	}

	public WebElement getTxtPhnNo() {
		return txtPhnNo;
	}

	public WebElement getClickSocialNetwork() {
		return clickSocialNetwork;
	}

	public WebElement getClickFaceBook() {
		return clickFaceBook;
	}

	public WebElement getTxtURL() {
		return txtURL;
	}

	public WebElement getClickReportingManager() {
		return clickReportingManager;
	}

	public WebElement getClickHimselfHerself() {
		return clickHimselfHerself;
	}

	public WebElement getClickAccessRole() {
		return clickAccessRole;
	}

	public WebElement getClickProfileAdmin() {
		return clickProfileAdmin;
	}

	public WebElement getClickCreate() {
		return clickCreate;
	}
			
    

}
