package com.SauceDemo.Utility;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listener implements ITestListener
{
	WebDriver driver;
public  void onTestFailure(ITestResult result)	//ITestResult result ---> Bridge between the listeners and test class or test base class
{

	   System.out.println("Test case is failed and hence taking the screenshot"+result.getName());
        this.driver =((TC01LoginFunctionalityTestClass)result.getInstance()).driver;
	   
	   TakesScreenshot ts = (TakesScreenshot)driver;
	   File sourceFile =ts.getScreenshotAs(OutputType.FILE);	
	   File destFile = new File("./screenshot/SauceDemoLogin3105.jpg");	
	


public  void  onTestSucess(ITestResult result)	
{
	System.out.println("Test case is failed"+result.getStatus());	
}
public  void  onTestFinish(ITestResult result)	
{
	System.out.println("Test case is failed"+result.getTestName());	
}
	
}
