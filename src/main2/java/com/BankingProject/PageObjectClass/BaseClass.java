package com.BankingProject.PageObjectClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import com.BankingProject.Utilities.ReadConfig;

public class BaseClass {

	ReadConfig readconfig = new ReadConfig();

	public String baseURL = readconfig.getApplicationURL();
	public String username = readconfig.getUserName();
	public String password = readconfig.getPassWord();

	public static WebDriver driver;
	public ExtentSparkReporter sparkreport;
	public ExtentReports extent;
	public Static ExtentTest test;
	
	@BeforeSuite
	public void setReport() {
	sparkreport = new ExtentSparkReporter("C:\\Users\\user\\eclipse-workspace\\java project\\.metadata\\.plugins\\maharashtra\\Report\\htmlreport.html");
	extent= new ExtentReports();
	extent.attachReporter(sparkreport);
	extent.setSystemInfo("Operating System","window");
	extent.setSystemInfo("Environment","SIT");
	sparkreport.config().setReportName("Integration Testing Report");
	sparkreport.config().setDocumentTitle("QA automation Testing Report");
	sparkreport.config().setTheme(Theme.STANDARD);
	}

	@Parameters("browser")
	@BeforeClass
	public void initialization(String str) {
	if (str.equals("chrome")) {
		System.setProperty("webdriver.chrome.driver",
				"C:/Users/user/Downloads/chromedriver_win32/chromedriver.exe");
	driver = new ChromeDriver();
		} else if (str.equals("Firefox")) {
			System.setProperty("webdriver.gecko.driver",
					"C:/Users/user/Downloads/geckodriver-v0.31.0-win32/geckodriver.exe");
			driver = new FirefoxDriver();
		} else if (str.equals("ie")) {
			System.setProperty("webdriver.ie.driver",
					"C:/Users/user/OneDrive/Documents/IEDriverServer_Win32_4.5.0 (2)/IEDriverServer.exe");
			driver =new InternetExplorerDriver();
			
		}

	}

	@AfterClass
	public void closeBrowser() {
		driver.quit();
		
	}
	@AfterSuite
	public void endReport() {
		extent.flush();
	}
	
}
