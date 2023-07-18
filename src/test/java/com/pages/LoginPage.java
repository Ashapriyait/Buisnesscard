package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class LoginPage extends BaseClass{
	public LoginPage() {
		
		PageFactory.initElements(driver, this);
		
		
	}
	@FindBy(id="email")
	private WebElement txtemail;
	
	@FindBy(id="password")
	private WebElement txtPassword;
	
	@FindBy(xpath="//h2[@class=\"contactname\"]")
	private WebElement actCardName;
	
	
	@FindBy(name="rememberme")
	private WebElement checkboxClick;
	
	@FindBy(xpath="//button[text()='Sign In']")
	private WebElement btnClick;
	
	@FindBy(xpath="//h1[text()=' Welcome ']")
	private WebElement actmessage;
	
	@FindBy(xpath="//div[@class=\"alert alert-danger text-center ng-star-inserted\"]")
	private WebElement actErrorEmail;
	
	
	
	@FindBy(xpath="//i[@class='pi pi-ellipsis-h']")
	private WebElement clickThreeDots;
	
	@FindBy(xpath="//i[@class='pi pi-sign-out']")
	private WebElement clickSignOut;
	
	@FindBy(xpath="//h1[text()='Sign in to your account.']")
	private WebElement ActsiginPageMessage;
	
	@FindBy(xpath="//mat-icon[text()='visibility_off']")
	private WebElement clickEyeIconElement;
	
	@FindBy(xpath=" //div[text()=' Unable to login. Please try again ']")
	private WebElement actAnabletoLoginMessagElement;
	
	public WebElement getActErrorEmail() {
		return actErrorEmail;
	}
	
	public WebElement getActAnabletoLoginMessagElement() {
		return actAnabletoLoginMessagElement;
	}

	public WebElement getActsiginPageMessage() {
		return ActsiginPageMessage;
	}

	public WebElement getClickEyeIconElement() {
		return clickEyeIconElement;
	}

	public WebElement getActCardName() {
		return actCardName;
	}
	
	public WebElement getActSiginPageMessage() {
		return ActsiginPageMessage;
	}

	public WebElement getClickThreeDots() {
		return clickThreeDots;
	}

	public WebElement getClickSignOut() {
		return clickSignOut;
	}

	public WebElement getTxtemail() {
		return txtemail;
	}

	public WebElement getTxtPassword() {
		return txtPassword;
	}

	public WebElement getCheckboxClick() {
		return checkboxClick;
	}

	public WebElement getBtnClick() {
		return btnClick;
	}

	public WebElement getMessage() {
		return actmessage;
	}
	
}

	

	
	


