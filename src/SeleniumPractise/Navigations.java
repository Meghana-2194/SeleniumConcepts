package SeleniumPractise;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigations {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MMeghana\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.com/"); // launch the url
		driver.manage().window().maximize(); // maximize the window
		driver.manage().deleteAllCookies(); // delete all the cookies
		driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);

		// Navigate : use to launch the external URL
		driver.navigate().to("https://www.amazon.in/");

		// come back
		driver.navigate().back();
		Thread.sleep(3000);

		// move forward
		driver.navigate().forward();
		Thread.sleep(3000);

		// come back again
		driver.navigate().back();
		Thread.sleep(3000);

	}

}
