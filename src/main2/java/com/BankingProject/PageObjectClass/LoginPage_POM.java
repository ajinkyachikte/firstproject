package com.BankingProject.PageObjectClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPage_POM {
	
	public WebDriver ldriver;
	
	@FindBy(xpath ="//input[@name='uid']")
	WebElement UserID;
	
	@FindBy(xpath="//input[@name='password']")
	WebElement Password;
	
	@FindBy(xpath="//input[@name='btnLogin']")
	WebElement Loginbutton;
	
	@FindBy(xpath="//input[@name='btnlogin']")
	WebElement Reset;

	
	public LoginPage_POM(WebDriver rdriver) 
	{	
		ldriver= rdriver;
		
		PageFactory.initElements(rdriver, this);
	}
	
	public void setUsername(String name)
	{
		UserID.sendKeys(name);	
	}
	public void setpassword(String name)
	{
		Password.sendKeys(name);
	}
	public void loginbutton()
	{
		Loginbutton.click();
	}
	public void resetbutton() 
	{
		Reset.click();
	}

	

			
	
	
}	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


