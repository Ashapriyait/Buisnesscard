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
	private WebElement message;
	
	@FindBy(xpath="//div[@class=\"alert alert-danger text-center ng-star-inserted\"]")
	private WebElement actErrorEmail;
	
	
	public WebElement getActErrorEmail() {
		return actErrorEmail;
	}
	@FindBy(xpath="//i[@class='pi pi-ellipsis-h']")
	private WebElement clickThreeDots;
	
	@FindBy(xpath="//i[@class='pi pi-sign-out']")
	private WebElement clickSignOut;
	
	@FindBy(xpath="//h1[text()='Sign in to your account.']")
	private WebElement ActsiginPageMessage;
	
	
	
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
		return message;
	}
	
}

	

	
	

