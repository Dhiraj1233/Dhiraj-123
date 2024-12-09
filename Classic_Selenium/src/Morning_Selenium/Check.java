package Morning_Selenium;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Check 
{
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("file:///C:/Users/dhira/OneDrive/Desktop/All%20html%20src/check.html");
		List<WebElement> ch = driver.findElements(By.xpath("//input"));
		int count = ch.size();
		System.out.println(count);
		for (int i = 0; i < count; i++) 
		{
			WebElement We = ch.get(i);
			Thread.sleep(1000);
			We.click();
			
			
		}
		for (int i =count-1; i>=0;i-- )
		{
			WebElement web = ch.get(i);
			Thread.sleep(1000);
			web.click();
			
		}
		driver.quit();
		
	}

}
