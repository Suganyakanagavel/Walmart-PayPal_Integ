package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Utility.Log;

public class B_HomePage extends A_BaseClass {

	public B_HomePage(WebDriver driver) {
		super(driver);
	}

	private static WebElement element = null;


	public static WebElement link_MyAccount() throws Exception {
		try {
			element = driver.findElement(By.xpath(
					"html/body/div[1]/div/div/div/header/div/div[2]/div/div/div/div/div/div[6]/div/div/div/div[2]/button"));
			Log.info("My Account link is found on the Home Page");
		} catch (Exception e) {
			Log.error("My Acocunt link is not found on the Home Page");
			throw (e);
		}
		return element;
	}
	
	public static WebElement link_Sigin() throws Exception {
		try {
			Thread.sleep(50);
			//element = driver.findElement(By.xpath(
				//	"html/body/div[1]/div/div/div/header/div/div[2]/div/div/div/div/div/div[6]/div/div/div/div[2]/div[1]/ul/li[1]/div/a"));
			element = driver.findElement(By.cssSelector(".header-GlobalAccountFlyout-link.display-block"));
			Log.info("Sign_in link is found on the Home Page");
		} catch (Exception e) {
			Log.error("Sign_in link is not found on the Home Page");
			throw (e);
		}
		return element;
	}
	


}
