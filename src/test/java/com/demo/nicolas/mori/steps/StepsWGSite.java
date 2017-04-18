package com.demo.nicolas.mori.steps;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;

import com.demo.nicolas.mori.framework.ParentScenario;

import cucumber.api.java.After;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class StepsWGSite extends ParentScenario {

	@And("I set the name of the city \"(.*?)\"")
	public void stepNumber1(String cityName) {
		System.out.println("Set the name of the city");
		wg_DashboardPage.setTheNameOfTheCity(cityName);
	}
	
	@Then("I select the option of dept type and set \"(.*?)\" press the button find")
	public void stepNumber2(String deptType) {
		wg_DashboardPage.selectDeptTypeAndPressTheButtonFind(deptType);
	}
	
	@Then("I set the max value of rent to pay with the value \"(.*?)\" and press the button apply filter")
	public void stepNumber3(String maxRent) {
		wg_ResultsPage.setMaxRentAndPressApplyFilterButton(maxRent);
	}
	
	@And("I access to the options of depart")
	public void stepNumber4() {
		wg_ResultsPage.accessToResults();
	}
	
	@And("I check if the british falg exit")
	public void stepNumber5() {
	}
	
	@And("I take if exist the value of requisites and show in the screen")
	public void stepNumber6() {
	}
	
	
	
	@And("I select the value from the suggestions list with the city \"(.*?)\"")
	public void stepNumber6a(String cityToFind) {
		wg_DashboardPage.selectOptionFromList(cityToFind);
	}
	
	@And("I press the button search")
	public void stepNumber7() {
		wg_DashboardPage.pressTheButtonSearch();
		
	}
	
	@And("press click in the login button and semd user \"(.*?)\" and pass \"(.*?)\"")
	public void stepNumber8(String user, String pass) {
		wg_DashboardPage.loginWithUserAndPass(user, pass);
	}
	
	
	@And("I get the text of all the results an show this per terminal")
	public void stepNumber9() {
		wg_ResultsPage.getTitlesOfAllResults();
	}
	
	
	@After
	public void afster() {
		closeDriver();
	}
}