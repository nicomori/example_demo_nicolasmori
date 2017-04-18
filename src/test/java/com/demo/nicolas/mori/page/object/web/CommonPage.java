package com.demo.nicolas.mori.page.object.web;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.demo.nicolas.mori.framework.ParentPage;

public class CommonPage extends ParentPage {

	public CommonPage(WebDriver driver) {
		super(driver);
	}

	By LOGO = By.xpath("//*[text()='N26']");
	By MENU_TRANSACTIONS = By.xpath("//*[text()='Transactions']");
	By MENU_TRANSFER = By.xpath("//*[text()='Transfers']");
	By MENU_CARD = By.xpath("//*[text()='Card']");
	By MENU_ACCOUNT = By.xpath("//*[text()='Account']");
	By MENU_SUPPORT = By.xpath("//*[text()='Support']");
	By MENU_STADISTICS = By.xpath("//*[text()='Statistics']");
	By OPTION_CHAT = By.xpath("//*[@id='helpButtonSpan']");
	By LABEL_BALANCE = By.xpath("//*[contains(text(),'Your balance')]");
	By LOGOUT = By.xpath("//*[contains(text(),'Logout')]");
	By INVITE_YOUR_FRIEND = By.xpath("//*[contains(text(),'Invite your friends')]");

	
	/**
	 * this method make click in the symbol declared in the feature file.
	 * 
	 */
	public void loginIntoTheApp(String user, String pass) {
//		waitForAnExplicitElement(FIELD_EMAIL);
//		sendKeysToLocator(FIELD_EMAIL, user);
//		sendKeysToLocator(FIELD_PASSWORD, pass);
//		click(BUTTON_LOGIN);
	}

	
	
	
}
