package com.demo.nicolas.mori.page.object.web;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.demo.nicolas.mori.framework.ParentPage;

public class TransactionsPage extends ParentPage {

	public TransactionsPage(WebDriver driver) {
		super(driver);
	}

	By TRX_1 = By.xpath("(//*[contains(@class,'node activity')])[1]");
	By TRX_2 = By.xpath("(//*[contains(@class,'node activity')])[2]");
	By TAB_TRANSACTIONS = By.xpath("//*[text()='TRANSACTIONS']");
	By TAB_STATEMENTS = By.xpath("//*[text()='Statements']");
	By FIELD_BROWSE_TRX = By.xpath("//*[@placeholder='Browse transactions']");

	By CONTACT_1_NAME = By.xpath("(//div[@class='address'])[1]/h2");
	By CONTACT_1_IBAN = By.xpath("(//div[@class='address'])[1]/h3");
	By CONTACT_1_BIC = By.xpath("(//div[@class='address'])[1]/h4");
	By CONTACT_1_PLUS = By.xpath("(//div[@class='address'])[1]");

	By CONTACT_2_NAME = By.xpath("(//div[@class='address'])[2]/h2");
	By CONTACT_2_IBAN = By.xpath("(//div[@class='address'])[2]/h3");
	By CONTACT_2_BIC = By.xpath("(//div[@class='address'])[2]/h4");
	By CONTACT_2_PLUS = By.xpath("(//div[@class='address'])[2]");

	By FIELD_RECIPIENT = By.xpath("//*[@name='name']");
	By FIELD_IBAN = By.xpath("//*[@name='iban']");
	By FIELD_AMOUNT = By.xpath("//*[@class='amount-euros js--amount-euros']");
	By FIELD_CENTS = By.xpath("//*[@class='amount-cents js--amount-cents']");
	By FIELD_TEXT = By.xpath("(//*[@name='description'])[2]");
	By FIELD_TRANSFER_CODE_1 = By.xpath("(//*[@type='password'])[1]");
	By FIELD_TRANSFER_CODE_2 = By.xpath("(//*[@type='password'])[2]");
	By FIELD_TRANSFER_CODE_3 = By.xpath("(//*[@type='password'])[3]");
	By FIELD_TRANSFER_CODE_4 = By.xpath("(//*[@type='password'])[4]");

	By BUTTON_TRANSFER = By.xpath("//*[@class='transfer']");

	By POP_UP_MESSAGE_TITLE = By.xpath("//*[text()='Unfortunately an error has occurred.']");
	By POP_UP_MESSAGE_TEXT = By.xpath("//*[text()='The transaction amount cannot exceed 50,000.00.']");
	By POP_UP_MESSAGE_BUTTON = By.xpath("//*[@class='btn ok single']");

	/**
	 * this method make click in the symbol declared in the feature file.
	 * 
	 */
	public void loginIntoTheApp(String user, String pass) {
		// waitForAnExplicitElement(FIELD_EMAIL);
		// sendKeysToLocator(FIELD_EMAIL, user);
		// sendKeysToLocator(FIELD_PASSWORD, pass);
		// click(BUTTON_LOGIN);
	}

}
