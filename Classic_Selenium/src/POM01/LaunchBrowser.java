package POM01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class LaunchBrowser 
{
	public WebDriver driver;
	@BeforeMethod
	public void openbrowser()
	{
		System.setProperty("webdriver.gecko.driver","./Software/geckodriver.exe");
		driver=new FirefoxDriver();
	    driver.manage().window().maximize();
		driver.get("https://www.shoppersstack.com/user-signin");
			
	}
	@AfterMethod
	public void closebrowser()	
	{
		driver.quit();
	}

}
