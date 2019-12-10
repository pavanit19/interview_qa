package acive.admin.stepDefinitions;

import active.admin.pageFunctions.Dashboard_Page;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Dashboard_Steps extends Dashboard_Page {

	@Given ("^I want to open browser \"(.*)\"$")
	public void want_open_browser (String browser){
		openBrowser(browser);
	}
	
	@And ("^I want to launch the application \"(.*)\"$")
	public void want_launch_app (String url){
		launchApp(url);
	}
	
	@Then ("^verify list of panels \"(.*)\" on dashboard$")
	public void list_of_panels (String panels) {
		dashboard_panels(panels);
		closeBrowser();
	}
}
