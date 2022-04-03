package org.testrunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(features = "C:\\Users\\user\\eclipse-workspace\\Cucumber\\src\\test\\resources\\FaceBookLogin.feature", 
dryRun=false, 
glue="org.step")

public class TestRunnerClass {

}
