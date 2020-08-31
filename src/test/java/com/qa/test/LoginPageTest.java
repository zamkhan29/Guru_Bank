
package com.qa.test;

import org.testng.annotations.Test;

import com.qa.pages.LoginPage;
import com.qa.util.TestUtil;

public class LoginPageTest extends TestBase {
	LoginPage lp;
	
	
	
	public LoginPageTest() {
		super();
		// TODO Auto-generated constructor stub
	}



	@Test
	public void validateLoginTest() {
		lp = new LoginPage(driver);
		//String un=
				TestUtil.getProperties().getProperty("username");
		
		lp.validateLogin(prop.getProperty("username"),prop.getProperty("password"));
		
	}

}
