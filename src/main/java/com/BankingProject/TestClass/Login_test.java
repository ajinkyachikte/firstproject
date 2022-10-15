package com.BankingProject.TestClass;


import java.io.IOException;

import org.testng.annotations.Test;
import org.testng.annotations.Test;


import com.BankingProject.PageObjectClass.BaseClass;
import com.BankingProject.PageObjectClass.LoginPage_POM;
import com.BankingProject.Utilities.Excel_data;
import com.aventstack.extentreports.Status;

public class Login_test extends BaseClass {

	@Test
	public void LoginTest() throws InterruptedException, IOException {
	try {
		LoginPage_POM login = new LoginPage_POM(driver);
		
		driver.get(baseURL);
		test=extent.createTest("verify application login");
		test.log(Status.PASS,"application URL open Successfully");
		
		
		
		login.setUsername(Excel_data.getdata(2, 0));
		test.log(Status.PASS,"Username Successfully Entered");
		
		login.setpassword(Excel_data.getdata(2, 1));
		test.log(Status.PASS,"Password Successfully Entered");
		
		
		login.loginbutton();
		test.log(Status.PASS,"clicked on login button");
		
		String expectedTitle = "GTPL Bank Home Page";
		
		String actualTitle= driver.getTitle();
		
		if (actualTitle.equals(expectedTitle)) {
		test.log(Status.PASS,"title verifiad and user logged in Successfully");
		}else {
			test.log(Status.FAIL,"Login FAILED");
			String screenshothpath = BaseClass.captureScreen();
			test.addScreenCaptureFromPath(screenshothpath);
		}
	}catch (Exception e) {
			test.log(Status.FAIL,"Login FAILED");
			String screenshothpath = BaseClass.captureScreen();
			test.addScreenCaptureFromPath(screenshothpath);
		}
		
		

	}
}
