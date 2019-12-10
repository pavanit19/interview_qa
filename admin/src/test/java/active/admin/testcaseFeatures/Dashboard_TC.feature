Feature: Dashboard page verification

  Scenario: Check for dashboard page options
    Given I want to open browser "Chrome"
    And I want to launch the application "http://qainterview.merchante-solutions.com:8080/admin"
    Then verify list of panels "Recent Orders,Recent Customers,ActiveAdmin Demo" on dashboard