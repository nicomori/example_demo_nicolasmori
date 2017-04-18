package com.demo.nicolas.mori.page.object.web;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.demo.nicolas.mori.framework.ParentPage;

public class WG_ResultsDetailPage extends ParentPage {

	public WG_ResultsDetailPage(WebDriver driver) {
		super(driver);
	}

	By FLAG_BRITISH = By.xpath("//img[contains(@alt,'Englisch') and contains(@title,'Englisch')]");
	By REQUISITES = By.xpath("(//div[@class='col-sm-6'])[2]");
	
	
	public void clickOnTheButtonOpenReturnAndButtonReturnAndReturnDate() {
//		waitForAnExplicitElement(BUTTON_OPEN_RETURN);
//		click(BUTTON_OPEN_RETURN);
//		click(BUTTON_RETURN);
//		click(BUTTON_RETURN_DATE);
	}
	
	
}
