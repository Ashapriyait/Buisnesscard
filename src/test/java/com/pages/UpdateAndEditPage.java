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
 
 @FindBy(id="mat-select-value-1")
 private WebElement clickPhoneType;
 
 @FindBy(xpath="//span[text()=' Mobile ']")
 private WebElement clickMobile;
 
 @FindBy(id="number")
 private WebElement txtPhnNo;
 
 @FindBy(xpath="(//button[@class='flex justify-content-between p-button'])[1]")
 private WebElement clickSocialNetworkURL;
 
 @FindBy(id="mat-select-value-5")
 private WebElement clickSocialNetwork;
 
 @FindBy(xpath="//span[text()=' Instagram']")
 private WebElement clickInstagram;
 
 @FindBy(id="url")
 private WebElement txtURL;
 
 @FindBy(xpath="//button[text()=' Update']")
 private WebElement clickUpdate;

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

public WebElement getClickMobile() {
	return clickMobile;
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