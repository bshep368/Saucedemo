package com.SauceDemo1.TestClasses;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.SauceDemo.Utility.ScreenShotClass;
import com.SauceDemo1.POMClasses.HomePagePOMClass1;

public class TC04MultipleProductAddToCartFunctionality  extends TestBaseClass
{
	@Test
//	@Test(priority=2,invocationCount=3,timeOut=3000)	
	 public  void MultipleProductAddTOcart() throws InterruptedException, IOException
	 {
	 HomePagePOMClass1 hp=new HomePagePOMClass1(driver);
	 Thread.sleep(2000);
	 hp.clickAllProduct();
	 log.info("product is added to cart");	
	 log.info("Apply the validation");
	 ScreenShotClass.Screenshot(driver);
	 log.info("MultipleProduct add to cart ScreenShoot is taken");
	 String Actualresult=hp.getTextFromCartBasketButton();
	 String Expresult="6";	
	 System.out.println(Expresult);	
     //Hard Assert
	 Assert.assertEquals(Actualresult,Expresult);  //Take Always first actualUrl 	
	
	 hp.clickMenuButton();
	 log.info("Clicked on menu button");
	 Thread.sleep(4000);
	 hp.clickLogoutButton();
	 System.out.println("Clicked on Logout button");
	}	
 }
	
