package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class CompanyDirectoryPage extends BaseClass{
	
	public CompanyDirectoryPage() {
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="(//button[@class=\"button ng-star-inserted\"])[2]")
	private WebElement clickCompanyDirectory;
	
	@FindBy(xpath="(//button[@class=\"CallBtn\"])[13]")
	private WebElement clickRinCentral;
	
	@FindBy(xpath="//li[@class=\"button ng-star-inserted\"]")
	private WebElement clickNumber;
	
	@FindBy(xpath="(//button[@class=\"CallBtn\"])[14]")
	private WebElement clickTeams;
	
	@FindBy(xpath="(//button[@class=\"CallBtn\"])[15]")
	private WebElement clickCallLogo;
	
	@FindBy(xpath="//li[@class=\"button ng-star-inserted\"]")
	private WebElement clickCallNumber;

	public WebElement getClickCallLogo() {
		return clickCallLogo;
	}

	public WebElement getClickCallNumber() {
		return clickCallNumber;
	}

	public WebElement getClickTeams() {
		return clickTeams;
	}

	public WebElement getClickNumber() {
		return clickNumber;
	}

	public WebElement getClickCompanyDirectory() {
		return clickCompanyDirectory;
	}

	public WebElement getClickRinCentral() {
		return clickRinCentral;
	}
	
	

}
