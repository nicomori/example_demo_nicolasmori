package com.demo.nicolas.mori.framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * This Class is an abstract class, and created for make the interaction with
 * the class ParentPage.
 */
public abstract class DSL {
	protected WebDriver driver;

	public DSL(WebDriver driver) {
		this.driver = driver;
	}

	/**
	 * @param locator,
	 *            string to send
	 */
	public void sendKeysToLocator(By locator, String stringToSend) {
		driver.findElement(locator).sendKeys(stringToSend);
	}
	
	/**
	 * this method make click in the locator received from the parameters.
	 * 
	 * @param locator
	 */
	public void click(By locator) {
		driver.findElement(locator).click();
	}

	/**
	 * this method get the text from a locator.
	 * 
	 * @param locator
	 * @return an String with the text of the locator.
	 */
	public String getTextByLocator(By locator) {
		return driver.findElement(locator).getText();
	}

	/**
	 * this method wait until a locator appear, in total wait for 30 seconds,
	 * and check if the locator appear 1 time per 5 miliseconds.
	 * 
	 * @param locator
	 */
	public void waitForAnExplicitElement(By locator) {
		@SuppressWarnings("unused")
		WebElement myDynamicElement = (new WebDriverWait(driver, 30))
				.until(ExpectedConditions.presenceOfElementLocated(locator));
	}
	
	
	

}
