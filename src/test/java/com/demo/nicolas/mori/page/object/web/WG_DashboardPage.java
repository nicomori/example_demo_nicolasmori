package com.demo.nicolas.mori.page.object.web;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.demo.nicolas.mori.framework.ParentPage;

public class WG_DashboardPage extends ParentPage {
	

	public WG_DashboardPage(WebDriver driver) {
		super(driver);
		System.out.println("WG_DashboardPage STARTEEEEED!!!!!!!!!!!!!!!!!");
	}
	
	By INPUT_CITY = By.xpath("//input[@id='autocompinp']");
	By HOUSE_TYPE = By.xpath("//button[@id='rubrik-dropdown-menu']");
	By HOUSE_TYPE_OPTION_WG_ZIMMER = By.xpath("//a[contains(text(),'%s')]");
	By BUTTON_FIND = By.xpath("//input[@id='search_button']");
	
	public void setTheNameOfTheCity(String cityName) {
		System.out.println("333333333333333");
		waitForAnExplicitElement(INPUT_CITY);
		sendKeysToLocator(INPUT_CITY, cityName);
	}
	
	public void selectDeptTypeAndPressTheButtonFind(String deptType){
		waitForAnExplicitElement(HOUSE_TYPE);
		click(HOUSE_TYPE);
		waitForAnExplicitElement(By.xpath(String.format("//a[contains(text(),'%s')]",deptType)));
		click(By.xpath(String.format("//a[contains(text(),'%s')]",deptType)));
		waitForAnExplicitElement(BUTTON_FIND);
		click(BUTTON_FIND);
	}
	
}
