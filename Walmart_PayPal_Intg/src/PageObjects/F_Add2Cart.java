package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Utility.Log;

public class F_Add2Cart extends A_BaseClass {

	private static WebElement element;
	
	public F_Add2Cart(WebDriver driver) {
		super(driver);	
	}
	public static WebElement Product_Name() throws Exception {
		try {
			element = driver.findElement(By.xpath("html/body/div[2]/section/section[4]/div[2]/div[1]/div[4]/div/h1/span"));
			Log.info("Product Name is Found");
		} catch (Exception e) {
			Log.error("Product Name is not Found");
			throw (e);
		}
		return element;
	}
	
	public static WebElement Product_Image() throws Exception {
		try {
			element = driver.findElement(By.xpath("html/body/div[2]/section/section[4]/div[2]/div[1]/div[5]/div[1]/div/div/div[2]/div/div[1]/div[1]/div/div/div/img"));
			Log.info("Product Image is Found");
		} catch (Exception e) {
			Log.error("Product Image is not Found");
			throw (e);
		}
		return element;
	}

	public static WebElement Product_Price() throws Exception {
		try {
			element = driver.findElement(By.xpath("html/body/div[2]/section/section[4]/div[2]/div[1]/div[5]/div[2]/div/div[2]/div[1]/div/div[1]/div/div[2]/div/div[1]"));
			Log.info("Product Price is Available");
		} catch (Exception e) {
			Log.error("Product Price is not Available");
			throw (e);
		}
		return element;
	}
	

	public static WebElement AddtoCart() throws Exception {
		try {
			//element = driver.findElement(By.xpath(".//*[@id='WMItemAddToCartBtn']"));
			element = driver.findElement(By.cssSelector("#WMItemAddToCartBtn"));
			Log.info("AddtoCart Button is Available");
		} catch (Exception e) {
			Log.error("AddtoCart Button is not Available");
			throw (e);
		}
		return element;
	}
}
