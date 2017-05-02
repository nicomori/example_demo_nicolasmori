package com.demo.nicolas.mori.page.object.web;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.demo.nicolas.mori.framework.ParentPage;
import com.demo.nicolas.mori.objects.ApartmentsDetails;

public class WG_ResultsPage extends ParentPage {

	public WG_ResultsPage(WebDriver driver) {
		super(driver);
	}

	By FIELD_MAX_PRICE = By.xpath("//input[@id='max_miete']");
	By BUTTON_APPLY_FILTERS = By.xpath("//button[@id='apply_filter']");
	By OPTION_DEPTO = By.xpath("(//tbody//tr)[%s]");
	// DEL 3 al 22
	By BUTTON_NEXT_PAGE = By
			.xpath("(//a[contains(@href,'wg-zimmer-in-Muenchen.')]//b[@class='position-relative'])[last()]");

	By RESULT_DETAIL_BILDER_TAB = By.xpath("//*[contains(text(),'Bilder')]");
	By RESULT_DETAIL_FLAG_BRITISH = By.xpath("//img[contains(@alt,'Englisch') and contains(@title,'Englisch')]");
	By RESULT_DETAIL_REQUISITES = By.xpath("(//div[@class='col-sm-6'])[2]");

	
	By TEXT_AREA = By.xpath("//textarea");
	
	//String q = "»";
	
	String juan = "(//a[contains(@href,'wg-zimmer-in-Muenchen.90.')]/b[contains(text(),'')])[last()]";
	

	
	
	By LINK_TO_NEXT_PAGE = By.xpath("(//nav/ul[@class='pagination pagination-sm']/li/a)[last()]");

	By HOOK = By.xpath("(//*[contains(text(),'Miete')])[1]");
	String TITLE_CLUSTER = "(//h3[@class='headline headline-list-view noprint'])[%s]/a";

	public void getTitlesOfAllResults() {
		String pepe = null;

		for (int f = 1; f < 31; f++) {

			pepe = null;
			System.out.println("iniciando pagina numero: " + f);

			System.out.println("Starting to collect the titles of the page.");

			System.out.println("Waiting for the element HOOK appear in the screen");
			waitForAnExplicitElement(HOOK);
			System.out.println("The Element HOOK appear, we can continue");

			System.out.println("Starting to collect the first title.");
			do {
				pepe = getTextByLocator(By.xpath(String.format(TITLE_CLUSTER, 1)));
				try {
					Thread.sleep(2000);
				} catch (Exception e) {
					// TODO: handle exception
				}
			} while (pepe == null);
			
			System.out.println("Starting to collect all the titles, and show this per screen");
			System.out.println("\n--------------------\n");
			for (int i = 1; i < 20; i++) {
				
				System.out.println("Page = "+f+" - Element Number = "+i+" - "+getTextByLocator(By.xpath(String.format(TITLE_CLUSTER, i))));
			}
			System.out.println("\n===========================================================");
			System.out.println("Finish with the collections of titles. For the page: " + f);
			System.out.println("===========================================================\n");
			
			scrollDown();
			
			try {
				Thread.sleep(3000);
			} catch (Exception e) {
				// TODO: handle exception
			}
			click(LINK_TO_NEXT_PAGE);
			try {
				Thread.sleep(3000);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
	
	
	
	public void clickInAllTheTitles() {
		String pepe = null;

		for (int f = 1; f < 31; f++) {

			pepe = null;
			System.out.println("iniciando pagina numero: " + f);

			System.out.println("Starting to collect the titles of the page.");

			System.out.println("Waiting for the element HOOK appear in the screen");
			waitForAnExplicitElement(HOOK);
			System.out.println("The Element HOOK appear, we can continue");

			System.out.println("Starting to collect the first title.");
			do {
				pepe = getTextByLocator(By.xpath(String.format(TITLE_CLUSTER, 1)));
				try {
					Thread.sleep(2000);
				} catch (Exception e) {
					// TODO: handle exception
				}
			} while (pepe == null);
			
			System.out.println("Starting to collect all the titles, and show this per screen");
			System.out.println("\n--------------------\n");
			for (int i = 1; i < 20; i++) {
				stopBrowserLoad();
				
				System.out.println("Page = "+f+" - Element Number = "+i+" - "+getTextByLocator(By.xpath(String.format(TITLE_CLUSTER, i))));
				
				System.out.println("=========================");
				System.out.println("=========================");
				System.out.println("=========================");
				System.out.println("=========================");
				System.out.println("=========================");
				System.out.println("=========================");
				System.out.println("=========================");
				System.out.println("=========================");
				System.out.println("=========================");
				System.out.println("=========================");
				System.out.println("=========================");
				System.out.println("=========================");
				
				clickJS(By.xpath(String.format(TITLE_CLUSTER, i)));
				stopBrowserLoad();
				
				clickJS(TEXT_AREA);
				stopBrowserLoad();
				sendKeysToLocator(TEXT_AREA, ".");
				stopBrowserLoad();
				
//				try {
//					Thread.sleep(3000);
//				} catch (Exception e) {
//					// TODO: handle exception
//				}
				
				buttonBackDevice();
				
				
			}
			System.out.println("\n===========================================================");
			System.out.println("Finish with the collections of titles. For the page: " + f);
			System.out.println("===========================================================\n");
			
			scrollDown();
			
			try {
				Thread.sleep(3000);
			} catch (Exception e) {
				// TODO: handle exception
			}
			click(LINK_TO_NEXT_PAGE);
			try {
				Thread.sleep(3000);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
	
	String CLUSTERS_OF_APARTMENTS = "//h3[@class='headline headline-list-view noprint']/a";
	
	public void getAllTheApartments() {
		
		List<ApartmentsDetails> apartamentList = new ArrayList<ApartmentsDetails>();
		apartamentList  = storeDataInAList(CLUSTERS_OF_APARTMENTS);
		
		for (int i = 0; i < apartamentList.size(); i++) {
			
			System.out.println(apartamentList.get(i).getTitle());
			
		}
		
	}
	

	public void makeClickInTheNextPage() {
		click(LINK_TO_NEXT_PAGE);
	}

	public void setMaxRentAndPressApplyFilterButton(String maxRent) {
		waitForAnExplicitElement(FIELD_MAX_PRICE);
		sendKeysToLocator(FIELD_MAX_PRICE, maxRent);
		click(BUTTON_APPLY_FILTERS);
	}

	public void accessToResults() {

		for (int i = 3; i < 22; i++) {

			click(By.xpath(String.format("//tbody//tr)[%s]", i)));
			waitForAnExplicitElement(RESULT_DETAIL_BILDER_TAB);

			if (verifyIfisDisplayed(RESULT_DETAIL_FLAG_BRITISH)) {
				System.out.println("iteracion numero " + i);
				System.out.println(getTextOfALocator(RESULT_DETAIL_REQUISITES));
				System.out.println(getUrl());
			} else {
				buttonBackDevice();
			}

		}
	}

}
