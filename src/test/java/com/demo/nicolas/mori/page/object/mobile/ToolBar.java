package com.demo.nicolas.mori.page.object.mobile;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.demo.nicolas.mori.framework.ParentPage;

public class ToolBar extends ParentPage {

	public ToolBar(WebDriver driver) {
		super(driver);
	}


	By FIELD_RESULT = By.xpath("//android.widget.EditText[1]");

	/**
	 * this method get the result of the calculator.
	 * 
	 * @return a integer value with the result of the caclulator.
	 */
	public int getResult() {
		return Integer.parseInt(getTextByLocator(FIELD_RESULT).replace(".", ""));
	}

}
