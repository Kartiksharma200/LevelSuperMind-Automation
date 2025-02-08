package com.main;

import io.appium.java_client.android.AndroidDriver;

public class ScreenBase {
	protected AndroidDriver driver;
	
	//CONSTRUCTOR
	public ScreenBase(AndroidDriver driver) {
		this.driver = driver;
	}

}
