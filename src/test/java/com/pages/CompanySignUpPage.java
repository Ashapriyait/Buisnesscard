package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class CompanySignUpPage extends BaseClass {
	public CompanySignUpPage() {
		PageFactory.initElements(driver, this);
	}
	
 @FindBy(xpath="//button[text()=' Back ']")
 private WebElement backBtnClick;
 
 @FindBy(xpath="//span[text()='Sign up here']")
	private WebElement clickSignUpHere;
 
 @FindBy(id="company")
	private  WebElement ratiobtnClick;
 
 @FindBy(id="firstname")
	private WebElement txtFirstName;
	
 @FindBy(id="lastname")
	private WebElement txtLastName;
	
 @FindBy(id="email1")
	private WebElement txtEmail;
	
 @FindBy(id="pass1")
	private WebElement txtNewPassword;
	
 @FindBy(id="new")
	private WebElement txtConfirmPassword;
	
 @FindBy(name="myagreement")
	private WebElement checkboxClick;
	
 @FindBy(xpath="//button[text()='Sign up']")
	private WebElement signUpbtnClick;
	
 @FindBy(xpath="//button[text()='Yes']")
	private WebElement emailbtnClick;
 
 @FindBy(xpath="//h1[text()=' Welcome ']")
	private WebElement message;


public WebElement getMessage() {
	return message;
}

public WebElement getBackBtnClick() {
	return backBtnClick;
}

public WebElement getClickSignUpHere() {
	return clickSignUpHere;
}


@FindBy(xpath="//i[@class=\"pi pi-camera blue_circle\"]")
private WebElement clickCameraIcon;


public WebElement getClickCameraIcon() {
	return clickCameraIcon;
}


public WebElement getRatiobtnClick() {
	return ratiobtnClick;
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

public WebElement getTxtNewPassword() {
	return txtNewPassword;
}

public WebElement getTxtConfirmPassword() {
	return txtConfirmPassword;
}

public WebElement getCheckboxClick() {
	return checkboxClick;
}

public WebElement getSignUpbtnClick() {
	return signUpbtnClick;
}

public WebElement getEmailbtnClick() {
	return emailbtnClick;
}
}
