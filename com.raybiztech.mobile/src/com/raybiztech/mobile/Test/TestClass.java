package com.raybiztech.mobile.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.remote.MobileCapabilityType;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
//import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestClass {

	public AppiumDriver driver;

	@BeforeClass
	public void setUp() throws MalformedURLException {
		// Set up desired capabilities and pass the Android app-activity and
		// app-package to Appium

		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("BROWSER_NAME", "Android");
		capabilities.setCapability("VERSION", "4.4.2");
		capabilities.setCapability("deviceName", "emulator-5554");
		capabilities.setCapability("platformName","Android");
		capabilities.setCapability("appPackage", "com.android.calculator2");
		capabilities.setCapability("appActivity","com.android.calculator2");
		
		
	

		driver = new AppiumDriver(new URL("http://127.0.0.1:4723/wd/hub"),
				capabilities);
		driver.manage().timeouts()
				.implicitlyWait(30, java.util.concurrent.TimeUnit.SECONDS);
	}

	@Test
	public void testCal() throws Exception {
		// locate the Text on the calculator by using By.name()

		MobileElement calculator = (MobileElement) driver.findElement(By
				.name("Calculator"));
		TouchAction act = new TouchAction(driver);
		act.press(calculator).perform();// we are not releasing calculator icon
		act.moveTo(driver.findElement(By.name("App info"))).release().perform();
	}

	@AfterClass
	public void teardown() {
		// close the app
		driver.quit();
	}
}
