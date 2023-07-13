package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class LeadsPage extends BaseClass {
	
	public LeadsPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//i[@class=\"pi pi-user-plus\"]")
	private WebElement clickAddLead;
	
	@FindBy(id="firstName")
	private WebElement txtFirstName;
	
	@FindBy(id="lastName")
	private WebElement txtLastName;
	
	@FindBy(id="email")
	private WebElement txtEmail;
	
	@FindBy(id="phoneNumber")
	private WebElement txtPhoneNumber;
	
	@FindBy(id="companyName")
	private WebElement txtCompanyName;
	
	@FindBy(id="address")
	private WebElement txtAddress;
	
	
	
	

	public WebElement getClickAddLead() {
		return clickAddLead;
	}

	public WebElement getTxtFirstName() {
		return txtFirstName;
	}

	public WebElement getTxtLastName() {
		return txtLastName;
	}

	public WebElement getTxtEmail() {
		return txtEmail;
	}

	public WebElement getTxtPhoneNumber() {
		return txtPhoneNumber;
	}

	public WebElement getTxtCompanyName() {
		return txtCompanyName;
	}

	public WebElement getTxtAddress() {
		return txtAddress;
	}

	@FindBy(xpath="//i[@class=\"pi pi-ellipsis-h\"]")
	private WebElement clickThreeDots;
	
	@FindBy(xpath="(//input[@class='ng-untouched ng-pristine ng-valid'])[3]")
	private WebElement clickCheckBox;
	
	@FindBy(id="ODButton")
	private WebElement clickOneDrive;
    
	@FindBy(xpath="//li[text()=' Microsoft Teams Chat Files ']")
	private WebElement clickMicrosoftChatFile;
	
	@FindBy(xpath="(//button[@class=\"saveLead\"])[1]")
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
	
	
	@FindBy(id="OLImage")
    private WebElement clickOutlookLogo;
	
	@FindBy(id="HSButton")
	private WebElement clickHubSpotLogo;
	
	@FindBy(xpath="//a[@class=\"private-link uiLinkWithoutUnderline m-left-1 uiLinkDark\"]")
	private WebElement clickSignUp;
	
	@FindBy(xpath="//div[@class=\"OAuthButtonstyles__StyledOAuthText-s3vtc6-3 hVvzpb\"]")
	private WebElement clickSignupMicroSoft;
	
	@FindBy(id="username")
	private WebElement txtHubUsername;
	
	@FindBy(id="password")
	private WebElement txtHubPassword;
	
	@FindBy(xpath="//span[@class=\"UICheckbox__PrivateCheckboxIcon-sc-26rvey-4 hWCrXM private-checkbox__dash\"]")
	private WebElement clickHubRememberBox;
	
	@FindBy(id="loginBtn")
	private WebElement clickLogin;
	
	@FindBy(id="code")
	private WebElement txtCode;
	
	@FindBy(xpath="//button[@class=\"uiButton private-button private-button--primary private-button--default width-100 login-submit private-button--non-link\"]")
	private WebElement clickHubspotLogin;
	
	@FindBy(xpath="(//input[@class='ng-untouched ng-pristine ng-valid'])[2]")
	private WebElement clickSecondCheckBox;
	
	
	@FindBy(xpath="(//input[@class='ng-untouched ng-pristine ng-valid'])[3]")
	private WebElement clickThreadCheckBox;
	
	public WebElement getClickSecondCheckBox() {
		return clickSecondCheckBox;
	}

	public WebElement getClickThreadCheckBox() {
		return clickThreadCheckBox;
	}

	public WebElement getClickHubspotLogin() {
		return clickHubspotLogin;
	}

	public WebElement getTxtCode() {
		return txtCode;
	}

	public WebElement getTxtHubUsername() {
		return txtHubUsername;
	}

	public WebElement getTxtHubPassword() {
		return txtHubPassword;
	}

	public WebElement getClickHubRememberBox() {
		return clickHubRememberBox;
	}

	public WebElement getClickLogin() {
		return clickLogin;
	}

	public WebElement getClickSignupMicroSoft() {
		return clickSignupMicroSoft;
	}

	public WebElement getClickSignUp() {
		return clickSignUp;
	}

	public WebElement getClickHubSpotLogo() {
		return clickHubSpotLogo;
	}

	public WebElement getClickOutlookLogo() {
		return clickOutlookLogo;
	}

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
