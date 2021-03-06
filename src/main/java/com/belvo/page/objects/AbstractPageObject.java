

package com.belvo.page.objects;

import com.belvo.config.*;
import com.belvo.driver.DriverManager;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class AbstractPageObject {

    protected AbstractPageObject() {
        Configuration configuration = ConfigurationManager.getConfiguration();
        int timeout = Integer.parseInt(configuration.timeout());

        PageFactory.initElements(new AjaxElementLocatorFactory(DriverManager.getDriver(), timeout), this);
    }
}
