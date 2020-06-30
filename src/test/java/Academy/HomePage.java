package Academy;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import pageObjects.LoginPage;
import resources.base;

public class HomePage extends base {
	

	@BeforeTest
	public void initialise() throws IOException
	{
		driver=initialiseBrowser();
		
		
	}
	@Test(dataProvider="getData")
	public void basePageNavigation(String userName, String pwd,String text) throws IOException
	{
		//one inheritance
		//other create objects of the class
		driver.get(prop.getProperty("URL"));
		LandingPage lp= new LandingPage(driver);
	
		Assert.assertEquals(lp.getTitle().getText(), "FEATURED COURSES");
		Assert.assertTrue(lp.navigationBar().isDisplayed());
		
		lp.getLogin().click();
		LoginPage login= new LoginPage(driver);
		login.getEmail().sendKeys(userName);
		login.getpwd().sendKeys(pwd);
		System.out.println(text);
		login.getLoginButton().click();
		
		
	}
	
	@AfterTest
	public void tearDown()
	{
		driver.close();
	}
	@DataProvider
	public Object[][] getData()
	{
		//row is number of data types for the test case (multiple data for the test case)
		//column stands for the number of values for each/per test case
		
		Object data[][]=new Object[2][3]; //2 lines 3 columns
		data[0][0]="abc@sskfirms.com";
		data[0][1]="abc@ssk1234";
		data[0][2]="Restriced user";
		
		data[1][0]="xyz@sskfirms.com";
		data[1][1]="xyz@ssk1234";
		data[1][2]="Non Restriced user";
		
		return data;
		
	}
}
