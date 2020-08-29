package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {
	public LoginPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}



	@FindBy(name="uid")
	private WebElement UserId;
	
	@FindBy(name="password")
	private WebElement Password;
	
	@FindBy(name="btnLogin")
	private WebElement Login;
	
	@FindBy(name="btnReset")
	private WebElement Reset;
	
	
	
	public void validateLogin(String username,String password) {
		UserId.sendKeys(username);
		Password.sendKeys(password);
		Login.click();
		System.out.println("Successfully loggedin");
		
		
		
		 
	}
	

}
