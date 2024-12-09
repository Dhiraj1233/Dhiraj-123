package Morning_Selenium;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Textfield 
{
	public static void main(String[] args) throws InterruptedException
	
	{
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/dhira/OneDrive/Desktop/All%20html%20src/text.html");
		Thread.sleep(2000);
		List<WebElement> text = driver.findElements(By.xpath("//input"));
		int count = text.size();
		for (WebElement web : text) 
		{
			web.sendKeys("Dhiraj");
			Thread.sleep(2000);
			
		}
		for (int i = count-1;i>=0; i--) 
		{
		  	WebElement na = text.get(i);
		  	Thread.sleep(2000);
		  	na.clear();
		}
		driver.close();
		
	
	}

}
