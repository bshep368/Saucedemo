package com.SauceDemo1.TestClasses;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.SauceDemo.Utility.ScreenShotClass;
import com.SauceDemo1.POMClasses.HomePagePOMClass1;
import com.SauceDemo1.POMClasses.LoginPagePOMClass1;
@Listeners(com.SauceDemo.Utility.Listener.class)
public class TestSuitClass2 extends ScreenShotClass
{
	WebDriver driver;
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

//	    System.out.println("Browser is opned");   //This is called log 
//		driver.manage().window().maximize();
//		System.out.println("Browser is Maximised");
//		driver.get("https://www.saucedemo.com");
//		System.out.println("URL is opned");
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30)); //implicit wait
//		//Login Page related detailed & Logout i.e pre-conditions & Post conditions code (BeforeMethod & AfterMethod)is maintained are used in testBaseClass
//	    //Page is Login 
//		LoginPagePOMClass1 lp=new LoginPagePOMClass1(driver);	
//		lp.LoginDetail();
//	    System.out.println("Home is displyed");
//	    ScreenShotClass.Screenshot(driver);
//	}
//	
//	   //Only Test cases implement in test class
//	   @Test
//		public void LoginPagetest() throws IOException
//		 {
//		String expectedTitle = "Swag Labs";
//		String actualTitle = driver.getTitle();
//	    System.out.println(actualTitle);
//	    //Hard Assert
//		//Hard Assert-it used when two test cases are depends one each other,if 1 test case get failed another will not be execute
//		//Assert class is used with the assertEquals. methods are static so it needs to  call with class( Assert class) 	 
//		Assert.assertEquals(actualTitle,expectedTitle);  //Take Always first actualUrl 
//		ScreenShotClass.Screenshot(driver);
//		 }	
//		@Test
//	     public  void SingleProductAddTOcart() throws IOException
//		 {
//		 HomePagePOMClass1 hp=new HomePagePOMClass1(driver);
//		 hp.clickAddToCart();
//		 System.out.println("product is added to cart");	
//		 System.out.println("Apply the validation");
//			
//		 String Actualresult=hp.getTextFromCartBasketButton();
//		 System.out.println(Actualresult);
//		 String Expresult="1";	
//		 Assert.assertEquals(Actualresult, Expresult);
//		 ScreenShotClass.Screenshot(driver);
//		 }
		
//		@Test(priority=2,invocationCount=1)	
//		 public  void MultipleProductAddTOcart() throws InterruptedException, IOException
//		 {
//		 HomePagePOMClass1 hp=new HomePagePOMClass1(driver);
//		 Thread.sleep(2000);
//		 hp.clickAddToCart();
//		 System.out.println("product is added to cart");	
//		 System.out.println("Apply the validation");
//		 ScreenShotClass.Screenshot(driver);
//		 System.out.println("MultipleProduct add to cart ScreenShoot is taken");
//		 String Actualresult =hp.getTextFromCartBasketButton();
//		 System.out.println(Actualresult);
//		 String Expresult="6";	
//		 }
//		 @Test(priority=3,invocationCount=1)
//		 public void logOutFunctionality() throws InterruptedException, IOException
//		 {
//		 HomePagePOMClass1 hp=new HomePagePOMClass1(driver);
//			//homePage
//		 hp.clickMenuButton();
//		 System.out.println("Clicked on menu button");
//		 ScreenShotClass.Screenshot(driver);
//		 hp.clickLogoutButton();
//		 System.out.println("Clicked on logout button");		     
//		 System.out.println("apply validation");			    
//		 String expectedUrl = "https://www.saucedemo.com/";
//		 String actualUrl = driver.getCurrentUrl();
//		 System.out.println(actualUrl);
//		 //Soft Assert
//		 SoftAssert soft =new SoftAssert();
//		 soft.assertEquals(actualUrl, expectedUrl);
//		 soft.assertAll();
//		 }
//		 hp.clickMenuButton();
//		 System.out.println("Clicked on menu button");
//	     Thread.sleep(4000);
//		 hp.clickLogoutButton();
//		 System.out.println("Clicked on Logout button");
//		 }	
//		 @AfterMethod
//		 public void tearDown()
//		 {
//		 //Logout ---Browser closed 
//			
//		 driver.quit();
//		 System.out.println("Browser is closed");
//		 System.out.println("End of program");
//	     }	

    }
}