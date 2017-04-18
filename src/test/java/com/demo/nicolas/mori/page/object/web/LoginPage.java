package com.demo.nicolas.mori.page.object.web;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.demo.nicolas.mori.framework.ParentPage;

public class LoginPage extends ParentPage {

	public LoginPage(WebDriver driver) {
		super(driver);
	}
	
	By FIELD_EMAIL = By.id("//*[contains(@name, 'email')]");
	By FIELD_PASSWORD = By.id("//*[contains(@name, 'password')]");
	By BUTTON_LOGIN = By.id("//*[text()='Log in']");



	/**
	 * this method make click in the symbol declared in the feature file.
	 * 
	 */
	public void loginIntoTheApp(String user, String pass) {
		waitForAnExplicitElement(FIELD_EMAIL);
		sendKeysToLocator(FIELD_EMAIL, user);
		sendKeysToLocator(FIELD_PASSWORD, pass);
		click(BUTTON_LOGIN);
	}

}
