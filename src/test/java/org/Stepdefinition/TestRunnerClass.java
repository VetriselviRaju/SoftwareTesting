package org.Stepdefinition;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources",glue="org.Stepdefinition",monochrome=true,dryRun=false,snippets=SnippetType.CAMELCASE,tags={"@1,@2,@3,@4,@5,@6"},plugin={"html:Report","junit:Report\\junitreport.xml","json:Report\\jsonreport.json"})

public class TestRunnerClass {
	
}