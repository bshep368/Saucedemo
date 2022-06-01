package com.SauceDemo1.TestClasses;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.SauceDemo.Utility.ScreenShotClass;
import com.SauceDemo1.POMClasses.HomePagePOMClass1;

public class TC02LogoutFunctionalityTestClass extends TestBaseClass //Inheritance oop's concept is used here  TestClass is a subclass which acquires the Properties of TestBaseClass (Superclass)  
{
@Test	
//@Test(priority=2,timeOut=2000,invocationCount=2)
public void logOutFunctionality() throws IOException
{
	HomePagePOMClass1 hp=new HomePagePOMClass1(driver);
	//homePage
    hp.clickMenuButton();
    log.info("Clicked on menu button");
    ScreenShotClass.Screenshot(driver);
    log.info("Home page -Logout page Screenshot");
    hp.clickLogoutButton();
    log.info("Clicked on logout button");    
    log.info("apply validation");   
    String expectedUrl = "https://www.saucedemo.com/";
    String actualUrl = driver.getCurrentUrl();
    System.out.println(actualUrl);
//Hard Assert
 Assert.assertEquals(actualUrl,expectedUrl);  //Take Always first actualUrl 

}	
}
	

