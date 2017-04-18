package com.demo.nicolas.mori;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
@CucumberOptions(plugin = { "html:target/cucumber-html-reports", "json:target/cucumber-html-reports/cucumber.json",
"junit:target/surefire-reports/cucumber-junit.xml" }, features = "src/test/resources/features", tags = "@Case_1A3", glue = {
		"com.demo.nicolas.mori.steps" })
public class AppTest extends AbstractTestNGCucumberTests {
}
