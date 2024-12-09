package Morning_Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicittt 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://Shoppersstack.com");
		WebDriverWait ew= new WebDriverWait(driver, 10);
		ew.until(ExpectedConditions.urlContains("https"));
		 String url=driver.getCurrentUrl();
		 System.out.println(url);
		  
		 ew.until(ExpectedConditions.titleContains("Shopper"));
		 String title = driver.getTitle();
		 System.out.println(title);
		 
		 
		 
		 driver.quit();
	}

}
