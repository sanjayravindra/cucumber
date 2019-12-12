package org.Cucumber;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\sanjay.ravindra\\eclipse-workspace\\Cucumber\\Features\\Test.feature",glue={"com.step"})	
public class Runner 
{

}
