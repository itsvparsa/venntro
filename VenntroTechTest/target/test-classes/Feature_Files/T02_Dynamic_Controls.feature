Feature: Test with Dynamic Controls

  @Dynamic
  Scenario Outline: Navigating to herokuapp website and try to See Dynamic Controls are appearing & disappearing based on action
    Given I navigated to "<URL>"
    And I click on Dynamic Controls Example
    And I verify Checkbox is Displayed
    And I click on "Remove" button
    And I see Checkbox is disappeared
    And I see a confirmation message as "It's gone!"
    When I click on "Add" button
    Then I see Checkbox is appeared
    And I see a confirmation message as "It's back!"

    Examples: 
      | URL                                |
      | http://the-internet.herokuapp.com/ |
