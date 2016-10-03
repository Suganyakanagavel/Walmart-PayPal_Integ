package AppModules;

import PageObjects.F_Add2Cart;
import PageObjects.G_Checkout;
import Utility.Constant;
import Utility.ExcelUtils;
import Utility.Log;

public class D_Cart_and_Checkout {
	public static void Execute(int iTestCaseRow) throws Exception {

		// ProductDetailVerification
		String Pro_name = F_Add2Cart.Product_Name().getText();
		if (Pro_name.equalsIgnoreCase(ExcelUtils.getCellData(iTestCaseRow, Constant.Col_ProductType)))
			;
		{
			Log.info("Product Name is Same");
			System.out.println("Product Name is : " + Pro_name);
		}

		String Pro_Price = F_Add2Cart.Product_Price().getText();
		if (Pro_Price.equalsIgnoreCase(ExcelUtils.getCellData(iTestCaseRow, Constant.Col_ProductPrice)))
			;
		{
			Log.info("Product Price is Same");
			System.out.println("Product Price is : " + Pro_Price);
		}
		// Add2Cart
		F_Add2Cart.AddtoCart().click();
		Log.info("Add to Cart Button is Clicked");

		// Checkout
		G_Checkout.Popup_CheckoutButton().click();
		Log.info("Checkout Button is Clicked");

	}

}
