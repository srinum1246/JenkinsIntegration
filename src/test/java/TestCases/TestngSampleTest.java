package TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestngSampleTest {
	
	WebDriver driver;

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("Before Suite");
	}
	@BeforeClass
	public void beforeClass() {
		System.out.println("Before Class");
	}
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("Before Test");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Before Method");
//		System.out.println(System.getProperty("user.dir"));
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");
        options.addArguments("--disable-gpu");
        options.addArguments("--allow-insecure-localhost");
		options.addArguments("--remote-allow-origins=*");
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir") +"\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver(options);
		driver.get("https://www.google.com");
		System.out.println("Url name is :"+driver.getCurrentUrl());
		
	}
	
	@Test
	public void test1() {
		System.out.println("Test case 1");
	}
	
	
	@Test
	public void test2() {
		System.out.println("Test case 2");
	}
	
	
	@AfterClass
	public void AfterClass() {
		System.out.println("After Class");
	}
	
	@AfterTest
	public void AfterTest() {
		System.out.println("After Test");
	}
	
	@AfterMethod
	public void AfterMethod() {
		System.out.println("After Method");
		driver.quit();
	}
	
	@AfterSuite
	public void AfterSuite() {
		System.out.println("After Suite");
	}
}
