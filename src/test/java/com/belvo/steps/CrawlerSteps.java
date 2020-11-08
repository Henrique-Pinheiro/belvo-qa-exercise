package com.belvo.steps;

import com.belvo.page.objects.CrawlerPage;
import com.belvo.page.objects.HomePage;
import com.belvo.page.objects.OnboardPage;
import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Cookie;

import java.net.CookieHandler;
import java.util.Locale;

import static com.belvo.driver.DriverManager.getDriver;
import static org.junit.Assert.assertTrue;

public class CrawlerSteps {

    private Cookie cookie;

    @Given("that I have a valid Logged cookie for instacar.com")
    public void thatIHaveAValidLoggedCookieForInstacarCom() {
        CreateAccountSteps createAccountSteps = new CreateAccountSteps();
        LoginSteps loginSteps = new LoginSteps();

        createAccountSteps.thatIAmAtTheInstacarHomePage();

        loginSteps.iClickOnTheLogInButton();
        loginSteps.iFillTheEmailFieldWithTheEmail("cavalcante_bianca@hotmail.com");
        loginSteps.thePasswordFieldWithThePassword("test@123");
//        loginSteps.iClikOnTheLogInButtonAtTheLoginFrame();
//        loginSteps.theStoreHomePageShouldBeDisplayed();

        cookie = getDriver().manage().getCookieNamed("_instacart_session");

//        System.out.println("Cookie value: " + cookie.getValue());
    }

    @And("I acces the Crawler app")
    public void iAccesTheCrawlerApp() {
        getDriver().get("http://0.0.0.0:5000/");
    }

    @When("fill the _instacart_session cookie field with a valid cookie")
    public void fillThe_instacart_sessionCookieFieldWithAValidCookie() {
        CrawlerPage.action().fillSessionCookie(cookie.getValue());
    }

    @And("fill the store name field with {string}")
    public void fillTheStoreNameFieldWith(String storeName) {
        CrawlerPage.action().fillStore(storeName);
    }

    @And("click at the retrieve data! button")
    public void clickAtTheRetrieveDataButton() {
        CrawlerPage.action().clickRetrieveData();
    }

    @Then("the Crawler page should display some infos")
    public void theCrawlerPageShouldDisplaySomeInfos() {
//        TODO: Cant display the page due to Recaptcha issues
    }
}
