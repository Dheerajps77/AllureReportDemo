package com.qa.NoCommerce.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.codoid.products.fillo.Select;
import com.qa.NoCommerce.Utils.SeleniumUtils;


public class verifyNoCommerceLoginPage {
	
	
	WebDriver driver;
	public verifyNoCommerceLoginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
		
	@FindBy(xpath="//div[@class='header-logo']//a//img")
	WebElement LOGO;
	
	@FindBy(xpath="//div[@class='header-links']//ul//li[2]")
	WebElement LOGIN_BTN;
	
	@FindBy(id="Email")
	WebElement EMAIL;
	
	@FindBy(id="Password")
	WebElement PASS;
	
	@FindBy(xpath="//input[@class='button-1 login-button']")
	WebElement CLICK_BTN;
	
	
	public boolean verifyLOGOOnHomePage()
	{
		boolean flag=false;
		try {
			
			if(LOGO.isDisplayed())
			{
				flag=true;
				System.out.println(driver.getCurrentUrl());
				System.out.println(driver.getTitle());
			}
		} catch (Exception e) {
			throw e;
		}
		return flag;
	}
	
	public boolean verifyLoginFunctionality()
	{
		boolean flag=false;
		try {
			SeleniumUtils.waitForElementClickable(driver, LOGIN_BTN, 30);
			if(LOGIN_BTN.isDisplayed())
			{
			LOGIN_BTN.click();
			SeleniumUtils.waitForElementClickable(driver, EMAIL, 30);
			EMAIL.sendKeys("pavanoltraining@gmail.com");
			System.out.println("email id has been entered");
			SeleniumUtils.waitForElementClickable(driver, PASS, 30);
			PASS.sendKeys("Test@123");
			System.out.println("password has been entered");
			SeleniumUtils.waitForElementClickable(driver, CLICK_BTN, 30);
			CLICK_BTN.click();
			System.out.println("Clicked on Login button");
			System.out.println(driver.getCurrentUrl());
			System.out.println(driver.getTitle());
			flag=true;
			}
		} catch (Exception e) {
			throw e;
		}
		return flag;
	}
	
}
