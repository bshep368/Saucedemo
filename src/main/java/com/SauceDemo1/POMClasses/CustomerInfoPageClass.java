package com.SauceDemo1.POMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CustomerInfoPageClass 
{
	private WebDriver driver;
	
	//Firstname
	@FindBy(xpath="//input[@id='first-name']")
	private WebElement firstname;
	//LAstName
	@FindBy(xpath="//input[@id='last-name']")
	private WebElement lastname;
	//Zip/PostalCode
    @FindBy(id="//input[@id='postal-code']")
	private WebElement zipcode;


	public void CustomerDetils()
	{
		firstname.sendKeys("Bhagyashri");
		lastname.sendKeys("Shep");
		zipcode.sendKeys("412105");
	}

	//Cancel Button
	@FindBy(id=("//button[@id='cancel']"))
	private WebElement cancelbutton;
	public void clickCancelButton()
	{
		cancelbutton.click();
	}
	
	//Continue Button
	@FindBy(id=("//button[@id='cancel']"))
	private WebElement continuebutton;
	public void clickContinueButton()
	{
		continuebutton.click();
	}
	
	public CustomerInfoPageClass(WebDriver driver)
	{
    this.driver=driver;
	PageFactory.initElements(driver,this);	
	}
}
