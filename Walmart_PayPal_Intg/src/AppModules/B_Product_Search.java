package AppModules;

import PageObjects.D_SearchPage;
import Utility.Constant;
import Utility.ExcelUtils;
import Utility.Log;

public class B_Product_Search {

	public static void Execute(int iTestCaseRow) throws Exception {

		String ProductToBeSearched = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_ProductName);
		D_SearchPage.SearchBox().sendKeys(ProductToBeSearched);
		Log.info(ProductToBeSearched + " is entered in Search box");

		D_SearchPage.SearchIcon().click();
		Log.info("Search Icon is Clicked");
		Log.info("Landed into the product Listing Page");
		Log.info("Searching Successful");

	}

}
