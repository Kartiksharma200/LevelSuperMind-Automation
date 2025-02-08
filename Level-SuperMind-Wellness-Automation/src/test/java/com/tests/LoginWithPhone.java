package com.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.main.Capablities;

public class LoginWithPhone extends Capablities{
	
	@Test(priority = 1)
	public void navigateToLoginPage() {
		homepage.clickLoginBtn();
		String Tittle = homepage.tittle();
		Assert.assertEquals(Tittle, true);
		System.out.println("<---Login In page open---->");
	}
	  
	  @Test(priority = 2)
	  public void openPhoneScreen() {
	    loginpage.openPhoneTab();

	    Assert.assertEquals(
	    		loginpage.isFieldVisible(),
	    		"Phone field is not accessible");
	    System.out.println("<----- Phone number field visible ----->");
	  }

	  
	  //verify valid email & assert valid/invalid email
	  
	  @Test(priority = 3)
	  public void verifyValidPhoneNumber() {
	    String userPhone = properties.getProperty("userPhone");

	    loginpage.validateInput("phone", userPhone);
	  }

	 

}
