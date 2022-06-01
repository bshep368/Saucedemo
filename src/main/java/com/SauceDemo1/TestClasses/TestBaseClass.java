package com.SauceDemo1.TestClasses;

import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import com.SauceDemo.Utility.ScreenShotClass;
import com.SauceDemo1.POMClasses.LoginPagePOMClass1;

@Listeners(com.SauceDemo.Utility.Listener.class)
public class TestBaseClass
{
WebDriver driver;
Logger log=Logger.getLogger("SauceDemo1Project");
@Parameters("browserName")
@BeforeMethod
public void setUP(String browserName ) throws IOException
{
	if(browserName.equals("chrome"))
	{
		//pre-conditions & Post conditions code (BeforeMethod & AfterMethod)is maintained are used in testBaseClass
	System.setProperty("webdriver.chrome.driver",
	"./drivers/chromedriver.exe");
	driver=new ChromeDriver();
	 }
	else 
	{
	System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
	driver=new FirefoxDriver();
  	}
	
	log.info("Browser is opned");   //This is called log 
	PropertyConfigurator.configure("log4j.properties");
	driver.manage().window().maximize();
	log.info("Browser is Maximised");
	driver.get("https://www.saucedemo.com");
	log.info("URL is opened");
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS); //implicit wait
	//Login Page related detailed & Logout i.e pre-conditions & Post conditions code (BeforeMethod & AfterMethod)is maintained are used in testBaseClass
    //Page is Login 
	LoginPagePOMClass1 lp=new LoginPagePOMClass1(driver);	
	lp.LoginDetail();
	log.info("Home page is displyed");
    ScreenShotClass.Screenshot(driver);
}

 @AfterMethod
 public void tearDown()
{
	//Logout ---Browser closed 
	
    driver.quit();
   log.info("End of program");
}	
}
