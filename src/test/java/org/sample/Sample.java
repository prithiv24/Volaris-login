package org.sample;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sample {
	public	static WebDriver driver;
	public static WebDriverWait wait;
	public static void main(String[] args) throws InterruptedException {
	
		WebDriverManager.chromedriver().setup();
		/*ChromeOptions options= new ChromeOptions();
		ChromeOptions addArguments = options.addArguments("\"--disable-notifications\"");*/
		 driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get("https://www.volaris.com/");
	
		/*Thread.sleep(5000);
		
		driver.findElement(By.xpath("//button[@class='btn btn-small mat-raised-button mat-button-base mat-terceary']")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.id("mat-input-7")).sendKeys("prithiv24@gmail.com");
		
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("12368978");*/
		//driver.findElement(By.xpath("//div[@class='recaptcha-checkbox-spinner']")).click();
		
		driver.findElement(By.id("mat-input-5")).click();
		
	new WebDriverWait(driver,5);
	wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.className("table-condensed ng-star-inserted")));
	String monthAndYear = driver.findElement(By.xpath("//table[@class='table-condensed ng-star-inserted'][1]//td")).getText();
	System.out.println(monthAndYear);
		
		
	}
}
