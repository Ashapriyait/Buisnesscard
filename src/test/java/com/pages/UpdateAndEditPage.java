package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class UpdateAndEditPage extends BaseClass{
	 public UpdateAndEditPage() {
		PageFactory.initElements(driver, this);
	}
 @FindBy(xpath="//i[@class='pi pi-angle-double-left']")
 private WebElement clickNotification;	 
 
 @FindBy(xpath="//i[@class='admnn pi pi-building']")
 private WebElement clickCompanyAdminProfile;
 
 @FindBy(xpath="(//i[@class='pi pi-user-edit'])[2]")
 private WebElement clickViewBtn;
 
 @FindBy(xpath="//button[text()=' Edit Contact ']")
 private WebElement clickEditBtn;
 
 @FindBy(id="firstName")
 private WebElement txtFirstName;
 
 @FindBy(id="lastName")
 private WebElement txtLastName;
 
 @FindBy(xpath="(//button[@class='flex justify-content-between p-button'])[1]")
 private WebElement clickAddPhnType;
 
 @FindBy(id="mat-select-value-11")
 private WebElement clickPhoneType;
 
 @FindBy(xpath="(//span[@class=\"mat-option-text\"])[3]")
 private WebElement clickWork;
 
 
 @FindBy(xpath="//div[@class=\"mat-form-field-infix ng-tns-c67-39\"]//input[@id=\"number\"]")
 private WebElement txtPhnNo;
 
 @FindBy(xpath="(//button[@class=\"flex justify-content-between p-button\"])[5]//i[@class='pi pi-plus']")
 private WebElement clickSocialNetworkURL;
 
 @FindBy(xpath="//div[@class=\"mat-form-field-infix ng-tns-c67-40\"]")
 private WebElement clickSocialNetwork;
 
 @FindBy(xpath="//span[text()=' Instagram']")
 private WebElement clickInstagram;

 @FindBy(xpath="//span[@class=\"mat-form-field-label-wrapper ng-tns-c67-42\"]")
 private WebElement txtURL;
 
 @FindBy(xpath="//button[text()=' Update']")
 private WebElement clickUpdate;
 
 @FindBy(id="mat-select-value-9")
 private WebElement clickAccessRole;
 
 @FindBy(xpath="//span[text()=' Profile Viewer ']")
 private WebElement clickProfileViewer;
 
 @FindBy(xpath="(//span[text()='Activate'])[1]")
 private WebElement clickActivate;

public WebElement getClickActivate() {
	return clickActivate;
}

public WebElement getClickProfileViewer() {
	return clickProfileViewer;
}

public WebElement getClickAccessRole() {
	return clickAccessRole;
}

public WebElement getClickNotification() {
	return clickNotification;
}

public WebElement getClickCompanyAdminProfile() {
	return clickCompanyAdminProfile;
}

public WebElement getClickViewBtn() {
	return clickViewBtn;
}

public WebElement getClickEditBtn() {
	return clickEditBtn;
}

public WebElement getTxtFirstName() {
	return txtFirstName;
}

public WebElement getTxtLastName() {
	return txtLastName;
}

public WebElement getClickAddPhnType() {
	return clickAddPhnType;
}

public WebElement getClickPhoneType() {
	return clickPhoneType;
}

public WebElement getClickWork() {
	return clickWork;
}

public WebElement getTxtPhnNo() {
	return txtPhnNo;
}

public WebElement getClickSocialNetworkURL() {
	return clickSocialNetworkURL;
}

public WebElement getClickSocialNetwork() {
	return clickSocialNetwork;
}

public WebElement getClickInstagram() {
	return clickInstagram;
}

public WebElement getTxtURL() {
	return txtURL;
}

public WebElement getClickUpdate() {
	return clickUpdate;
}
 
	
}