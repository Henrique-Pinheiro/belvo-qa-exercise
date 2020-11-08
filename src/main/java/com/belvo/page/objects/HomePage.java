package com.belvo.page.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;


import static java.time.Duration.ofSeconds;

public class HomePage extends AbstractPageObject {

    @FindBy(xpath = "//span[text()='Groceries delivered in as little as 1 hour']")
    private WebElement homePageTitle;

    @FindBy(id = "address_line_1")
    private WebElement zipInput;

    @FindBy(xpath = "//button[@type='submit']")
    private WebElement continueBtn;

    @FindBy(id = "nextgen-authenticate.all.sign_up_email")
    private WebElement emailInputSignUp;

    @FindBy(id = "nextgen-authenticate.all.log_in_email")
    private WebElement emailInputLogin;

    @FindBy(id = "nextgen-authenticate.all.log_in_password")
    private WebElement passwordInput;

    @FindBy(xpath = "//button[text()='Log in'][1]")
    private WebElement loginBtn;

    private WebDriverWait wait;

    public static HomePage action(){
        return new HomePage();
    }

    public boolean isHomePageDisplayed() {
        return homePageTitle.isDisplayed();
    }

    public HomePage fillZipCodeField(String zip){
        zipInput.sendKeys(zip);
        return this;
    }

    public HomePage clickContinueBtn(){
        continueBtn.click();
        return this;
    }

    public HomePage fillEmailSignUp(String email){
        emailInputSignUp.sendKeys(email);
        return this;
    }
    public HomePage fillEmailLogin(String email){
        emailInputLogin.sendKeys(email);
        return this;
    }

    public HomePage fillPassword(String password){
        passwordInput.sendKeys(password);
        return this;
    }

    public HomePage clickLoginBtn(){
        loginBtn.click();
        return this;
    }
}
