package com.raybiztech.mobile.Test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestApp {

	public static AndroidDriver<MobileElement> driver;

	@BeforeTest
	public void setUp() throws MalformedURLException {
		// Set up desired capabilities and pass the Android app-activity and
		// app-package to Appium
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("BROWSER_NAME", "Android");
		capabilities.setCapability("VERSION", "4.4.2");
		capabilities.setCapability("deviceName", "emulator-5554");
		capabilities.setCapability("platformName", "Android");

		capabilities.setCapability("appPackage", "io.selendroid.testapp");
		// This package name of your app (you can get it from apk info app)
		capabilities.setCapability("appActivity",
				"io.selendroid.testapp.HomeScreenActivity"); // This is Launcher
		// activity of your app
		// (you can get it from
		// apk info app)
		// Create RemoteWebDriver instance and connect to the Appium server
		// It will launch the Calculator App in Android Device using the
		// configurations specified in Desired Capabilities
		driver = new AndroidDriver<MobileElement>(new URL(
				"http://127.0.1.1:4723/wd/hub"), capabilities);

	}

	@Test
	public void testTextBox() throws Exception {

		Thread.sleep(1000);

		driver.findElement(
				By.xpath("//android.widget.Button[@text='Display text view']"))
				.click();
		driver.findElement(By
				.xpath("//android.widget.Button[@content-desc='showToastButtonCD]"));

	}

	@AfterClass
	public void teardown() {

		driver.quit();
	}
}
