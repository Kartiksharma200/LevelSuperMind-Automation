package com.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.appium.java_client.android.AndroidDriver;

public class SignUp {
	

	private AndroidDriver driver;

	public SignUp(AndroidDriver driver) {
	    driver = this.driver;
	  }

	  //HomeScreen is Visible
	  public Boolean isRegisterScreenOpen() {
	    WebElement registerScreen = driver.findElement(By.xpath("//android.widget.TextView[contains(@text, 'personalised recommendations')]"));
	       
	    try {
	      System.out.println("Checking if register screen is displayed...");
	      return registerScreen.isDisplayed();

	    } catch (Exception e) {
	      System.out.println("Register screen not found: " + e.getMessage());
	      return false;
	    }
	  }
}
