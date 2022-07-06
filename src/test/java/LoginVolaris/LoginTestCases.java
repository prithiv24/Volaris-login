package LoginVolaris;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import CommonFunctionLogin.CommonLogin;
import Excel.ExcelUtil;
import LoginTestLocators.LoginPojo;
import bsh.util.Util;

public class LoginTestCases extends CommonLogin {

	static LoginPojo p;

	@BeforeMethod
	public void setUp() {

		chromeBrowserLaunch();
		System.currentTimeMillis();
		maximize();
		pageLoadOutTime();
		implicityWait();


	}
	@DataProvider
	public Object[][] loginData() {
		Object[][] data = ExcelUtil.getTestData("login");
		return data;
	}
	@Test(dataProvider="loginData")
	public void testData(String email , String password) throws InterruptedException {
		enterUrl("https://www.volaris.com/");
		p= new LoginPojo();
		Thread.sleep(8000);
		clickButton(p.getUserAccountLogin());
		enterValues(p.getEmail(), email);
		enterValues(p.getPassword(), password);
	//	clickButton(p.getCaptcha());
	//	clickButton(p.getAccess());

	}
	@AfterMethod
	public void tearDown() {
		driver.close();
		System.currentTimeMillis();
	}
}
