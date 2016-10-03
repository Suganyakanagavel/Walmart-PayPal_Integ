package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Utility.Log;

public class H_Pick_Address extends A_BaseClass {
	
	private static WebElement element;
	
	public H_Pick_Address(WebDriver driver) {
		super(driver);
	}
	public static WebElement Continue_Button() throws Exception {
		try {
			element = driver.findElement(By.xpath("html/body/div[1]/div/div[2]/div/div[4]/div/div/div/div[2]/div[2]/div/div/div/div/div/div/div[3]/button"));
			Log.info("Continue Button is Found");
		} catch (Exception e) {
			Log.error("Continue Button is not Found");
			throw (e);
		}
		return element;
	}
	
	public static WebElement Ship_FirstName() throws Exception {
		try {
			element = driver.findElement(By.xpath("html/body/div[1]/div/div[2]/div/div[4]/div/div/div/div[3]/div[2]/div/div/div/div/div/div/div/div/div/form/div/div/div/div[1]/label[1]/div/input"));
			Log.info("First Name Text Box is Found");
		} catch (Exception e) {
			Log.error("First Name Text Box is not Found");
			throw (e);
		}
		return element;
	}
	public static WebElement Ship_LastName() throws Exception {
		try {
			element = driver.findElement(By.xpath("html/body/div[1]/div/div[2]/div/div[4]/div/div/div/div[3]/div[2]/div/div/div/div/div/div/div/div/div/form/div/div/div/div[1]/label[2]/div/input"));
			Log.info("Last Name Text Box is Found");
		} catch (Exception e) {
			Log.error("Last Name Text Box is not Found");
			throw (e);
		}
		return element;
	}
	
	public static WebElement Ship_PhoneNumber() throws Exception {
		try {
			element = driver.findElement(By.xpath("html/body/div[1]/div/div[2]/div/div[4]/div/div/div/div[3]/div[2]/div/div/div/div/div/div/div/div/div/form/div/div/div/div[1]/label[3]/div/input"));
			Log.info("PhoneNumber Text Box is Found");
		} catch (Exception e) {
			Log.error("Phone Number Text Box is not Found");
			throw (e);
		}
		return element;
	}
	
	public static WebElement Ship_StreetAddress() throws Exception {
		try {
			element = driver.findElement(By.xpath("html/body/div[1]/div/div[2]/div/div[4]/div/div/div/div[3]/div[2]/div/div/div/div/div/div/div/div/div/form/div/div/div/div[2]/label[1]/div/input"));
			Log.info("Street Address Text Box is Found");
		} catch (Exception e) {
			Log.error("Street Address Text Box is not Found");
			throw (e);
		}
		return element;
	}
	public static WebElement Ship_Apt() throws Exception {
		try {
			element = driver.findElement(By.xpath("html/body/div[1]/div/div[2]/div/div[4]/div/div/div/div[3]/div[2]/div/div/div/div/div/div/div/div/div/form/div/div/div/div[2]/label[2]/div/input"));
			Log.info("Apt Text Box is Found");
		} catch (Exception e) {
			Log.error("Apt Text Box is not Found");
			throw (e);
		}
		return element;
	}
	public static WebElement Ship_City() throws Exception {
		try {
			element = driver.findElement(By.xpath("html/body/div[1]/div/div[2]/div/div[4]/div/div/div/div[3]/div[2]/div/div/div/div/div/div/div/div/div/form/div/div/div/div[2]/label[3]/div/input"));
			Log.info("City Text Box is Found");
		} catch (Exception e) {
			Log.error("City Text Box is not Found");
			throw (e);
		}
		return element;
	}
	public static WebElement Ship_ZipCode() throws Exception {
		try {
			element = driver.findElement(By.xpath("html/body/div[1]/div/div[2]/div/div[4]/div/div/div/div[3]/div[2]/div/div/div/div/div/div/div/div/div/form/div/div/div/div[2]/div/div[2]/label/div/input"));
			Log.info("ZipCode Text Box is Found");
		} catch (Exception e) {
			Log.error("ZipCode Text Box is not Found");
			throw (e);
		}
		return element;
	}
	

}
