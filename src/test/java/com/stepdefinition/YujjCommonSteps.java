package com.stepdefinition;

import java.io.FileNotFoundException;
import java.io.IOException;

import com.base.BaseClass;

import io.cucumber.java.en.Given;

public class YujjCommonSteps extends BaseClass{

	@Given("user is on Yujj SignIn page")
	public void user_is_on_yujj_sign_in_page() throws  FileNotFoundException, IOException {
		
		getDriverType(getPropertyFileValue("browser"));
        enterUrl(getPropertyFileValue("url"));
        maximizeWindow();
		
		
	}
	
	
	
}
