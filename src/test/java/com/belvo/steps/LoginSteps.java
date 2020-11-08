package com.belvo.steps;

import com.belvo.page.objects.StoreHomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import com.belvo.page.objects.HomePage;
import static org.junit.Assert.assertTrue;

public class LoginSteps {

    @And("I click on the Log In button")
    public void iClickOnTheLogInButton() {
        HomePage.action().clickLoginBtn();
    }

    @When("I fill the email field with the email {string}")
    public void iFillTheEmailFieldWithTheEmail(String email) {
        HomePage.action().fillEmailLogin(email);
    }

    @And("the password field with the password {string}")
    public void thePasswordFieldWithThePassword(String password) {
        HomePage.action().fillPassword(password);
    }

    @And("I clik on the Log In button at the Login frame")
    public void iClikOnTheLogInButtonAtTheLoginFrame() {
        CreateAccountSteps createAccountSteps = new CreateAccountSteps();
        createAccountSteps.iClikInTheContinueButton();
    }

    @Then("the Store Home page should be displayed")
    public void theStoreHomePageShouldBeDisplayed() {
        assertTrue(
                "The store home page wasnt displayed or loaded",
                StoreHomePage.action().isHomePageDisplayed()
        );
        System.out.println("batatabat");
    }
}
