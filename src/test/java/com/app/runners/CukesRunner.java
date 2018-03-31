package com.app.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		plugin= {
				"pretty", 
				"html:target/cucumber",
				"json:target/cucumber.json"
		},
		features="src/test/resources/com.app.features/",
		glue="com.app.stepDefinitions",
		tags= "@cur",
		dryRun=false
		)

public class CukesRunner extends AbstractTestNGCucumberTests{
	
	

}
