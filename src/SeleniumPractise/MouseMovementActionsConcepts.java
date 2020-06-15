package SeleniumPractise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseMovementActionsConcepts {

	public static void main(String[] args) throws InterruptedException {
		// Chrome driver
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MMeghana\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.spicejet.com/"); // launch the url
		
		driver.manage().window().maximize(); // maximize the window
		
		driver.manage().deleteAllCookies(); // delete all the cookies

		Actions action = new Actions(driver); // actions for mouse movement

		action.moveToElement(driver.findElement(By.linkText("ADD-ONS"))).build().perform(); // Node

		Thread.sleep(5000); // wait for 5 sec

		driver.findElement(By.linkText("Friends and Family")).click(); // sub node

	}

}
