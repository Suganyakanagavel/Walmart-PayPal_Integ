package PageObjects;

import org.openqa.selenium.WebDriver;

public class A_BaseClass {

	public static WebDriver driver;

	public A_BaseClass(WebDriver driver) {
		A_BaseClass.driver = driver;
	}
}
