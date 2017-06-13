package com.demo.nicolas.mori.steps;

import org.testng.annotations.AfterTest;

import com.demo.nicolas.mori.framework.ParentScenario;

import cucumber.api.java.en.Given;

public class StepsMobile extends ParentScenario {
	

	@Given("I login to the web application")
	public void a222() {
		System.out.println("22222222222222222222222222");
	}

	@Given("I make click in the button munich")
	public void a2222() {
		System.out.println("22222222222222222222222222");
		homePageNativeWG.makeClikInMunichButton();
		
		System.out.println("Empezando a ver los avisos");
		homePageNativeWG.makeClikInMunichButton3();
		
		try {
			Thread.sleep(333333333);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	

}