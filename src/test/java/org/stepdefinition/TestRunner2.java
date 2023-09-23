package org.stepdefinition;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources", 
glue = "org.stepdefinition",
monochrome = true, 
dryRun = false, 
strict = true,
tags = "@Sanity",
plugin = {"html:Report" ,"junit:Report\\junitreport.xml","json:Report\\jsonreport.json"})
		

public class TestRunner2 {
	

}
