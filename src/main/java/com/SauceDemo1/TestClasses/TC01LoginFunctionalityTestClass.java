package com.SauceDemo1.TestClasses;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.SauceDemo.Utility.ScreenShotClass;
import com.SauceDemo1.POMClasses.HomePagePOMClass1;
import com.SauceDemo1.POMClasses.LoginPagePOMClass1;

public class TC01LoginFunctionalityTestClass  extends TestBaseClass ////Inheritance oop's concept is used here  TestClass is a subclass which acquires the Properties of TestBaseClass (Superclass)  i.e parent class
{
	
	//Only Test cases implement in test class

 
  @Test
//  @Test(priority=0,invocationCount=2,timeOut=2000)
	public void LoginPagetest() throws IOException
	 {
	String expectedTitle = "Labs";
	String actualTitle = driver.getTitle();
    System.out.println(actualTitle);
//	ScreenShotClass.Screenshot(driver);
	log.info("Login page Scrrenshot");
//  Hard Assert
//	Hard Assert-it used when two test cases are depends one each other,if 1 test case get failed another will not be execute
//	Assert class is used with the assertEquals. methods are static so it needs to  call with class( Assert class) 	 
	Assert.assertEquals(actualTitle,expectedTitle);  //Take Always first actualUrl 	
	//Logout test
	HomePagePOMClass1 hp=new HomePagePOMClass1(driver);
	hp.clickMenuButton();
    log.info("clicked on MenuButton");
    hp.clickLogoutButton();
    log.info("Clicked on Logout button");  
	 }	
}

