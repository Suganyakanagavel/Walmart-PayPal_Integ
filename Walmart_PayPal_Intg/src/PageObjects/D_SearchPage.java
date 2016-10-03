package PageObjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Utility.Log;

public class D_SearchPage extends A_BaseClass {

	private static WebElement element = null;
	
	public D_SearchPage(WebDriver driver) {
		super(driver);
	}
	public static WebElement SearchBox() throws Exception {
		try {
			driver.manage().window().maximize();
			//Actions action = new Actions(driver);
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			//element = driver.findElement(By.cssSelector("#search"));
			//element = driver.findElement(By.xpath(".//*[@id='global-search-input']"));
			element = driver.findElement(By.id("global-search-input"));
			  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			// WebDriverWait wait = new WebDriverWait(driver, 15);
			  ///wait.until(ExpectedConditions.elementToBeClickable(By.linkText("search"))).click();;
			Log.info("Search box is found inside the Main Page");
		} catch (Exception e) {
			Log.error("Search box is not found inside the Main Page");
			throw (e);
		}
		return element;
	}
		
	public static WebElement SearchIcon() throws Exception {
		try {
			element = driver.findElement(By.xpath(".//*[@id='global-search-form']/div/div[3]/button"));
			Log.info("Search icon is clicked");
		} catch (Exception e) {
			Log.error("Search icon is not clicked");
			throw (e);
		}
		return element;
	}
	
	
}
