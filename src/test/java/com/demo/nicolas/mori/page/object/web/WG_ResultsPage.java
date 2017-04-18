package com.demo.nicolas.mori.page.object.web;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.demo.nicolas.mori.framework.ParentPage;

public class WG_ResultsPage extends ParentPage {

	public WG_ResultsPage(WebDriver driver) {
		super(driver);
	}

	By FIELD_MAX_PRICE = By.xpath("//input[@id='max_miete']");
	By BUTTON_APPLY_FILTERS = By.xpath("//button[@id='apply_filter']");
	By OPTION_DEPTO = By.xpath("(//tbody//tr)[%s]");
//	DEL 3 al 22
	By BUTTON_NEXT_PAGE = By.xpath("(//a[contains(@href,'wg-zimmer-in-Muenchen.')]//b[@class='position-relative'])[last()]");

	By RESULT_DETAIL_BILDER_TAB = By.xpath("//*[contains(text(),'Bilder')]");
	By RESULT_DETAIL_FLAG_BRITISH = By.xpath("//img[contains(@alt,'Englisch') and contains(@title,'Englisch')]");
	By RESULT_DETAIL_REQUISITES = By.xpath("(//div[@class='col-sm-6'])[2]");
	
	
	By HOOK = By.xpath("(//*[contains(text(),'Miete')])[1]");
	String TITLE_CLUSTER = "(//h3[@class='headline headline-list-view noprint'])[%s]/a";
	
	
	public void getTitlesOfAllResults() {
		
		waitForAnExplicitElement(HOOK);
		waitForAnExplicitElement(HOOK);
		waitForAnExplicitElement(HOOK);
		waitForAnExplicitElement(HOOK);
		waitForAnExplicitElement(HOOK);
		
		for (int i = 1; i < 22; i++) {
			System.out.println(getTextByLocator(By.xpath(String.format(TITLE_CLUSTER,i))));
			
		}
	}
	
	
	
	
	
	
	
	
	public void setMaxRentAndPressApplyFilterButton(String maxRent) {
		waitForAnExplicitElement(FIELD_MAX_PRICE);
		sendKeysToLocator(FIELD_MAX_PRICE, maxRent);
		click(BUTTON_APPLY_FILTERS);
	}
	
	public void accessToResults(){
		
		
		for (int i = 3; i < 22; i++) {
			
			click(By.xpath(String.format("//tbody//tr)[%s]",i)));
			waitForAnExplicitElement(RESULT_DETAIL_BILDER_TAB);
			
			if(verifyIfisDisplayed(RESULT_DETAIL_FLAG_BRITISH)){
				System.out.println("iteracion numero "+i);
				System.out.println(getTextOfALocator(RESULT_DETAIL_REQUISITES));
				System.out.println(getUrl());
			}else{
				buttonBackDevice();
			}
			
			
		}
	}
	
	
}
