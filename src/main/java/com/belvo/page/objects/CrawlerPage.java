package com.belvo.page.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CrawlerPage {

    @FindBy(id = "session_cookie")
    private WebElement sessionCookieInput;

    @FindBy(id = "store")
    private WebElement storeInput;

    @FindBy(css = ".pure-button.pure-button-primary")
    private WebElement retrieveDataButton;

    public static CrawlerPage action(){
        return new CrawlerPage();
    }

    public CrawlerPage fillSessionCookie(String sessionCookie){
        sessionCookieInput.sendKeys(sessionCookie);
        return this;
    }
    public CrawlerPage fillStore(String storeName){
        storeInput.sendKeys(storeName);
        return this;
    }

    public CrawlerPage clickRetrieveData(){
        retrieveDataButton.click();
        return this;
    }
}
