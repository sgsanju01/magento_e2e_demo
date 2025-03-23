Feature: User Signup on magento

 Scenario: Successful User Registration
    Given I navigate to the signup page
    When I enter registration details
    And I click the signup button
    Then I should see a success message
