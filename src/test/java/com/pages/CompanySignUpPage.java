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
	private  WebElement clickRatiobtn;
 
 @FindBy(id="firstname")
	private WebElement txtFirstName;
	
 @FindBy(id="lastname")
	private WebElement txtLastName;
	
 @FindBy(id="email1")
	private WebElement txtEmail;

 @FindBy(id="email")
	private WebElement txtUseremail;
 
 

@FindBy(id="password")
    private WebElement txtUserPassword;
	
 

@FindBy(id="pass1")
	private WebElement txtNewPassword;
	
 @FindBy(id="new")
	private WebElement txtConfirmPassword;
	
 @FindBy(xpath="//span[@class=\"mat-checkbox-inner-container mat-checkbox-inner-container-no-side-margin\"]")
	private WebElement clickCheckBox;
	
 @FindBy(xpath="//button[text()='Sign up']")
	private WebElement signUpbtnClick;
	
 @FindBy(xpath="//button[text()='Yes']")
	private WebElement emailbtnClick;
 
 @FindBy(xpath="//h1[text()=' Welcome ']")
	private WebElement message;
 
 @FindBy(xpath="//i[@class=\"pi pi-camera blue_circle\"]")
 private WebElement clickCameraIcon;
 
 @FindBy(xpath="//h2[text()='AR R']")
 private WebElement actCardName;
 
 @FindBy(xpath="//input[@id='photo']")
 private WebElement fileUpload;
 
 @FindBy(xpath="//div[@id='toast-container']")
 private WebElement actSuccessUpload;
 
 @FindBy(xpath="//div[text()='Email already exists, Please try a different one'")
 private WebElement actErrorMsg;
 
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

	

	@FindBy(xpath="//span[text()='A�n Defla']")
	private WebElement clickAinDefla;
	
	@FindBy(id="confirm")
	private WebElement txtZipcode;
	
	@FindBy(xpath=" //div[@class=\"filed col-12\"]")
	private WebElement clickCreateBtn;
	
	@FindBy(xpath="//h1[text()='Create Company']")
	private WebElement actCreateCompany;
	
	@FindBy(id="address")
	private WebElement txtCompanyAddress;
 
 public WebElement getTxtCompanyAddress() {
		return txtCompanyAddress;
	}

public WebElement getActCreateCompany() {
		return actCreateCompany;
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

	public WebElement getClickCity() {
		return clickCity;
	}

	public WebElement getClickBirkhadem() {
		return clickBirkhadem;
	}

	public WebElement getClickAinDefla() {
		return clickAinDefla;
	}

	public WebElement getTxtZipcode() {
		return txtZipcode;
	}

	public WebElement getClickCreateBtn() {
		return clickCreateBtn;
	}

public WebElement getActErrorMsg() {
	return actErrorMsg;
}

public WebElement getActSuccessUpload() {
	return actSuccessUpload;
}

public WebElement getTxtUserPassword() {
	return txtUserPassword;
}

public WebElement getFileUpload() {
	return fileUpload;
}

public WebElement getTxtUseremail() {
		return txtUseremail;
	}
 
 public WebElement getActCardName() {
	return actCardName;
}


public WebElement getTxtPassword() {
		return txtUserPassword;
	}


public WebElement getMessage() {
	return message;
}

public WebElement getBackBtnClick() {
	return backBtnClick;
}

public WebElement getClickSignUpHere() {
	return clickSignUpHere;
}


public WebElement getClickCameraIcon() {
	return clickCameraIcon;
}


public WebElement getRatiobtnClick() {
	return clickRatiobtn;
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



public WebElement getClickRatiobtn() {
	return clickRatiobtn;
}

public WebElement getClickCheckBox() {
	return clickCheckBox;
}

public WebElement getSignUpbtnClick() {
	return signUpbtnClick;
}

public WebElement getEmailbtnClick() {
	return emailbtnClick;
}
}
