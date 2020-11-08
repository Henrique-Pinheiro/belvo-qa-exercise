package com.belvo.page.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static com.belvo.driver.DriverManager.getDriver;

public class OnboardPage extends AbstractPageObject {

    @FindBy(xpath = "//img[@alt='Instacart logo']")
    private WebElement imgLogo;

    private WebDriverWait wait;

    public static OnboardPage action(){
        return new OnboardPage();
    }

    public boolean onboardPageIsdisplayed(){
        wait = new WebDriverWait(getDriver(), Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOf(imgLogo));
        return getDriver().getCurrentUrl().contains("onboarding");
    }


}
