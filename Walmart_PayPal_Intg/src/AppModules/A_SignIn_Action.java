package AppModules;

import org.testng.Reporter;

import PageObjects.B_HomePage;
import PageObjects.C_LoginPage;
import Utility.Constant;
import Utility.ExcelUtils;
import Utility.Log;

public class A_SignIn_Action {

	public static void Execute(int iTestCaseRow) throws Exception {

		// Verify and clicking MyAccount and SignIn button on Home Page
		B_HomePage.link_MyAccount().click();
		Log.info("Click action is performed on My Account link");
		B_HomePage.link_Sigin().click();
		Log.info("Click action is performed on SiginLink link");

		// Logging in with user name and password in the Login Page
		String Username = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_UserName);
		C_LoginPage.textbox_UserName().sendKeys(Username);
		Log.info(Username + " is entered in UserName text box");

		String Password = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_Password);
		C_LoginPage.textbox_Password().sendKeys(Password);
		Log.info(Password + " is entered in Password text box");

		C_LoginPage.button_SignIn().click();
		Log.info("Click action is performed on Submit button");

		Reporter.log("SignIn Action is successfully performed");
		Log.info("SignIn Action is successfully performed");
	}

}
