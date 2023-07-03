package com.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class YujjCardHomePage extends BaseClass{
	 public YujjCardHomePage() {
		PageFactory.initElements(driver, this);
	}
	 
	
	@FindBy(id="number")
	private WebElement txtPhnNo;
	
	public WebElement getTxtPhnNo() {
		return txtPhnNo;
	}

    @FindBy(xpath="//button[text()='Save Contact']")
    private WebElement clickSavebutton;
    
    @FindBy(xpath="//i[@class='pi pi-home']")
    private WebElement clickHomePage;
    
    @FindBy(xpath="//button[text()='Company Directory']")
    private WebElement clickCompanyDirectory;
	
    @FindBy(xpath="//i[@class='pi pi-plus']")
	private WebElement clickAdd;
	
	
	@FindBy(id="mat-select-value-13")
	private WebElement clickPnType;
	
	public WebElement getClickCompanyDirectory() {
		return clickCompanyDirectory;
	}

	public WebElement getClickHomePage() {
		return clickHomePage;
	}

	public WebElement getClickSavebutton() {
		return clickSavebutton;
	}


	@FindBy(id="email")
	private WebElement txtemailId;
		
    @FindBy(id="password")
	private WebElement txtPassword1;
		
    @FindBy(name="rememberme")
	private WebElement checkboxClickbtn;
		
    @FindBy(xpath="//button[text()='Sign In']")
	private WebElement signBtnClick;
		
    @FindBy(xpath="//h1[text()=' Welcome ']")
    private WebElement welMessage;
		
	 
	@FindBy(id="clickcard")
	private WebElement clickCard;
	
	@FindBy(xpath="//i[@class='pi pi-user-edit']")
	private WebElement clickContactViewbtn;
	
	@FindBy(xpath="//button[text()=' Edit Contact ']")
	private WebElement clickEditContactbtn;
	
	@FindBy(id="firstName")
	private WebElement txtFirstName;
	
	@FindBy(id="lastName")
	private WebElement txtLastName;
	
	@FindBy(xpath="//button[text()=' Update']")
	private WebElement clickUpdatebtn;
	
	@FindBy(id="description")
	private WebElement bottomPage;
	

	public WebElement getClickAdd() {
		return clickAdd;
	}

	 
    public WebElement getClickPnType() {
		return clickPnType;
	}
    


	public WebElement getSignBtnClick() {
		return signBtnClick;
	}

	public WebElement getWelMessage() {
		return welMessage;
	}
	
	public WebElement getTxtemailId() {
		return txtemailId;
	}

	public WebElement getTxtPassword1() {
		return txtPassword1;
	}

	public WebElement getCheckboxClickbtn() {
		return checkboxClickbtn;
	}

	public WebElement getsignBtnClick() {
		return signBtnClick;
	}

	public WebElement getWelmessage() {
		return welMessage;
	}

	public WebElement getBottomPage() {
		return bottomPage;
	}

	public WebElement getClickCard() {
		return clickCard;
	}

	public WebElement getClickContactViewbtn() {
		return clickContactViewbtn;
	}

	public WebElement getClickEditContactbtn() {
		return clickEditContactbtn;
	}

	public WebElement getTxtFirstName() {
		return txtFirstName;
	}

	public WebElement getTxtLastName() {
		return txtLastName;
	}

	public WebElement getClickUpdatebtn() {
		return clickUpdatebtn;
	}
	
	
	
	
	public void elementClickJs(WebElement element) {
		JavascriptExecutor executor=(JavascriptExecutor) driver;
		executor.executeScript("argument[0].click()",element);		
	}
	
			

}
