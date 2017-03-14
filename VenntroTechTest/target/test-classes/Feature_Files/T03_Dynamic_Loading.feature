Feature: Test With Dynamic page loading bar

  @loading_bar
  Scenario Outline: Navigating to herokuapp website and try to test Dynamic page loading in process
    Given I navigated to "<URL>"
    And I click on Dynamic Loading Example
    And I click on first link
    And I click on Start
    And I check Loading bar appears
    Then I see "Hello World!" message displayed on the page

    Examples: 
      | URL                                |
      | http://the-internet.herokuapp.com/ |
