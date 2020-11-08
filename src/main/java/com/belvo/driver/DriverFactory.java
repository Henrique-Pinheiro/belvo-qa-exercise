package com.belvo.driver;


import com.belvo.config.Configuration;
import com.belvo.config.ConfigurationManager;
import com.belvo.driver.local.LocalDriverManager;
import org.openqa.selenium.WebDriver;

public class DriverFactory {

    private DriverFactory() {
    }

    public static WebDriver createInstance(String browser) {
        Configuration configuration = ConfigurationManager.getConfiguration();
        WebDriver webdriver;
        webdriver = new LocalDriverManager().createInstance(configuration.browser());
        return webdriver;
    }
}
