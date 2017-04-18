package com.demo.nicolas.mori.page.object.web;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.demo.nicolas.mori.framework.ParentPage;

public class WG_DashboardPage extends ParentPage {
	

	public WG_DashboardPage(WebDriver driver) {
		super(driver);
	}
	
	By INPUT_CITY = By.xpath("//input[@id='autocompinp']");
	By HOUSE_TYPE = By.xpath("//button[@id='rubrik-dropdown-menu']");
	By HOUSE_TYPE_OPTION_WG_ZIMMER = By.xpath("//a[contains(text(),'%s')]");
	By BUTTON_FIND = By.xpath("//input[@id='search_button']");
	
	By BUTTON_LOGIN = By.xpath("//*[contains(text(),'Login')]");
	
	By POP_UP_LOGIN_FIELD_USER = By.xpath("//*[@id='login_email_username']");
	By POP_UP_LOGIN_FIELD_PASSWORD = By.xpath("//*[@id='login_password']");
	By POP_UP_LOGIN_BUTTON_LOGIN = By.xpath("(//input[@class='btn btn-info btn-block'])[2]");
	
	
	
	String LIST_OPTION = "//div[contains(@class,'autocomplete-suggestion')]/strong[contains(text(),'%s')]";
	
	
	
	public void setTheNameOfTheCity(String cityName) {
		waitForAnExplicitElement(INPUT_CITY);
		click(INPUT_CITY);
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
	
	public void pressTheButtonSearch() {
		click(BUTTON_FIND);
	}
	
	public void selectOptionFromList(String textToFind) {
		waitForAnExplicitElement(By.xpath(String.format(LIST_OPTION,textToFind)));
		click(By.xpath(String.format(LIST_OPTION,textToFind)));
	}
	
	public void loginWithUserAndPass(String user, String pass){
		waitForAnExplicitElement(BUTTON_LOGIN);
		click(BUTTON_LOGIN);
		waitForAnExplicitElement(POP_UP_LOGIN_BUTTON_LOGIN);
		sendKeysToLocator(POP_UP_LOGIN_FIELD_USER, user);
		sendKeysToLocator(POP_UP_LOGIN_FIELD_PASSWORD, pass);
		click(POP_UP_LOGIN_BUTTON_LOGIN);
	}
}
