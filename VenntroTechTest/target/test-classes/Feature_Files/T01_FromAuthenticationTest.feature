Feature: Login test with Valid Credentials and Invalid Credentials

  @login
  Scenario Outline: Navigating to herokuapp website and try to login with valid credentials and invalid credentials
    Given I navigated to "<URL>"
    And I click on From Auntication Example
    And I enter username as "<Username>"
    And I enter password as "<Password>"
    When I click on Login button
    Then I am able to see login validation "<Message>" on the page

    Examples: 
      | URL                                | Username | Password             | Message                        |
      | http://the-internet.herokuapp.com/ | tomsmith | SuperSecretPassword! | You logged into a secure area! |
      | http://the-internet.herokuapp.com/ | Vijay    | SuperWrongPassword!  | Your username is invalid!      |
