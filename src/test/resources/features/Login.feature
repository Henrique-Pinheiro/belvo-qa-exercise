Feature: Login at instacart.com

    #This scenario also stopped working due to the Recaptcha issue
    Scenario: Logging at instacart with an previously created account
    Given that I am at the Instacart home page
    And I click on the Log In button
    When I fill the email field with the email "cavalcante_bianca@hotmail.com"
    And the password field with the password "test@123"
    And I clik on the Log In button at the Login frame
    Then the onboarding page should be displayed