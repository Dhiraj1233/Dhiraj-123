package Sauce_labs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;




public class General_script 
{
	public WebDriver driver;
	@BeforeMethod
	public void openbrowser()
	{
	
    driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com");
	}
	@AfterMethod
	public void closeBrowser()
	{
		driver.quit();
	}

}
