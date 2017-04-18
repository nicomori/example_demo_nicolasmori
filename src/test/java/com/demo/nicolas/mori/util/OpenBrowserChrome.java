package com.demo.nicolas.mori.util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class OpenBrowserChrome {

	public static WebDriver openBowserWithCapabilities(DesiredCapabilities capabilities) {

		System.setProperty("webdriver.chrome.driver",
				"/Users/nico/Documents/github/example_demo_nicolasmori/chromedriver222");

		WebDriver driver = new ChromeDriver(capabilities);

		driver.manage().window().maximize();

		return driver;
	}
	
	public static WebDriver openBowserWithOutCapabilities(WebDriver driver) {

		System.setProperty("webdriver.chrome.driver",
				"/Users/nico/Documents/github/example_demo_nicolasmori/chromedriver");
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("test-type");
		options.addArguments("start-maximized");
		options.addArguments("--js-flags=--expose-gc");  
		options.addArguments("--enable-precise-memory-info"); 
		options.addArguments("--disable-popup-blocking");
		options.addArguments("--disable-default-apps");
		options.addArguments("test-type=browser");
		options.addArguments("disable-infobars");

		driver = new ChromeDriver(options);

		driver.manage().window().maximize();
		return driver;
	}

}
