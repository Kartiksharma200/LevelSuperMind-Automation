package com.main;

import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.Properties;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.pageobjects.HomePage;
import com.pageobjects.LoginPage;
import com.pageobjects.SignUp;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.opentelemetry.sdk.metrics.data.Data;

public class Capablities {
	
	public static AndroidDriver driver;
	protected  Data properties;
	
	protected HomePage homepage;
	protected LoginPage loginpage;
	protected SignUp signup;
	
	private static String udid;
	private static String deviceName;
	private static String platformVersion;
	private static String appPackage;
	private static String appActivity;
	private static String platformName;
	public static AppiumDriverLocalService appiumService;
	public static Process process;
	
	//THIS WILL START EMULATOR
		@SuppressWarnings("deprecation")
		public static void startEmulator() throws IOException, InterruptedException {
			Runtime.getRuntime().exec(System.getProperty("user.dir")+"\\emulator2.bat");
			Thread.sleep(1000);
		}
		
		//THIS WILL BE START APPIUM SERVER
		public static AppiumDriverLocalService startAppium() {
			appiumService = AppiumDriverLocalService.buildDefaultService();
			return appiumService;
			
		}
		
		//public static AndroidDriver driver;
		public static AndroidDriver capabilitie() throws IOException {
			//FROM FILEREADER WE READ THE DATA FORM THE GLOBAL PROPERTIES AND ADD PATH OF THE FILE
			FileReader reader = new FileReader(System.getProperty("user.dir")+ "\\src\\test\\resources\\details\\Data.properties");
			Properties ps = new Properties();
			ps.load(reader);
			udid = ps.getProperty("udid");
			deviceName = ps.getProperty("deviceName");
			platformVersion = ps.getProperty("platformVersion");
			appPackage = ps.getProperty("appPackage");
			appActivity = ps.getProperty("appActivity");
			platformName = ps.getProperty("platformName");
			
			DesiredCapabilities dc = new DesiredCapabilities();
			dc.setCapability("deviceName", deviceName);
			dc.setCapability("platformName", platformName);
			dc.setCapability("platformVersion", platformVersion);
			dc.setCapability("udid", udid);
			dc.setCapability("automationName", "UiAutomator2");
			dc.setCapability("appPackage", appPackage);
			dc.setCapability("appActivity", appActivity);
			dc.setCapability("unicodeKeyboard", true);
			dc.setCapability("resetKeyboard", true);
			
			@SuppressWarnings("deprecation")
			URL url = new URL("http://127.0.0.1:4723");
			AndroidDriver driver = new AndroidDriver(url,dc);
			System.out.println("<--------Level SuperMind App is running------>");
			return driver;		
		}
		
		
		public static void main(String[] args) throws IOException, InterruptedException {
			startEmulator();
			startAppium().start();
			Thread.sleep(10000);
			capabilitie();
		}
		
		@BeforeTest
		public void AppActions() {
			homepage = new HomePage(driver);
			loginpage = new LoginPage(driver);
			signup = new SignUp(driver);
		}
		
		@AfterTest
		public void teardown() {
			if(driver != null) {
				driver.quit();
				System.out.println("<----App closed--->");
			}
		}
}