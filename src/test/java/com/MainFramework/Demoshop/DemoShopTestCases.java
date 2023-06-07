package com.MainFramework.Demoshop;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.DemoshopProject.DemoBaseConfig;
import com.pageobjects.Demoshop.CartTextVisible;
import com.pageobjects.Demoshop.DemoHomePage;
import com.pageobjects.Demoshop.DemoHomePageClick;
import com.pageobjects.Demoshop.DemoShopDesktop;

public class DemoShopTestCases extends DemoBaseConfig
{
     WebDriver driver;
     public DemoHomePage homepage;
     public DemoHomePageClick homepageclick;
     public DemoShopDesktop desktop;
     public CartTextVisible cart;
     
     @BeforeMethod
 	public void Setup()
 	{
    	 driver = getDriver();
    	 homepage = new DemoHomePage(driver);
    	 homepageclick = new DemoHomePageClick(driver);
    	 desktop = new DemoShopDesktop(driver);
    	 cart = new CartTextVisible(driver);
 	}
     
     // Test Cases
     @Test
     public void TestCase()
     {
    	 homepage.buttonsVisible();
    	 homepageclick.ClickOnButton();
    	 desktop.ClickonCart();
    	 cart.VisibleCartButton();
     }
}
