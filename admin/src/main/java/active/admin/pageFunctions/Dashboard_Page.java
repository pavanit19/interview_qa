package active.admin.pageFunctions;

import active.admin.BusinessLibraries.BusinessKeywords;

public class Dashboard_Page extends BusinessKeywords {
	
	public static String panels_List = "//div[@class='panel']/h3";

	public static void dashboard_panels (String element) {
		try {
			veriElementsPresent(panels_List, element);
		}catch(Exception s) {
			s.printStackTrace();
		}
	}
	
}
