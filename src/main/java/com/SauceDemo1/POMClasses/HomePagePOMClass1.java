package com.SauceDemo1.POMClasses;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class HomePagePOMClass1 
{
	WebDriver driver;
	//use of Actions for performing the Mouse action
    private Actions act;
    //Use Select class to handle the dropDown
    private Select s;
   
    
	  //Add To card for Single product
	  @FindBy(xpath="//button[@id='add-to-cart-test.allthethings()-t-shirt-(red)']")
	  private WebElement addTocartButton;
	  public String clickAddToCart()
	  {
       addTocartButton.click();
//	    act.click(addTocartButton).perform();
		return null;
	  }
		 
	  @FindBy(xpath="//div[@id='shopping_cart_container']")
	  private WebElement cartBasket;
	  public String getTextFromCartBasketButton()
	  {
	   String totalProducts = cartBasket.getText();
	   return totalProducts;
	  }

	  //Add To card for all 6 products which r present on the Home Page
     @FindBy(xpath="//button[text()='Add to cart']")  
     private List<WebElement> allproduct;             
     public  void clickAllProduct()   
     {
  	 for (WebElement allcart:allproduct)   //for each loop if reutrns String then String if WebElemnts the take WebElement if int then take int the take any ref varable. then take main webelement ref.var
     {
     allcart.click(); 
//  		act.click(allcart).perform();
     }
     }	
  
//	   @FindBy(xpath="//button[text()='Add to cart']")
//	   private List<WebElement> multipleAddToCart ;
//			
//	   public void addAllProduct()
//		{
//		 for(int i=0; i<multipleAddToCart.size(); i++)
//		{
//	    	multipleAddToCart.get(i).click();
//		}
//	}

     //FilterButton or dropdown
     @FindBy(xpath="//select[@class='product_sort_container']")
	  private  WebElement FilterBtton;
      public void ClickFilterBtton()
	  {
      FilterBtton.click();
//    act.click(FilterBtton).perform();
 	  s.selectByVisibleText("Name (A to Z)");
  	  }
     	       
      //MenuButton
      @FindBy(xpath="//button[text()='Open Menu']")
      private WebElement menubutton;             
      public  void clickMenuButton()
      {
      menubutton.click();  
//    act.click(menubutton).perform();
      }	
	
      //All Items button from menu
      @FindBy(xpath="//a[text()='All Items']")
      private WebElement allitems;             
      public  void clickAllItems()   
      {
  	  allitems.click();   
  	 //act.click(allitems).perform();
      }	
	
	    //AboutOption from menu
      @FindBy(xpath="//a[text()='About']")
      private WebElement aboutButton;             
      public  void clickAboutOption()   
      {
  	  aboutButton.click();   
      }	
	
 	    //LogputButton from menu
      @FindBy(xpath=("//a[text()='Logout']"))
      private WebElement logoutbutton;             
      public  void clickLogoutButton()   
      {
  	  logoutbutton.click();  
  	  //act.click(logoutbutton).perform();
      }	
    
	    //ResetAppButton
      @FindBy(xpath=("//a[text()='Reset App State']"))
      WebElement resetappButton;             
      public  void clickResetAppButton()   
      {
  	  resetappButton.click();  
  	//act.click(resetappButton).perform();
      }
//constructor
      public HomePagePOMClass1(WebDriver driver)
      {
    	  this.driver=driver;
    	  PageFactory.initElements(driver,this);
//    	  act=new Actions(driver);
      }
	
 
}
	
