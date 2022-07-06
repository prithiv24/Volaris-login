package CommonFunctionLogin;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CommonLogin {

	public static WebDriver driver;


	public static void chromeBrowserLaunch() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();

	}

	public static void enterUrl(String text) {
		driver.get(text);
	}
	public static void maximize() {
		driver.manage().window().maximize();
	}
	public static void pageLoadOutTime() {
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
	}
	public static void implicityWait() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	public static void deleteAllCookies() {
		driver.manage().deleteAllCookies();
	}
	public static void enterValues(WebElement element,String values) {
		element.sendKeys(values);
	}
	public static void clickButton(WebElement element) {
		element.click();
	}
	public static void closeChrome() {
		driver.close();
	}

}
