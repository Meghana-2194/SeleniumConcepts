package SeleniumPractise;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class HtmlUnitDriverConcept {

	public static void main(String[] args) {
		// Chrome driver
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\MMeghana\\Downloads\\chromedriver.exe");
				//WebDriver driver = new ChromeDriver();
				
				// There is No  Browser launching
				
				//Advantages of HtmlUnitDriver
				//1. Testing is done behind the scene : No browser launching
				//2. Very Fast : Test Execution is very fast : performance is good 
				//3. Not suitable for Actions like mouse movement,draga dn drop , double click
				//4. Ghost driver 
				WebDriver driver = new HtmlUnitDriver();

				driver.manage().window().maximize(); // maximize the window
				driver.manage().deleteAllCookies(); // delete all the cookies
				driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS) ;  
				
				driver.get("https://freecrm.co.in/"); // launch the url
				
				System.out.println("Before login : "+driver.getTitle());
				
				driver.findElement(By.xpath("/html/body/div[1]/header/div/nav/div[2]/div/div[2]/ul/a/span[1]")).click();
				driver.findElement(By.name("email")).sendKeys("buddy6jar@gmail.com");
				driver.findElement(By.name("password")).sendKeys("Buddy6jar!");
				driver.findElement(By.xpath("//*[@id='ui']/div/div/form/div/div[3]")).click();
				
				System.out.println("After login : "+driver.getTitle());
				
				

	}

}
