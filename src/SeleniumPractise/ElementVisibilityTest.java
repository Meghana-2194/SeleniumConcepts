package SeleniumPractise;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementVisibilityTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MMeghana\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.spicejet.com/"); // launch the url
		driver.manage().window().maximize(); // maximize the window
		driver.manage().deleteAllCookies(); // delete all the cookies
		driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
		
		//isDisplayed 
		boolean b1 = driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).isDisplayed();
		System.out.println(b1);
		
		// isEnabled
		boolean b2 = driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).isEnabled();
		System.out.println(b2);
		
		//isSelected : applicable for : checkbox, dropdown,radiobutton
		boolean b3 = driver.findElement(By.name("ctl00$mainContent$chk_friendsandfamily")).isSelected();
		System.out.println(b3);
		driver.findElement(By.name("ctl00$mainContent$chk_friendsandfamily")).click();
		
		//deSelect 
		boolean b4 = driver.findElement(By.name("ctl00$mainContent$chk_friendsandfamily")).isSelected();
		System.out.println(b4);

	}

}
