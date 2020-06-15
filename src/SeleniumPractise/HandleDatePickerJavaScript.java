package SeleniumPractise;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.gargoylesoftware.htmlunit.javascript.background.JavaScriptExecutor;

public class HandleDatePickerJavaScript {

	 static WebDriver driver ;
	 
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MMeghana\\Downloads\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/"); // launch the url
		driver.manage().window().maximize(); // maximize the window
		driver.manage().deleteAllCookies(); // delete all the cookies
		driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
		
		WebElement date = driver.findElement(By.id("ctl00_mainContent_view_date1"));
		
		String dateVal = "31-09-2020" ;
		selectDateByJs(driver , date , dateVal );
		
		Thread.sleep(5000);
		
		driver.quit();
		
	}
	
	public static void selectDateByJs(WebDriver driver , WebElement element , String dateVal){
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].setAttribute('value','" +dateVal+"');" ,element );
		
	}

}
