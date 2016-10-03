package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Utility.Log;

public class G_Checkout extends A_BaseClass {
	
	private static WebElement element;

		public G_Checkout(WebDriver driver) {
		super(driver);
	}

		public static WebElement Popup_CheckoutButton() throws Exception {
			try {
				element = driver.findElement(By.xpath(".//*[@id='PACCheckoutBtn']"));
				Log.info("Checkout Button is Found");
			} catch (Exception e) {
				Log.error("Checkout Button is not Found");
				throw (e);
			}
			return element;
		}

}
