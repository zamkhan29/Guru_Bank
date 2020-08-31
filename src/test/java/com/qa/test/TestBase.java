package com.qa.test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.qa.pages.BasePage;

public class TestBase{
	public WebDriver driver;
	public Properties prop;
	public TestBase() {
		try {
			FileInputStream fis = new FileInputStream("F:\\workspace\\Guru_Bank\\src\\main\\java\\com\\qa\\config\\config.properties");
			prop = new Properties();
			prop.load(fis);
		}
		catch(IOException d) {
			d.printStackTrace();
		}
		
	}
	
	@BeforeMethod
	public void setUp() {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(prop.getProperty("Url"));
		
	}
	@AfterMethod
	public void tearDown() {
		driver.close();
		
	}
	
	

}
