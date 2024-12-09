package Morning_Selenium;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.ui.Select;

public class Practice
{
	public static void main(String[] args) throws InterruptedException 
	{
		
		
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
		WebElement srch = driver.findElement(By.name("q"));
		srch.sendKeys("Mobile"+Keys.ENTER);
		WebElement prdct = driver.findElement(By.xpath("//div[.='OPPO F27 5G (Emerald Green, 128 GB)']"));
		prdct.click();
		Set<String> wins = driver.getWindowHandles();
		String p_id = driver.getWindowHandle();

		int count = wins.size();
		System.out.println(count);
		for (String win : wins) 
		{
		WebDriver wh = driver.switchTo().window(win);
			String title = wh.getTitle();
			System.out.println(title);
			if(win.equals(p_id))
			{
				Thread.sleep(2000);
				driver.close();
			}
			
		}
	
	}
	
}	
		

		
		
		
	
	
