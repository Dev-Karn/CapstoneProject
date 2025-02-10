Feature: End-to-End Testing of the Internet Herokuapp
	Background:
	Given I open the homepage

  Scenario: Verify Home Page Title

    Then I verify the page title is "The Internet"

  Scenario: Validate A/B Testing Page
    
    When I click on "A/B Testing" link
    Then I verify the text on the page as "A/B Test Variation 1"
#    And  I navigate back to Home Page

  Scenario: Validate Dropdown Selection

    When I click on "Dropdown" text
    Then I select "Option 1" from dropdown
    Then I verify "Option 1" is selected
    And I navigate back to Home Page

  Scenario: Validate Frames Page
    
    When I click on "Frames" link
    Then I verify "Nested Frames" link is present
    Then I verify "iFrame" link is present

