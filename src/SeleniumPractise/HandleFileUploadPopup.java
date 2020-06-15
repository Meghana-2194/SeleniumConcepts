package SeleniumPractise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleFileUploadPopup {

	public static void main(String[] args) {
		// Chrome driver
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MMeghana\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://cgi-lib.berkeley.edu/ex/fup.html"); // 
		
		// Click on the upload button and  send keys as location path  and make sure the type name is file
		driver.findElement(By.name("upfile")).sendKeys("C:\\Users\\MMeghana\\Downloads\\UNT TEST DECLINED APPLICATION.docx");
		
		System.out.println("Uploaded success");

	}

}
