package com.SauceDemo1.POMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OrderPagePOMClass 
{
	
   private WebDriver driver;

    //BackButton
    @FindBy(xpath=("//button[text()='Back Home']"))
    private WebElement backhomeButton;
	public void clickBackButton()
	{
		backhomeButton.click();
	}
	

	
}
