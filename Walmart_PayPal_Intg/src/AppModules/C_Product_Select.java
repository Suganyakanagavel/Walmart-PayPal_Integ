package AppModules;

import PageObjects.E_ProductListing;

public class C_Product_Select {

	public static void Execute(int iTestCaseRow) throws Exception {
		E_ProductListing.ProductList().click();
	}

}
