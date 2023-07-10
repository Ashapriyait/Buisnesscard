package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class SystemPreferencePage extends BaseClass {

	public SystemPreferencePage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="preferencebtn")
	private WebElement clickSystemPreferences;
	
	@FindBy(id="companyName")
	private WebElement txtCompanyName;
	
	@FindBy(id="email")
	private WebElement txtCompanyWebsite;
	
	@FindBy(id="address")
	private WebElement txtAddress;
	
	@FindBy(id="country")
	private WebElement clickCountry;
	
	@FindBy(xpath="//span[text()=' Albania ']")
	private WebElement clickAlbania;
	
	@FindBy(id="mat-select-value-3")
	private WebElement clickState;
	
	@FindBy(xpath="(//span[@class=\"mat-option-text\"])[1]")
	private WebElement clickBeratCountry;
	
	@FindBy(xpath="//div[@class=\"mat-form-field-infix ng-tns-c67-20\"]")
	private WebElement clickCity;
	
	@FindBy(xpath="//span[text()='Birkhadem']")
	private WebElement clickBirkhadem;

	

	@FindBy(xpath="//span[text()='Aïn Defla']")
	private WebElement clickAinDefla;
	
	
	
	@FindBy(id="confirm")
	private WebElement txtZipcode;
	
	@FindBy(xpath="//button[text()='Update Details']")
	private WebElement clickUpdate;
	
	@FindBy(xpath="//button[text()=' Delete My Account ']")
	private WebElement clickDeleteMyAccount;
	
	@FindBy(id="delete")
	private WebElement txtDelete;
	
	@FindBy(xpath="(//button[text()='Delete'])[1]")
	private WebElement clickDelete;
	
	@FindBy(id="current")
	private WebElement txtCurrentPassword;
	
	@FindBy(id="new")
	private WebElement txtNewPassword;
	
	@FindBy(xpath="(//input[@id=\"new\"])[2]")
	private WebElement txtConfirmPassword;
	
	@FindBy(xpath="//button[text()='Change Password']")
	private WebElement clickChangePassword;
	

	public WebElement getTxtCurrentPassword() {
		return txtCurrentPassword;
	}

	public WebElement getTxtNewPassword() {
		return txtNewPassword;
	}

	public WebElement getTxtConfirmPassword() {
		return txtConfirmPassword;
	}

	public WebElement getClickChangePassword() {
		return clickChangePassword;
	}

	public WebElement getTxtDelete() {
		return txtDelete;
	}

	public WebElement getClickDelete() {
		return clickDelete;
	}

	public WebElement getClickDeleteMyAccount() {
		return clickDeleteMyAccount;
	}

	public WebElement getTxtCompanyName() {
		return txtCompanyName;
	}

	public WebElement getTxtCompanyWebsite() {
		return txtCompanyWebsite;
	}

	public WebElement getTxtAddress() {
		return txtAddress;
	}

	public WebElement getClickCountry() {
		return clickCountry;
	}

	public WebElement getClickAlbania() {
		return clickAlbania;
	}

	public WebElement getClickState() {
		return clickState;
	}
	public WebElement getClickBeratCountry() {
		return clickBeratCountry;
	}

	public WebElement getClickAinDefla() {
		return clickAinDefla;
	}

	public WebElement getTxtZipcode() {
		return txtZipcode;
	}
	public WebElement getClickCity() {
		return clickCity;
	}

	public WebElement getClickBirkhadem() {
		return clickBirkhadem;
	}

	public WebElement getClickUpdate() {
		return clickUpdate;
	}

	public WebElement getClickSystemPreferences() {
		return clickSystemPreferences;
	}
	
	

	


}
