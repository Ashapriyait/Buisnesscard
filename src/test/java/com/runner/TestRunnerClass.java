package com.runner;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.base.BaseClass;
import com.report.Reporting;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\Ashapriya_PTS\\New Yujj\\YUJJCard\\src\\test\\resources\\Features",
dryRun=false,
glue="com.stepdefinition",
tags="@Regression",
stepNotifications=true,
monochrome=true,
snippets=SnippetType.CAMELCASE,
plugin= {"pretty","json:target//index.json"}
)




public class TestRunnerClass extends BaseClass {
	@AfterClass
	public static void afterClass() throws FileNotFoundException, IOException  {
		Reporting.generateJVMReport(getProjectPath()+getPropertyFileValue("jsonPath"));
		
	}

}



