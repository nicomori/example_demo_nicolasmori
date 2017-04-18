package com.demo.nicolas.mori.page.object.mobile;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.demo.nicolas.mori.framework.ParentPage;

public class HomePage extends ParentPage {

	public HomePage(WebDriver driver) {
		super(driver);
	}

	
	
	By BUTTON_GOT_IT = By.id("de.number26.android:id/creditIntroGotItButton");
	By BOTTON_PLUS_MENU = By.id("de.number26.android:id/fab_expand_menu_button");
	

	/**
	 * this method get the result of the calculator.
	 * 
	 */
	public void clickInTheButtonGoIt() {
		waitForAnExplicitElement(BUTTON_GOT_IT);
		click(BUTTON_GOT_IT);
	}
	
	/**
	 * this method get the result of the calculator.
	 * 
	 */
	public void pressClickInTheMenuPresentation() {
		waitForAnExplicitElement(BOTTON_PLUS_MENU);
		click(BOTTON_PLUS_MENU);
		waitForAnExplicitElement(BOTTON_PLUS_MENU);
		click(BOTTON_PLUS_MENU);
	}

	

}
