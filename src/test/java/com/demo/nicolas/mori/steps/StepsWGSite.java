package com.demo.nicolas.mori.steps;

import org.testng.annotations.AfterClass;

import com.demo.nicolas.mori.framework.ParentScenario;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class StepsWGSite extends ParentScenario {

	@And("I set the name of the city \"(.*?)\"")
	public void stepNumber1(String cityName) {
//		WG_DashboardPage wg_DashboardPage = new WG_DashboardPage(driver);
		
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

	@AfterClass
	public void after() {
//		dbFlagsACero();
		closeDriver();
	}
}