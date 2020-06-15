package SeleniumPractise;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleWindowPopup {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MMeghana\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://popuptest.com/goodpopups.html"); // launch the url
		driver.manage().window().maximize(); // maximize the window
		driver.manage().deleteAllCookies(); // delete all the cookies
		driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
		
		//Handle Window popup
		driver.findElement(By.xpath("/html/body/table[2]/tbody/tr/td/font/b/a[1]")).click();
		
		Set<String> handler = driver.getWindowHandles(); // part of collections
		
		Iterator<String> it = handler.iterator();
		//Parent Window ID 
		String parentWindowId = it.next();
		System.out.println(parentWindowId);
		
		String childWindowId= it.next();
		System.out.println(childWindowId);
		// switch to the child window
		driver.switchTo().window(childWindowId);
		
		// Print the title of the child window id and validate 
		System.out.println("Child Window ID is : "+driver.getTitle());
		
		if (driver.getTitle().equals("PopupTest Sunday March, 22 2020")){
			System.out.println("Correct ID");
		}else {
			System.out.println("In-Correct ID");
		}
		
		driver.close();
		
		//switch to parent window 
		driver.switchTo().window(parentWindowId);
		
		// Print the title of the Parent window id and validate
        System.out.println("Parent Window ID is : "+driver.getTitle());
		
		if (driver.getTitle().equals("PopupTest - test your popup killer software")){
			System.out.println("Correct ID");
		}else {
			System.out.println("In-Correct ID");
		}
		
		driver.close();

	}

}
