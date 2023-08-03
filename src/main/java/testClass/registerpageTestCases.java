package testClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pomClass.registerPagepom;

public class registerpageTestCases {
	
	WebDriver driver;
	registerPagepom Pom;
	
	
	@BeforeClass
	public void OpenBrowser() {
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
	    Pom = new registerPagepom (driver);	
	}
	
	@AfterClass
	public void CloseBrowser() throws InterruptedException {
		Thread.sleep(5000);
		driver.quit();
	}
	
	
	@BeforeMethod
	public void OpenApplication() {
		driver.get("https://www.facebook.com/signup");
	}
	
	@AfterMethod
	public void RefreshApplication() {
		driver.navigate().refresh();
	}
	
	@Test
	public void RegisterPageTestCases() throws InterruptedException {
		Pom.EnterFirstname("Aks");
		Pom.EnterLastname("Test");
		Pom.EnterEmail("Akstest@mailinator.com");
		Pom.EnterReEmail("Akstest@mailinator.com");
		Pom.EnterPassword("Test@123");
		Pom.SelectDate("12");
		Pom.SelectMonth("July");
		Pom.SelectYear("2002");
		Pom.ClickMgender();
		Pom.ClickOnSignup();
	}
	
	@Test
	public void RegisterPageTestCases1() throws InterruptedException {
		Pom.EnterFirstname("Aksh");
		Pom.EnterLastname("Testing");
		Pom.EnterEmail("Akstest1@mailinator.com");
		Pom.EnterReEmail("Akstest1@mailinator.com");
		Pom.EnterPassword("Test@1234");
		Pom.SelectDate("13");
		Pom.SelectMonth("July");
		Pom.SelectYear("2006");
		Pom.ClickMgender();
		Pom.ClickOnSignup();
	}

}
