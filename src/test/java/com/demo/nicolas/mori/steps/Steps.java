package com.demo.nicolas.mori.steps;

import com.demo.nicolas.mori.framework.ParentScenario;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;

public class Steps extends ParentScenario {
	
	@Given("I start the android native calculator with this device \"(.*)?\"")
	public void accessTheAndroid(String uuid) {
		startAndroid(uuid);
	}

	@Given("I start the browser")
	public void accessToTheBrowser() {
		startBrowser();
	}


	@And("I access to this url \"(.*)?\"")
	public void a111(String url) {
		System.out.println("1111111111111111111111111111111");
		navigateTo(url);
	}


	



}