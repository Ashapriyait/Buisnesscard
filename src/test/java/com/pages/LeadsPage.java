package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class LeadsPage extends BaseClass {
	
	public LeadsPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//i[@class='pi pi-ellipsis-h']")
	private WebElement clickThreeDots;
	
	@FindBy(xpath="(//input[@class='ng-untouched ng-pristine ng-valid'])[3]")
	private WebElement clickCheckBox;
	
	@FindBy(id="ODButton")
	private WebElement clickOneDrive;
    
	@FindBy(xpath="//li[text()=' Microsoft Teams Chat Files ']")
	private WebElement clickMicrosoftChatFile;
	
	@FindBy(xpath="//button[text()='Save']")
	private WebElement clickSaveButton;
	
	@FindBy(xpath="//i[@class=\"pi pi-users\"]")
	private WebElement clickLeadIcon;
	
	@FindBy(xpath="//input[@class=\"form-control ltr_override input ext-input text-box ext-text-box\"]")
	private WebElement txtEmailPhoneorSkype;
	
	@FindBy(id="idSIButton9")
	private WebElement clickNext;
	
	@FindBy(id="okta-signin-username")
	private WebElement txtUsername;
	
	public WebElement getTxtEmailPhoneorSkype() {
		return txtEmailPhoneorSkype;
	}

	public WebElement getClickNext() {
		return clickNext;
	}

	public WebElement getTxtUsername() {
		return txtUsername;
	}

	public WebElement getTxtPassword() {
		return txtPassword;
	}

	public WebElement getClickRememberBox() {
		return clickRememberBox;
	}

	public WebElement getClickSignin() {
		return clickSignin;
	}

	@FindBy(id="okta-signin-password")
	private WebElement txtPassword;
	
	@FindBy(xpath="//label[text()='Remember me']")
	private WebElement clickRememberBox;
	
	@FindBy(id="okta-signin-submit")
	private WebElement clickSignin;
	
	@FindBy(xpath="//input[@class=\"button button-primary\"]")
	private WebElement clickSendPush;
	
	@FindBy(id="KmsiCheckboxField")
	private WebElement  DontshowthisagainCheckBox;
	
	@FindBy(id="idSIButton9")
	private WebElement clickYes;

	public WebElement getDontshowthisagainCheckBox() {
		return DontshowthisagainCheckBox;
	}

	public WebElement getClickYes() {
		return clickYes;
	}

	public WebElement getClickSendPush() {
		return clickSendPush;
	}

	public WebElement getClickLeadIcon() {
		return clickLeadIcon;
	}

	public WebElement getClickThreeDots() {
		return clickThreeDots;
	}

	public WebElement getClickCheckBox() {
		return clickCheckBox;
	}

	public WebElement getClickOneDrive() {
		return clickOneDrive;
	}

	public WebElement getClickMicrosoftChatFile() {
		return clickMicrosoftChatFile;
	}

	public WebElement getClickSaveButton() {
		return clickSaveButton;
	}
	
	
}
