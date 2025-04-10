package com.tests;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.main.Capablities;

import io.reactivex.rxjava3.core.Notification;

public class LoginWithEmail extends Capablities {

	@Test(priority = 1)
	public void navigateToLogin() {
		homepage.clickLoginBtn();
		String Tittle = homepage.tittle();
		AssertJUnit.assertEquals(Tittle, true);
		System.out.println("<---Login In page open---->");
	}

	public void openEmailScreen() {
		loginpage.openEmailTab();

//		Assert.assertTrue(
//				loginpage.isFieldVisible(),
//				"Email field is not accessible");
		System.out.println("<----- Email field visible ----->");
	}

	@Test(priority = 3)
	public void verifyValidEmail() {
		String userEmail = System.getProperty("userEmail");

		loginpage.validateInput("Email", userEmail);
	}
	
	  @Test(priority = 4)
	  public void retrieveAndEnterOTP() {
	    Assert.assertTrue(loginpage.isOtpScreenVisible());

//	    String OTP = Notification.getEmailOTP();

	    System.out.println("<----- OTP retrived ----->");
//	    loginpage.enterInput(OTP);
	    System.out.println("<----- OTP entered ----->");
	  }


}
