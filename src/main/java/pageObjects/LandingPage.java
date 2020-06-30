package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {
	
	public WebDriver driver;
	

	By sign_in=By.xpath("//span[contains(text(),'Login')]");
	
	By title=By.xpath("//h2[contains(text(),'Featured Courses')]");
	By navigationbar=By.xpath("//nav[@class='navbar-collapse collapse']");
	
	public LandingPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		
		this.driver=driver;
	}
	

	public WebElement getLogin()
	{
		return driver.findElement(sign_in);
	}

	public WebElement getTitle()
	{
		return driver.findElement(title);
	}
	
	public WebElement navigationBar()
	{
		return driver.findElement(navigationbar);
	}

}
