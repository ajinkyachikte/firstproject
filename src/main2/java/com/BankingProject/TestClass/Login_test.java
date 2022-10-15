package com.BankingProject.TestClass;

import org.testng.annotations.Test;

import com.BankingProject.PageObjectClass.BaseClass;
import com.BankingProject.PageObjectClass.LoginPage_POM;

public class Login_test extends BaseClass {

	@Test
	public void LoginTest() // LoginPage()throws InterruptedException
	{
		driver.get(baseURL);
		LoginPage_POM login = new LoginPage_POM(driver);

		login.setUsername(username);
		login.setpassword(password);
		login.loginbutton();

	}
}
