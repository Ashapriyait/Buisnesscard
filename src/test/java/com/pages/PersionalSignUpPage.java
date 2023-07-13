package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class PersionalSignUpPage extends BaseClass{
	public PersionalSignUpPage() {
		PageFactory.initElements(driver, this);
		
	}
	
	
	
	
	@FindBy(xpath="//span[text()='Sign up here']")
	private WebElement clickSignUpHere;
	
	@FindBy(id="toast-container")
	private WebElement actEnterAllFields;

	@FindBy(id="personal")
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
	
	@FindBy(xpath="//div[text()=' Password did not match or password did not match pattern ']")
	private WebElement actPassworddidnotmatch;
	
	@FindBy(xpath="//h2[@class=\"contactname\"]")
	private WebElement actName;
	
	@FindBy(xpath="//button[text()=' Back ' ]")
	private WebElement clickBackbutton;

	
	public WebElement getClickBackbutton() {
		return clickBackbutton;
	}

	public WebElement getActName() {
		return actName;
	}

	public WebElement getActPassworddidnotmatch() {
		return actPassworddidnotmatch;
	}

	public WebElement getActEnterAllFields() {
		return actEnterAllFields;
	}

	public WebElement getClickSignUpHere() {
		return clickSignUpHere;
	}
	
	public WebElement getEmailbtnClick() {
		return emailbtnClick;
	}

	public WebElement getMessage() {
		return message;
	}

	public WebElement getSignUpbtnClick() {
		return signUpbtnClick;
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

	public WebElement getBtnClick() {
		return emailbtnClick;
	}
	
	
	
	

}
