package com.SauceDemo1.POMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPagePOMClass1 
{
    WebDriver driver;    //declare the  WebDriver as global
	
    @FindBy(xpath="//input[@id='user-name']")
	private WebElement Username;
	@FindBy(xpath="//input[@id='password']")
	private WebElement Password;
	@FindBy(xpath="//input[@id='login-button']")
	private WebElement LoginButton;
	
	public void LoginDetail()
	{
	Username.sendKeys("standard_user");
	Password.sendKeys("secret_sauce");
	LoginButton.click();
	}
	
	
	public LoginPagePOMClass1(WebDriver driver)
	{
	this.driver=driver;
	PageFactory.initElements(driver,this);
	}
	
	
	
	
	
	
	
	
	
	
	
}
