package PageObjects;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Utility.Log;

public class E_ProductListing extends A_BaseClass {

	private static WebElement element;

	public E_ProductListing(WebDriver driver) {
		super(driver);
	}

	public static WebElement ProductList() throws Exception {
		element = null;
		try {

			for (int i = 1; i < 15; i++) {
				String ListText = driver.findElement(By.xpath(".//*[@id='tile-container']/div[" + i + "]")).getText();
				if (ListText.contains("Life Savers 5 Flavors Gummies")) {
					element = driver.findElement(By.xpath(".//*[@id='tile-container']/div[" + i + "]/div/div/h4/a"));
				}
				// System.out.println("The List of Elements are: " + ListText);
			}
			Log.info("The complete Title_Container is Selected");
		} catch (Exception e) {
			Log.error("Product 1 Sales Price is not found");
			throw (e);
		}
		return element;

	}

}