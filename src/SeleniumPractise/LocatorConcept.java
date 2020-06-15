package SeleniumPractise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorConcept {

	public static void main(String[] args) {
		// Chrome driver
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MMeghana\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");// get the url
		// There are 8 locators
		//1. Xpath
		driver.findElement(By.xpath("//*[@id='u_0_m']")).sendKeys("Buddy6jar");
		driver.findElement(By.xpath("//*[@id='u_0_o']")).sendKeys("Hello");
		driver.findElement(By.xpath("//*[@id='u_0_r']")).sendKeys("8277282895");
		driver.findElement(By.xpath("//*[@id='u_0_w']")).sendKeys("WhatKothi123!");

		// 2. ID
		driver.findElement(By.id("u_0_m")).sendKeys("Buddy6jar");
		driver.findElement(By.id("u_0_o")).sendKeys("Hello");
		driver.findElement(By.id("u_0_r")).sendKeys("8277282895");
		driver.findElement(By.id("u_0_w")).sendKeys("WhatKothi123");

		// 3. Name
		driver.findElement(By.name("firstname")).sendKeys("Buddy6jar");
		driver.findElement(By.name("lastname")).sendKeys("Hello");
		driver.findElement(By.name("reg_email__")).sendKeys("8277282895");
		driver.findElement(By.name("reg_passwd__")).sendKeys("WhatKothi123");

		//4. Link text
		driver.findElement(By.linkText("Create a Page")).click();
		
		//Partial Link Text
		driver.findElement(By.partialLinkText("Create")).click();
		
	//5.CSS Selector  
		driver.findElement(By.cssSelector("#u_0_m")).sendKeys("Buddy6jar");
		driver.findElement(By.cssSelector("#u_0_o")).sendKeys("Hello");
		driver.findElement(By.cssSelector("#u_0_r")).sendKeys("8277282895");
		driver.findElement(By.cssSelector("#u_0_w")).sendKeys("WhatKothi123");

	}

}
