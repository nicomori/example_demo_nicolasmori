package com.demo.nicolas.mori.framework;

import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.demo.nicolas.mori.page.object.mobile.HomePage;
import com.demo.nicolas.mori.page.object.mobile.LoginPage;
import com.demo.nicolas.mori.page.object.mobile.ToolBar;
import com.demo.nicolas.mori.page.object.web.WG_DashboardPage;
import com.demo.nicolas.mori.page.object.web.WG_ResultsDetailPage;
import com.demo.nicolas.mori.page.object.web.WG_ResultsPage;
import com.demo.nicolas.mori.util.SelectorBrowser;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

/**
 * This Class is created for make a helper for all the pages, and all the parts
 * of the a native app, or for execute all the drivers. And for create all the
 * objects of pages, or objects created in all the pages.
 * 
 */

public class ParentScenario {

	private static WebDriver driver;

	protected ToolBar toolBar;
	protected LoginPage loginPage;
	protected HomePage homePage;
	
	protected static WG_ResultsPage wg_ResultsPage;
	protected static WG_ResultsDetailPage wg_ResultsDetailPage;
	protected static WG_DashboardPage wg_DashboardPage;

	/**
	 * this method create the object driver for Android.
	 * 
	 * @param uuid
	 *            of the device to use.
	 */
	public void startAndroid(String uuid) {

		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, uuid);
		cap.setCapability(MobileCapabilityType.APP_PACKAGE, "com.wggesucht.android");
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "6.0");
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "ANDROID");

		try {
			driver = new AndroidDriver<WebElement>(new URL("http://127.0.0.1:4723/wd/hub"), cap);
		} catch (Exception e) {
			System.out.println("Exeption at the moment to generate the driver = " + e);
		}

		toolBar = new ToolBar(driver);
		loginPage = new LoginPage(driver);
		homePage = new HomePage(driver);

	}
	
	public void startBrowser() {
		System.out.println("Starting driver for Browser Chrome");
		driver = SelectorBrowser.createDriverWithoutCapabilities("chrome",driver);
		
		
		wg_ResultsPage = new WG_ResultsPage(driver);
		wg_ResultsDetailPage = new WG_ResultsDetailPage(driver);
		wg_DashboardPage = new WG_DashboardPage(driver);
		
	}
	
	
	protected void navigateTo(String url) {
		driver.navigate().to(url);
	}

	public void closeDriver() {
		driver.quit();
	}

	

	
}
