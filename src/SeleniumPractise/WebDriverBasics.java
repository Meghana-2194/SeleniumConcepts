package SeleniumPractise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverBasics {

	public static void main(String[] args) {

		// Chrome driver
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MMeghana\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.com");// get the url

		String title = driver.getTitle(); // get the title

		System.out.println("The title is : " + title); // print the title

		// Verify whether the title is correct or not

		if (title.equals("Google")) {
			System.out.println("Verfied : Correct Title");
		} else {
			System.out.println("Verfied : Incorrect Title");
		}

		System.out.println("Current url is : " +driver.getCurrentUrl()); // prints the current url

		// System.out.println(driver.getPageSource()); // prints the page source

		driver.quit();// Close or Quits the browsers

	}

}
