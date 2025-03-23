Feature: User login on magento

 Scenario: Successful User logged in
    Given I navigate to the login page
    When I enter email and password 
    And I click the sign in button
    Then I should see my account page
