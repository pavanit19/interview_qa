Feature: Products page functionality verification

  Scenario: Check user can create a new product
    Given I want to open browser "Chrome"
    And I want to launch the application "http://qainterview.merchante-solutions.com:8080/admin"
    When open create product form from Products page
		And create a product with a valid "My Product#5" title
		Then verify the above created product "My Product#3" on Products page
		
		
	Scenario: Check filter option for the created products
    Given I want to open browser "Chrome"
    And I want to launch the application "http://qainterview.merchante-solutions.com:8080/admin"
    When open create product form from Products page
		Then verify filter option for the created product "My Product#3" on Products page