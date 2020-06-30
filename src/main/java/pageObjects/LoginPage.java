package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	
	public WebDriver driver;
	
	By email=By.id("user_email");
	By pwd=By.id("user_password");
	By LogIn=By.name("commit");
	
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public WebElement getEmail()
	{
		return driver.findElement(email);
	}
	
	public WebElement getpwd()
	{
		
		return driver.findElement(pwd);
	}
	
	public WebElement getLoginButton()
	{
		return driver.findElement(LogIn);
	}
}
