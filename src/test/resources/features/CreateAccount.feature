Feature: Create an account at instacart.com


  #This scenario stoped workin since the website started using ReCaptha for my requests of logging only by using email
  Scenario: Creating a valid account at instacart
    Given that I am at the Instacart home page
    And I fill a valid ZIP code in the Address or zip code field
    And I clik in the continue button
    When I fill the email field with a valid email
    And click in the Sign up with email button
    Then the onboarding page should be displayed