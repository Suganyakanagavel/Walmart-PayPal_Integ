package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Utility.Log;

public class C_LoginPage extends A_BaseClass {

	private static WebElement element = null;

	public C_LoginPage(WebDriver driver) {
		super(driver);

	}

	public static WebElement textbox_UserName() throws Exception {
		try {
			element = driver.findElement(By.name("email"));
			Log.info("Username text box is found on the Login Page");
		} catch (Exception e) {
			Log.error("UserName text box is not found on the Login Page");
			throw (e);
		}
		return element;
	}

	public static WebElement textbox_Password() throws Exception {
		try {
			element = driver.findElement(By.name("password"));
			Log.info("Password text box is found on the Login page");
		} catch (Exception e) {
			Log.error("Password text box is not found on the Login Page");
			throw (e);
		}
		return element;
	}

	public static WebElement button_SignIn() throws Exception {
		try {
			element = driver.findElement(By.xpath("html/body/div[1]/div/div/div[2]/div/section/form/div[4]/button"));
			Log.info("Sign In button is found on the Login page");
		} catch (Exception e) {
			Log.error("Sign In button is not found on the Login Page");
			throw (e);
		}
		return element;
	}

}
