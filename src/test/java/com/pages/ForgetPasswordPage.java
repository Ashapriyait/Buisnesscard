package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class ForgetPasswordPage extends BaseClass{
	public ForgetPasswordPage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//a[text()='Forgot password?']")
	private WebElement clickForgetPassword;
	
	@FindBy(id="emailAddress")
	private WebElement txtEmailAddress;
	
	@FindBy(xpath="//button[text()='Reset Password']")
	private WebElement clickResetPassword;
	
	@FindBy(id="email")
	private WebElement txtEmail;
	
	@FindBy(id="password")
	private WebElement txtResettedPassword;

	public WebElement getTxtEmail() {
		return txtEmail;
	}

	public WebElement getTxtResettedPassword() {
		return txtResettedPassword;
	}

	public WebElement getClickForgetPassword() {
		return clickForgetPassword;
	}

	public WebElement getTxtEmailAddress() {
		return txtEmailAddress;
	}

	public WebElement getClickResetPassword() {
		return clickResetPassword;
	}
	
	

}
