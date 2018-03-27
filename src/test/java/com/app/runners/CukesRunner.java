package com.app.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		plugin="html:target/cucumber",
		features="src/test/resources/com.app.features/",
		glue="com.app.stepDefinitions",
		tags= "@run1",
		dryRun=false
		)

public class CukesRunner extends AbstractTestNGCucumberTests{
	
	

}
