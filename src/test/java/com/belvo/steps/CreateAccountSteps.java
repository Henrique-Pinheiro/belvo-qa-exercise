package com.belvo.steps;

import com.belvo.page.objects.HomePage;
import com.belvo.page.objects.OnboardPage;
import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.Locale;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class CreateAccountSteps {
    @Given("that I am at the Instacart home page")
    public void thatIAmAtTheInstacarHomePage() {
        assertTrue("The home page wasnt displayed or loaded", HomePage.action().isHomePageDisplayed());
    }

    @And("I fill a valid ZIP code in the Address or zip code field")
    public void iFillAValidZIPCode() {
        HomePage.action()
                .fillZipCodeField(Faker
                        .instance(Locale.US)
                        .address()
                        .zipCodeByState("NY")
                );
    }

    @And("I clik in the continue button")
    public void iClikInTheContinueButton() {
        HomePage.action()
                .clickContinueBtn();
    }

    @When("I fill the email field with a valid email")
    public void iFillTheEmailFieldWithAValidEmail() {
        HomePage.action()
                .fillEmailSignUp(Faker
                        .instance()
                        .internet()
                        .emailAddress()
                );
    }

    @And("click in the Sign up with email button")
    public void clickInTheSignUpWithEmailButton() {
        iClikInTheContinueButton();
    }

    @Then("the onboarding page should be displayed")
    public void theOnboardingPageShouldBeDisplayed() {
        assertTrue(
                "The onboard page wasnt displayed or loaded",
                OnboardPage.action().onboardPageIsdisplayed()
        );
    }
}
