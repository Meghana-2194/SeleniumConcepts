package SeleniumPractise;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleCalendarConcept {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MMeghana\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.com/"); // launch the url
		driver.manage().window().maximize(); // maximize the window
		driver.manage().deleteAllCookies(); // delete all the cookies
		driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
		
		
		// Login to the page 

		driver.findElement(By.xpath("//span[contains(text() , 'Log In')]")).click();
		
		Thread.sleep(5000);
		driver.findElement(By.name("email")).sendKeys("buddy6jar@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Buddy6jar!");
		driver.findElement(By.xpath("//div[contains(text() , 'Login')]")).click();
		
		driver.findElement(By.xpath("//span[contains(text() , 'Calendar')]")).click();
		
		
		

	}

}
