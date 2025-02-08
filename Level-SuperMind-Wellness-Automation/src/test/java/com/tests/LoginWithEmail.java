package com.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.main.Capablities;

public class LoginWithEmail extends Capablities{
	
	@Test(priority = 1)
	public void navigateToLogin() {
		homepage.clickLoginBtn();
		String Tittle = homepage.tittle();
		Assert.assertEquals(Tittle, true);
		System.out.println("<---Login In page open---->");
	}
	
	public void openEmailScreen() {
		loginpage.openEmailTab();
		
		Assert.assertTrue(
		        loginpage.isFieldVisible(),
		        "Email field is not accessible");
		    System.out.println("<----- Email field visible ----->");
	}
	@Test(priority = 3)
	  public void verifyValidEmail() {
	    String userEmail = properties.getProperty("userEmail");

	    loginPage.validateInput("Email", userEmail);
	  }

}
