package SeleniumPractise;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomXpath {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MMeghana\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.amazon.in/"); // launch the url
		driver.manage().window().maximize(); // maximize the window
		driver.manage().deleteAllCookies(); // delete all the cookies
		driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS) ;  
		
		//Relative Xpath
		driver.findElement(By.xpath("//input[@class='LM6RPg']")).sendKeys("iPhone10x");
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("iPhone10x");
		driver.findElement(By.xpath("//input[contains(@class,'LM6RPg')]")).sendKeys("iPhone10x");
		
		//Dynamic id : 
		//id = test_123, test_789 , 4567_test
		driver.findElement(By.xpath("//input[contains(@id, 'test_')]")).sendKeys("Test");
		driver.findElement(By.xpath("//input[starts-with(@id, 'test_')]")).sendKeys("Test");
		driver.findElement(By.xpath("//input[ends-with(@id, '_test')]")).sendKeys("Test");
		
		// for links using xpath
		//a;; the links are represented by 'a' tag
		
		//Customize xpath
		driver.findElement(By.xpath("//a[contains(text(),'Amazon Pay')]")).click();
//	

	}

}
