package SeleniumPractise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropActionsConcepts {

	public static void main(String[] args) {
		// Chrome driver
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\MMeghana\\Downloads\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();

				driver.get("https://jqueryui.com/droppable/"); // launch the url
				driver.manage().window().maximize(); // maximize the window
				driver.manage().deleteAllCookies(); // delete all the cookies
				
				driver.switchTo().frame(0); // switch to frame if its available only 
				
				Actions action = new Actions(driver);
				
				action.clickAndHold(driver.findElement(By.xpath("//*[@id='draggable']")))
				.moveToElement(driver.findElement(By.xpath("//*[@id='droppable']")))
				.release()
				.build()
				.perform();

	}

}
