package SeleniumPractise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleDropDown {

	public static void main(String[] args) {
		// Chrome driver
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MMeghana\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/"); // Launch Browser
		// Create an Object of Select class 
		Select select = new Select(driver.findElement(By.id("day")));
		select.selectByVisibleText("21");
		
		Select select1 = new Select(driver.findElement(By.id("month")));
		select1.selectByVisibleText("Apr");
		
		Select select2 = new Select(driver.findElement(By.id("year")));
		select2.selectByVisibleText("1994");

	}

}
