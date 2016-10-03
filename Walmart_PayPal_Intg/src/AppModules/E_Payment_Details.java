package AppModules;

import PageObjects.H_Pick_Address;
import Utility.Constant;
import Utility.ExcelUtils;
import Utility.Log;

public class E_Payment_Details {
	public static void Execute(int iTestCaseRow) throws Exception {
		
		H_Pick_Address.Continue_Button().click();
		
		String F_Name = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_FirstName);
		H_Pick_Address.Ship_FirstName().sendKeys(F_Name);
		Log.info(F_Name +" is entered as First Name on the Payment detail page");
		
		
		
		String L_Name = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_LastName);
		H_Pick_Address.Ship_LastName().sendKeys(L_Name);
		Log.info(L_Name +" is entered as Last Name on the Payment detail page");
		
		
		
		String Ph_Number = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_PhoneNumber);
		H_Pick_Address.Ship_PhoneNumber().sendKeys(Ph_Number);
		Log.info(Ph_Number +" is entered as Phone Number on the Payment detail page");
		
		
		String St_Addr = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_StreetAddress);
		H_Pick_Address.Ship_StreetAddress().sendKeys(St_Addr);
		Log.info(St_Addr +" is entered as Street Address on the Payment detail page");
		
		String Apt_No = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_AptNo);
		H_Pick_Address.Ship_Apt().sendKeys(Apt_No);
		Log.info(Apt_No +" is entered as Appartment Number on the Payment detail page");
		
		String City = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_City);
		H_Pick_Address.Ship_City().clear();
		H_Pick_Address.Ship_Apt().sendKeys(City);
		Log.info(City +" is entered as City  on the Payment detail page");
		
		String ZipCode = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_ZipCode);
		H_Pick_Address.Ship_ZipCode().clear();
		H_Pick_Address.Ship_ZipCode().sendKeys(ZipCode);
		Log.info(ZipCode +" is entered as ZipCode  on the Payment detail page");
		
	}

}
