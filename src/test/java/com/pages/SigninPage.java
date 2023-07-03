package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class SigninPage extends BaseClass{
	public SigninPage() {
		
		PageFactory.initElements(driver, this);
		
		
	}
	@FindBy(id="email")
	private WebElement txtemail;
	
	@FindBy(id="password")
	private WebElement txtPassword;
	
	@FindBy(name="rememberme")
	private WebElement checkboxClick;
	
	@FindBy(xpath="//button[text()='Sign In']")
	private WebElement btnClick;
	
	@FindBy(xpath="//h1[text()=' Welcome ']")
	private WebElement message;
	
	@FindBy(xpath="//i[@class='pi pi-ellipsis-h']")
	private WebElement clickThreeDots;
	
	@FindBy(xpath="//i[@class='pi pi-sign-out']")
	private WebElement clickSignOut;
	
	@FindBy(xpath="//h1[text()='Sign in to your account.']")
	private WebElement siginPageMessage;

	public WebElement getSiginPageMessage() {
		return siginPageMessage;
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

	

	
	


