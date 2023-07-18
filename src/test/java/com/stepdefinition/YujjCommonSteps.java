package com.stepdefinition;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import com.base.BaseClass;

import io.cucumber.java.en.Given;
import io.github.bonigarcia.wdm.WebDriverManager;

public class YujjCommonSteps extends BaseClass{

	@Given("user is on Yujj SignIn page")
	public void user_is_on_yujj_sign_in_page() throws  FileNotFoundException, IOException {
		WebDriverManager.chromedriver().setup(); 
		driver = new ChromeDriver();
        enterUrl(getPropertyFileValue("url"));
         maximizeWindow();
}
	
	
	
}
