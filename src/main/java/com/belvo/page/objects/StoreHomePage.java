package com.belvo.page.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static com.belvo.driver.DriverManager.getDriver;

public class StoreHomePage extends AbstractPageObject {

    @FindBy(xpath = "//img[@alt='Instacart']")
    private WebElement imgLogo;

    private WebDriverWait wait;

    public static StoreHomePage action(){
        return new StoreHomePage();
    }

    public boolean isHomePageDisplayed() {
        wait = new WebDriverWait(getDriver(), Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOf(imgLogo));
        return getDriver().getCurrentUrl().contains("onboarding");
    }
}
