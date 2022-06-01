package com.SauceDemo1.TestClasses;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.SauceDemo1.POMClasses.HomePagePOMClass1;

public class TC03SingleProductAddTOcarFunctionalityTestclass extends TestBaseClass
{
@Test
// @Test(priority=1,invocationCount=1,timeOut=1000)	
 public  void SingleProductAddTOcart()
 {
 HomePagePOMClass1 hp=new HomePagePOMClass1(driver);
 hp.clickAddToCart();
 log.info("product is added to cart");	
 log.info("Apply the validation");
	
 String Actualresult=hp.getTextFromCartBasketButton();
 System.out.println(Actualresult);	
 String Expresult="1";	
 System.out.println(Expresult);	
// Soft Assert -- while using this Assertion we have to create the object of SoftAssert class  so Assertion methods are non-Static. this is used when 		
 //when tests are independent ( not depends on each other)this Assertion can use. if 1 test fails then other will execute .assertAll method is compulsory
 SoftAssert soft =new SoftAssert();
 soft.assertEquals(Actualresult, Expresult);
 soft.assertAll();
	
 }	
}
