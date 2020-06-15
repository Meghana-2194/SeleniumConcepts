package SeleniumPractise;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicWebTableHandle {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MMeghana\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://freecrm.co.in/"); // launch the url
		driver.manage().window().maximize(); // maximize the window
		driver.manage().deleteAllCookies(); // delete all the cookies
		driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
		// Loogin to the page 

		driver.findElement(By.xpath("/html/body/div[1]/header/div/nav/div[2]/div/div[2]/ul/a/span[1]")).click();
		
		Thread.sleep(5000);
		driver.findElement(By.name("email")).sendKeys("buddy6jar@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Buddy6jar!");
		driver.findElement(By.xpath("//*[@id='ui']/div/div/form/div/div[3]")).click();
		
		Thread.sleep(5000);
		
		//click on Contacts 
		driver.findElement(By.xpath("//*[@id='main-nav']/a[3]/span")).click();
		
		//*[@id="ui"]/div/div[2]/div[2]/div/div[2]/table/tbody/tr[1]/td[2]
		//*[@id="ui"]/div/div[2]/div[2]/div/div[2]/table/tbody/tr[2]/td[2]
		//*[@id="ui"]/div/div[2]/div[2]/div/div[2]/table/tbody/tr[3]/td[2]
		
		Thread.sleep(5000);
		//Method 1: Donot refer this much 
		/*String before_xpath = "//*[@id='ui']/div/div[2]/div[2]/div/div[2]/table/tbody/tr[";
		String after_xpath = "]/td[2]";
		
		for (int i = 1 ; i <= 3 ; i++){
			String name = driver.findElement(By.xpath(before_xpath+i+after_xpath)).getText();
			System.out.println(name);
			if (name.contains("test1234 test1234 test1234")){
				//*[@id="ui"]/div/div[2]/div[2]/div/div[2]/table/tbody/tr[
				// ]/td[1]/div/label
				driver.findElement(By.xpath("//*[@id='ui']/div/div[2]/div[2]/div/div[2]/table/tbody/tr["+i+"]/td[1]/div/label")).click();
			}
		}*/
		
		//Method : 2
		//1. Using Custom Xpath 
		//2. Using parent and preceding -sibling tag
		driver.findElement(By.xpath("//a[contains(text(),'test1234')]/parent::td//preceding-sibling::td//input[@name='id']")).click();
	}

}
