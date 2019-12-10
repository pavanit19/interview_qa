package acive.admin.stepDefinitions;

import active.admin.pageFunctions.Products_Page;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Products_Steps extends Products_Page {
	
	@When ("^open create product form from Products page$") 
	public void open_new_product_form () {
		newProduct_Form();
	}
	
	@And ("^create a product with a valid \"(.*)\" title$")
	public void create_new_product (String title) {
		create_newProdut(title);
	}
	
	@And ("^verify the above created product \"(.*)\" on Products page$")
	public void verify_product (String product) {
		verify_createdProduct(product);
	}
	
	@Then ("^verify filter option for the created product \"(.*)\" on Products page$")
	public void verify_filter (String item) {
		verify_filterOption(item);
	}

}
