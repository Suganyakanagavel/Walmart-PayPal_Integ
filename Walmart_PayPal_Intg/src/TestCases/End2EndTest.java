package TestCases;

import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import AppModules.A_SignIn_Action;
import AppModules.B_Product_Search;
import AppModules.C_Product_Select;
import AppModules.D_Cart_and_Checkout;
import AppModules.E_Payment_Details;
import PageObjects.A_BaseClass;
import Utility.Constant;
import Utility.ExcelUtils;
import Utility.Log;
import Utility.Utils;

public class End2EndTest {

	public WebDriver driver;
	private String sTestCaseName;
	private int iTestCaseRow;

	@BeforeMethod
	public void beforeMethod() throws Exception {
		DOMConfigurator.configure("log4j.xml");
		sTestCaseName = this.toString();
		sTestCaseName = Utils.getTestCaseName(this.toString());
		Log.startTestCase(sTestCaseName);
		ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData, "Sheet1");
		iTestCaseRow = ExcelUtils.getRowContains(sTestCaseName, Constant.Col_TestCaseName);
		driver = Utils.OpenBrowser(iTestCaseRow);
		new A_BaseClass(driver);
	}

	@Test
	public void EndToEndTest() throws Exception {
		try {
			A_SignIn_Action.Execute(iTestCaseRow);
			B_Product_Search.Execute(iTestCaseRow);
			C_Product_Select.Execute(iTestCaseRow);
			D_Cart_and_Checkout.Execute(iTestCaseRow);
			E_Payment_Details.Execute(iTestCaseRow);
			
		} catch (Exception e) {
			Log.error("Error");
			throw (e);
		}
	}

	//@AfterMethod
	public void afterMethod() {
		Log.endTestCase(sTestCaseName);
		driver.close();
	}

}
