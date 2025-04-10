package com.pageobjects;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.appium.java_client.android.AndroidDriver;

public class HomePage {
	
	private AndroidDriver driver;

	public HomePage(AndroidDriver driver) {
		driver= this.driver;
	}
    
	//Click on Login Buttons
	
	public void clickLoginBtn() {
		WebElement loginBtn = driver.findElement(By.xpath("//android.widget.TextView[@text='Sign In']"));
		loginBtn.click();
    }
	
	//Tittle Verify
	
	public String tittle() {
		WebElement pageTittle = driver.findElement(By.xpath("//android.widget.TextView[@text='Sign in']"));
		String accTittle = driver.getTitle();
		assertEquals(accTittle, pageTittle);
		System.out.println("Verify Tittle");
		return accTittle;
	}
}
