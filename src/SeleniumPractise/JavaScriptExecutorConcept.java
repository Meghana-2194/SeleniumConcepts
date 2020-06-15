package SeleniumPractise;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class JavaScriptExecutorConcept {

	public static void main(String[] args) throws IOException, Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MMeghana\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://freecrm.co.in/"); // launch the url
		driver.manage().window().maximize(); // maximize the window
		driver.manage().deleteAllCookies(); // delete all the cookies
		driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);

		driver.findElement(By.xpath("/html/body/div[1]/header/div/nav/div[2]/div/div[2]/ul/a/span[1]")).click();
		driver.findElement(By.name("email")).sendKeys("buddy6jar@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Buddy6jar!");
		// driver.findElement(By.xpath("//*[@id='ui']/div/div/form/div/div[3]")).click();
		
        Thread.sleep(5000);
		// need to high light this
		WebElement loginButton = driver.findElement(By.xpath("//*[@id='ui']/div/div/form/div/div[3]"));

		// high light the specific element
		//call flash method : highlight the element
		flash(loginButton, driver); 
		
		// call drawBorder method : draw the Border for the element
		drawBorder(loginButton, driver); 

		// Take Screenshot
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		// Copy the screenshots and save to the desired path
		FileHandler.copy(src,new File("C:\\Java Selenium\\MySelenium\\SeleniumSessions\\src\\SeleniumPractise\\highlight.png"));

		// generateAlert(driver, "There is an issue with login button");// call generateAlert method
		clickElementByJs(loginButton, driver); // call clickElementByJs method
		Thread.sleep(5000);
		
		//call Refresh method 
		refreshUisngJs(driver);
		Thread.sleep(5000);
		
		//call getTitle method
		System.out.println("title is : " +getTitleUsingJs(driver));
		
		// call innerPageTextByJs method 
		System.out.println("title is : " +innerPageTextByJs(driver));
		
		// call scrollDownBy method 
		scrollDownBy(driver);
		
		// call  scrollIntoView method 
		WebElement title  = driver.findElement(By.xpath("/html/body/div[1]/main/section[3]/div/div[2]/div/div/div/div/a"));
		
		scrollIntoView(title,driver);
		
	}
	// JavaScriptExecutor helps in highlight the element becoz in selenium there is no such function  available 

	// flash method
	public static void flash(WebElement element, WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		String bgcolor = element.getCssValue("backgroundColor");
		for (int i = 0; i < 100; i++) {
			changeColor("rgb(0,200,0)", element, driver);
			changeColor(bgcolor, element, driver);
		}
	}

	// changeColor method
	public static void changeColor(String color, WebElement element, WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].style.backgroundColor = '" + color + "'", element);
		try {
			Thread.sleep(20);
		} catch (InterruptedException e) {
		}
	}

	// drawBorder method
	public static void drawBorder(WebElement element, WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].style.border = '3px solid red'", element);
		try {
			Thread.sleep(20);
		} catch (InterruptedException e) {
		}
	}

	// generateAlert method
	public static void generateAlert(WebDriver driver, String message) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("alert('" + message + "')");
	}

	// click on element using JS
	public static void clickElementByJs(WebElement element, WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].click();", element);
	}

	// Refesh the page using JS
	public static void refreshUisngJs(WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("history.go(0)");
	}
	// get Title using JS 
	public static String getTitleUsingJs(WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		String title = js.executeScript("return document.title;").toString();
		return title;
	}
	// get inner Text of the page  by using JS
		public static String innerPageTextByJs(WebDriver driver) {
			JavascriptExecutor js = ((JavascriptExecutor) driver);
			String pageText = js.executeScript("return document.documentElement.innerText;").toString();
			return pageText;
}
		//Scroll down by using JS
		public static void scrollDownBy(WebDriver driver) {
		 JavascriptExecutor js = ((JavascriptExecutor) driver);
		 js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		}
		
		//Scroll Into view by using JS
	   public static void scrollIntoView(WebElement element,WebDriver driver) {
	   JavascriptExecutor js = ((JavascriptExecutor) driver);
	   js.executeScript("arguments[0].scrollIntoView(true);", element);
	   }
}
