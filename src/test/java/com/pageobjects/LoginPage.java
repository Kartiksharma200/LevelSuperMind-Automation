package com.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class LoginPage {
	
	 AndroidDriver driver;

	//Constructor
	public LoginPage(AndroidDriver driver) {
		driver = this.driver;
	}
	
	//Locators
	
	WebElement emailTab = driver.findElement(By.xpath("//android.widget.TextView[@text='Email']"));
	WebElement phoneTab = driver.findElement(By.xpath("//android.widget.TextView[@text='Phone']"));
	WebElement otpScreen = driver.findElement(By.xpath("//android.widget.TextView[@text='We have sent a code to ']"));
	
	//Common Locators
	
	  @AndroidFindBy(xpath = "//android.widget.EditText")
	  public WebElement inputField;

	  @AndroidFindBy(xpath = "(//android.view.View[@content-desc='Arrow Right'])[1]")
	  public WebElement continueBtn;

	  @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc='Back Arrow']")
	  public WebElement backBtn;

	  @AndroidFindBy(xpath = "//android.widget.Toast[1]")
	  WebElement toast;
      
	  
	  //Open Email-Tab
	  public void openEmailTab() {
		    if (!emailTab.isSelected())
		      emailTab.click();
		    else
		      System.out.println("Already opened");
		  }
	  
	 
	   //Open Phone-Tab
	  
	  public void openPhoneTab() {
	    if (!phoneTab.isSelected())
	      phoneTab.click();
	    else
	      System.out.println("Already opened");
	  }
	  
	  //Check if the Input field is visible 
	  public void isFieldVisible() {
	    return;
	  }

	  //Enter the data in input field
	  public void enterInput(String data) {
	    inputField.clear();
	    inputField.click();

	    inputField.sendKeys(data);
	  }

	  
	  //check if alert-toast appeared
	   
	  public Boolean isToastVisible() {
	    if (toast != null) {
	      System.out.println(toast.getText());
	      return true;
	    }

	    return false;
	  }

	  
	   //check if otp-screen open
	  
	  public Boolean isOtpScreenVisible() {
	    return otpScreen.isDisplayed();
	  }

	  //cancel prompt 
	  public void cancleGMS() {
	    WebElement closeBtn = driver.findElement(By.xpath("//android.widget.Button[@text, 'Deny']"));

	    if (closeBtn.isDisplayed()) {
	      System.out.println("GMS screen open");
	      closeBtn.click();
	      System.out.println("GMS screen close (Not allow to copy!)");
	    }
	  }


	public void validateInput(String string, String userEmail) {
		// TODO Auto-generated method stub
		
	}


	public void validateInput1(String string, String userPhone) {
		// TODO Auto-generated method stub
		
	}
}
