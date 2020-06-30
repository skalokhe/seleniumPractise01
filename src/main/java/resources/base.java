package resources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class base {
	
	public WebDriver driver;
	public Properties prop;
	public WebDriver initialiseBrowser() throws IOException
	{
		
	    prop = new Properties();
		
		FileInputStream fins= new FileInputStream("D:\\Udemy\\MyAutomation\\E2EProject\\src\\main\\java\\resources\\data.properties");
		prop.load(fins);
		
		String browserName=prop.getProperty("browser");
	
		if(browserName.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "D:\\Udemy\\chromedriver_win32\\chromedriver.exe");
			 driver= new ChromeDriver();
		}
		else if(browserName.equals("firefox")) 
		{
			System.setProperty("webdriver.gecko.driver","D:\\Udemy\\mozillafirefox_64\\geckodriver-v0.26.0-win64\\geckodriver.exe");
			driver= new FirefoxDriver();
		}
		else if(browserName.equals("IE"))
		{
			System.setProperty("webdriver.ie.driver", "D:\\Udemy\\IEDriver\\IEDriverServer_x64_3.9.0\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		}
		
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		return driver;
	}
	

}
