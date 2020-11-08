package com.belvo.runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;


@CucumberOptions(
        features = {"src/test/resources/features/"},
        plugin = {"json:target/cluecumber-report/json/cucumber.json", "junit:target/junit.xml"},
        glue = {"com.belvo.steps"},
        tags = ""
)
public class RunCucumberTest extends AbstractTestNGCucumberTests {


    //Set parallel to false for default execution
    //Set the Thread limit using the mvn option "-Ddataproviderthreadcount=<numberOfThreads>"
    @Override
    @DataProvider(parallel = false)
    public Object[][] scenarios() {
        return super.scenarios();
    }
}

