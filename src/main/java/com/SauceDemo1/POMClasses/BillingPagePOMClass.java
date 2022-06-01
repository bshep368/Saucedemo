package com.SauceDemo1.POMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BillingPagePOMClass 
{
    private WebDriver driver;
	
	//CancelButton
    @FindBy(xpath="//button[@id='cancel']")
	private WebElement cancelbutton;
    public void clickCancelButton()
    {
    	cancelbutton.click();
    }
	
    //FinishButton
    @FindBy(xpath="//button[@id='finish']")
    private WebElement finishbutton;
    public void clickFinishButton()
    {
    	finishbutton.click();
    }
	
}
