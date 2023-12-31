package com.runner;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.report.Reporting;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\Ashapriya_PTS\\eclipse-workspace\\Yujj\\src\\test\\resources\\Features",
dryRun=false,
glue="com.stepdefinition",
tags="@UserRegisterCameraIcon",
stepNotifications=true,
plugin= {"json:src/test/resorces/Yujj/Yujj.json"}
)



public class TestRunnerClass {
	@AfterClass
	public static void afterClass() throws FileNotFoundException, IOException  {
		Reporting.generateJVMReport("C:\\Users\\Ashapriya_PTS\\eclipse-workspace\\Yujj\\target\\output.json");
		
	}

}
