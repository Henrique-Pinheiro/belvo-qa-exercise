package com.belvo.steps;


import com.belvo.config.Configuration;
import com.belvo.config.ConfigurationManager;
import com.belvo.driver.DriverFactory;
import com.belvo.driver.DriverManager;
import io.cucumber.java.*;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import static com.belvo.driver.DriverManager.getDriver;
import static com.belvo.driver.DriverManager.setDriver;


public class Hooks {

    Configuration configuration = ConfigurationManager.getConfiguration();

    @Before()
    public void beforeScenario(Scenario scenario) {

        //Create the com.belvo.driver instance, set the current com.belvo.driver instance and open the specified URL in the selenium properties
        WebDriver driver = DriverFactory.createInstance(configuration.browser());
        setDriver(driver);

        getDriver().get(configuration.url());

        getDriver().manage().window().maximize();

    }

    @BeforeStep
    public void beforeStep(Scenario scenario) {
        if (configuration.printBeforeStep()) {
            final byte[] screenshot = ((TakesScreenshot) getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", "");
        }
    }

    @AfterStep
    public void afterStep(Scenario scenario) {
        if (configuration.printAfterStep()) {
            final byte[] screenshot = ((TakesScreenshot) getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", "");
        }
    }

    @After
    public void afterScenario(Scenario scenario) {
        if (configuration.printScenarioEnd()) {
            final byte[] screenshot = ((TakesScreenshot) getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", "");
        } else if (configuration.printFailure()) {
            if (scenario.isFailed()) {
                final byte[] screenshot = ((TakesScreenshot) getDriver()).getScreenshotAs(OutputType.BYTES);
                scenario.attach(screenshot, "image/png", "");
            }
        }
        DriverManager.quit();
    }
}
