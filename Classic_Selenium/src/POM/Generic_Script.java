package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import Morning_Selenium.chromeBrowser;

public class Generic_Script 
{
	public WebDriver driver;
	@Parameters("Browser")
	@BeforeMethod
	public void openbrowser( String Browser)
	{
		System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver","./Software/geckodriver.exe");
		if (Browser.equals("chrome")) 
		{
			driver=new ChromeDriver();
			
		}
		else if (Browser.equals("firefox"))
		{
			
			driver=new FirefoxDriver();
		}
		
		
	    driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
			
	}
	@AfterMethod
	public void closebrowser()	
	{
		driver.quit();
	}

}
