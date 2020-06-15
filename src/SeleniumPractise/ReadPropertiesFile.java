package SeleniumPractise;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.GeckoDriverService;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class ReadPropertiesFile {
	static WebDriver driver;

	public static void main(String[] args) throws IOException {
		
		Properties prop = new Properties();
		
		FileInputStream ip = new FileInputStream("C:\\Java Selenium\\MySelenium\\SeleniumSessions\\src\\SeleniumPractise\\config.properties");
       
		prop.load(ip); // load the property file 
		
		// Read the property file :
		System.out.println(prop.getProperty("Name"));
		System.out.println(prop.getProperty("Age"));
		String URL = prop.getProperty("URL");
		System.out.println(URL);
		String browsername = prop.getProperty("Browser");
		System.out.println(browsername);
		
		//if (browsername.equals("chrome")){
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\MMeghana\\Downloads\\chromedriver.exe");
		driver = new ChromeDriver();
		/*}else if (browsername.equals("IE")){
			System.setProperty("webdriver.internetexplorer.driver", "C:\\Users\\MMeghana\\Downloads\\chromedriver.exe");
			driver = new InternetExplorerDriver();
		}*/
		
		driver.get(URL);
		
		driver.findElement(By.xpath(prop.getProperty("Firstname_xpath"))).sendKeys(prop.getProperty("Firstname"));
		
		driver.findElement(By.xpath(prop.getProperty("Lastname_xpath"))).sendKeys(prop.getProperty("Lastname"));	
	}
}
