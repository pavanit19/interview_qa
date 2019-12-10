package active.admin.pageFunctions;

import active.admin.BusinessLibraries.BusinessKeywords;

public class Products_Page extends BusinessKeywords {
	
	public static String Products_tab = "//li[@id='products']";
	public static String newProduct_btn = "//span[@class='action_item']/a";
	public static String product_title = "//input[@id='product_title']";
	public static String product_description = "//textarea[@id='product_description']";
	public static String product_author = "//input[@id='product_author']";
	public static String product_price = "//input[@id='product_price']";
	public static String product_availableOn_Yr = "//select[@id='product_available_on_1i']";
	public static String product_availableOn_Month = "//select[@id='product_available_on_2i']";
	public static String product_availableOn_Day = "//select[@id='product_available_on_3i']";	
	public static String product_imgFileNme = "//input[@id='product_image_file_name']";
	public static String createProduct_btn = "//input[@name='commit']";
	public static String createdproduct_title = "//td[@class='product']/a";
	public static String filter_title = "//div[@id='q_title_input']/select";
	public static String filter_titleInput = "//input[@id='q_title']";
	public static String filter_btn = "//input[@value='Filter']";
	

	public static void newProduct_Form () {
		clickButton(Products_tab);		
	}
	
	public static void create_newProdut (String pTitle) {
		clickButton(newProduct_btn);
		enterText(product_title, pTitle);
		enterText(product_description, "My product description long text");
		enterText(product_author, "My Author");
		enterText(product_price, "$12.25");
		selectItem(product_availableOn_Yr, "2019");
		selectItem(product_availableOn_Month, "April");
		selectItem(product_availableOn_Day, "9");
		enterText(product_imgFileNme, "Image.png");
		clickButton(createProduct_btn);
	}
	
	public static void verify_createdProduct (String title) {
		verifyElementPresent(createdproduct_title, title);
		closeBrowser();
	}
	
	public static void verify_filterOption (String item) {
		selectItem(filter_title, "Contains");
		enterText(filter_titleInput, item);
		clickButton(filter_btn);
		verifyElementPresent(createdproduct_title, item);
		closeBrowser();
	}
	
}
