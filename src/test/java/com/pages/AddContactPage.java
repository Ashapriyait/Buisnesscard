package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class AddContactPage extends BaseClass {
	public AddContactPage() {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//i[@class='pi pi-angle-double-left']")
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
	
	@FindBy(xpath="(//button[@class='CallBtn'])[13]")
	private WebElement clickRingCentralbtn;
	
	@FindBy(xpath="(//button[@class='CallBtn'])[15]")
	private WebElement clickCallLogo;
	
	@FindBy(xpath="(//button[@class='CallBtn'])[14]")
	private WebElement clickTeamsLogo;
	
	@FindBy(xpath="//li[text()='7010203254']")
	private WebElement clickCallPhnNo;
	
	public WebElement getClickCallPhnNo() {
		return clickCallPhnNo;
	}

	public WebElement getClickTeamsLogo() {
		return clickTeamsLogo;
	}

	public WebElement getClickCallLogo() {
		return clickCallLogo;
	}

	@FindBy(xpath="//li[text()='7010203254']")
	private WebElement clickPhnNo;
	
	@FindBy(xpath="//span[text()=' Profile Viewer ']")
	private WebElement clickProfileViewer;

	public WebElement getClickProfileViewer() {
		return clickProfileViewer;
	}

	public WebElement getClickPhnNo() {
		return clickPhnNo;
	}

	public WebElement getClickRingCentralbtn() {
		return clickRingCentralbtn;
	}

	public WebDriver getDriver() {
		return driver;
	}

	//public PageObjectManager getPomYujj() {
	//	return getPomYujj();
	//}

	

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
