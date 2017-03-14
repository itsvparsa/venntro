Feature: Getting the data from Web Table

  @Webtable
  Scenario Outline: Navigating to herokuapp website and try to get the email address from Web Table
    Given I navigated to "<URL>"
    And I click on Sortable Data Tables Example
    And I Get the Email address is displaying for Jason Doe

    Examples: 
      | URL                                |
      | http://the-internet.herokuapp.com/ |
