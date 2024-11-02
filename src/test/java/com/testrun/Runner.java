package com.testrun;


import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.cucumber.java.Before;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions( 
		
		plugin = {"json:target/cucumber.json"},
		features = {"./src/main/resources/Login.feature"},
		glue = {"com.generic"},
		tags = {"@Smoke"},
		dryRun = false ,
		strict = true ,
		monochrome = true )
		
		

public class Runner extends AbstractTestNGCucumberTests  {

	
	@Before 
	public void setup() {
		
	}
	@BeforeTest
    public void setup1() {
		
	}
	@Test
    public void setup2() {
		
	}
}
