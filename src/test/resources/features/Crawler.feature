Feature: Belvo Crawler

  Scenario: Using the previous created test to catch the Cookies and use the Belvo Scrapper
    Given that I have a valid Logged cookie for instacar.com
    And I acces the Crawler app
    When fill the _instacart_session cookie field with a valid cookie
    And fill the store name field with "lebeau-nob-hill"
    And click at the retrieve data! button
    Then the Crawler page should display some infos