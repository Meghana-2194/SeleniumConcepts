package SeleniumPractise;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsConcepts {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MMeghana\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.amazon.in/"); // launch the url
		driver.manage().window().maximize(); // maximize the window
		driver.manage().deleteAllCookies(); // delete all the cookies
		driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS) ; 
		
		//1. Get the total count of the links on the page :
		List<WebElement> linkList = driver.findElements(By.tagName("a"));
		
		System.out.println(linkList.size()); // prints the size of the links
		
		// 2. Get the text of each links on the page :
		
		for (int i = 0 ; i < linkList.size(); i++){
			String linkText = linkList.get(i).getText();
			System.out.println(linkText);
		}

	}

}
