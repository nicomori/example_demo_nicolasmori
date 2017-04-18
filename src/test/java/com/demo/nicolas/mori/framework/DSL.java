package com.demo.nicolas.mori.framework;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.imageio.ImageIO;

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
//	protected WebDriver driver;
//
//	public DSL(WebDriver driver) {
//		this.driver = driver;
//	}
//
//	/**
//	 * @param locator,
//	 *            string to send
//	 */
//	public void sendKeysToLocator(By locator, String stringToSend) {
//		driver.findElement(locator).sendKeys(stringToSend);
//	}
//	
//	/**
//	 * this method make click in the locator received from the parameters.
//	 * 
//	 * @param locator
//	 */
//	public void click(By locator) {
//		driver.findElement(locator).click();
//	}
//
//	/**
//	 * this method get the text from a locator.
//	 * 
//	 * @param locator
//	 * @return an String with the text of the locator.
//	 */
//	public String getTextByLocator(By locator) {
//		return driver.findElement(locator).getText();
//	}
//
//	/**
//	 * this method wait until a locator appear, in total wait for 30 seconds,
//	 * and check if the locator appear 1 time per 5 miliseconds.
//	 * 
//	 * @param locator
//	 */
//	public void waitForAnExplicitElement(By locator) {
//		@SuppressWarnings("unused")
//		WebElement myDynamicElement = (new WebDriverWait(driver, 30))
//				.until(ExpectedConditions.presenceOfElementLocated(locator));
//	}
//	
//	
//	
//
//}

		private WebDriver driver;
		
		public DSL(WebDriver driver2) {
			this.driver = driver2;
		}

		/**
		 * @param locator
		 */
		public void click(By locator) {
			driver.findElement(locator).click();
		}

		/**
		 * @param locator,
		 *            string to send
		 */
		public void sendKeysToLocator(By locator, String stringToSend) {
			driver.findElement(locator).sendKeys(stringToSend);
		}

		/**
		 * 
		 */
		public void buttonBackDevice() {
			driver.navigate().back();
		}
		
		/**
		 * 
		 */
		public boolean verifyIfisDisplayed(By locator) {
			if(driver.findElement(locator).isDisplayed()){
				return true;
			}else{
			return false;
			}
		}

		/**
		 * 
		 */
		public String getTextByLocator(By locator) {
			return driver.findElement(locator).getText();
		}

		/**
		 * 
		 */
		public String verifyBolaStatusIsFailed(int index) {

			return driver.findElement(By.xpath("(//tr[contains(@id,'job_')]//td[1][" + "contains(@data,'0') or " // fail
					+ "contains(@data,'4') or " // pass
					+ "contains(@data,'5') or " // executing pass
					+ "contains(@data,'1') or " // executing fail
					+ "contains(@data,'10') or " + "contains(@data,'8')" // disable
					+ "])[" + index + "]")).getAttribute("data");
			// return
			// driver.findElement(By.xpath("(//table[@id='projectstatus']//tbody//tr//td//img[@style='width:
			// 32px; height: 32px; ' and
			// contains(@tooltip,'Failed')])["+index+"]")).isDisplayed();

			// return driver.findElement(locator).getText();
		}

		// (//tr[contains(@id,'job_')]//td[1][contains(@data,'0')])[7]

		/**
		 * 
		 */
		public String getTextNameOfTheTask(int index) {
			return driver.findElement(By.xpath("(//tr//td[3]//a[1])[" + index + "]")).getText();
		}

		/**
		 * 
		 */
		public void refreshBrowser() {
			driver.navigate().refresh();
			// return
			// driver.findElement(By.xpath("(//tr//td[3]//a[1])["+index+"]")).getText();
		}

		/**
		 * 
		 */
		public String getAverageTimeLastExecution(int index) {
			// return
			// driver.findElement(By.xpath("(//tr//td[6])["+index+"]")).getText();
			return driver.findElement(By.xpath("(//tr//td[6])[" + index + "]")).getAttribute("data");
		}

		/**
		 * 
		 */
		public void pressClickInTheSchedulerOfTheTask(String task) {
			System.out.println("Waiting for the element with the name "+task+" appear");
			@SuppressWarnings("unused")
			WebElement myDynamicElement = (new WebDriverWait(driver, 510))
					.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[contains(@href,'" + task + "')]//img[contains(@alt,'Schedule')]")));
			System.out.println("Making click in the element "+task);
			driver.findElement(By.xpath("//*[contains(@href,'" + task + "')]//img[contains(@alt,'Schedule')]")).click();
		}

		/**
		 * 
		 */
		public void waitForAnExplicitElement(By locator) {
			@SuppressWarnings("unused")
			WebElement myDynamicElement = (new WebDriverWait(driver, 30))
					.until(ExpectedConditions.presenceOfElementLocated(locator));
		}
		
		/**
		 * 
		 */
		public String getTextOfALocator(By locator) {
			return driver.findElement(locator).getText();
		}
		
		/**
		 * 
		 */
		public String getUrl() {
			return driver.getCurrentUrl();
		}
		
		

		private static final SimpleDateFormat horaActual = new SimpleDateFormat("HH");
		private static final SimpleDateFormat minutosActual = new SimpleDateFormat("mm");
		private static final SimpleDateFormat segundosActual = new SimpleDateFormat("ss");
		private static final SimpleDateFormat dayActual = new SimpleDateFormat("dd");
		private static final SimpleDateFormat monthActual = new SimpleDateFormat("MM");
		private static final SimpleDateFormat yearActual = new SimpleDateFormat("yy");

		public String getActualHour() {
			Date date = new Date();
			return horaActual.format(date);
		}

		public String getActualMinutes() {
			Date date = new Date();
			return minutosActual.format(date);
		}

		public String getActualSeconds() {
			Date date = new Date();
			return segundosActual.format(date);
		}

		public String getActualDay() {
			Date date = new Date();
			return dayActual.format(date);
		}

		public String getActualMonth() {
			Date date = new Date();
			return monthActual.format(date);
		}

		public String getActualYear() {
			Date date = new Date();
			return yearActual.format(date);
		}

		public void donwloadImage(By locatorOfTheImage,String scenarioName) throws IOException{
			System.out.println("Starting to get the data of the image");
			String s = driver.findElement(locatorOfTheImage).getAttribute("src");
	        URL url = new URL(s);
	        System.out.println("Starting to generate the buffer for the image");
	        BufferedImage bufImgOne = ImageIO.read(url);
	        System.out.println("Starting to write the image");
	        ImageIO.write(bufImgOne, "png", new File("imagesFailedScenarios/"+scenarioName+".png"));
	        System.out.println("Image download completed for the scenario "+scenarioName);
		}
		
		
		
		public void accessToAURL(String url) {
			 driver.get(url);
//			 driver.get("https://applause.automation.applause.com/?auto_refresh=true");
		}
		
		
		
		
		/**
		 * 
		 */
		public void swiftDown(By locator) {
			// driver.
		}

	}
