package SeleniumPractise;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopup {

	public static void main(String[] args) throws InterruptedException {
		// Chrome driver
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MMeghana\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://mail.rediff.com/cgi-bin/login.cgi"); // go to rediff
																	// mail

		driver.findElement(By.name("proceed")).click(); // click on sign in
														// button

		Thread.sleep(5000); // wait for 5 secs

		Alert alert = driver.switchTo().alert(); // handle alert pop up

		System.out.println(alert.getText()); // get the text of the alert

		String text = alert.getText();

		if (text.equals("Please enter a valid user name")) {
			System.out.println("Correct Alert message");
		} else {
			System.out.println("In-Correct Alert message");
		}

		alert.accept(); // click on OK button

		/* alert.dismiss(); // if cancel button is there , then use it */

	}

}
