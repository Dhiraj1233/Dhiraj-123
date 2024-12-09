package Morning_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebEle2 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/dhira/OneDrive/Desktop/All%20html%20src/webele.html");
		WebElement USN = driver.findElement(By.id("email"));
		boolean res = USN.isDisplayed();
		boolean res1 = USN.isEnabled();
		if (res==res1) 
		{
			USN.sendKeys("Dhiraj");
		}
		else 
		{
			System.out.println("Element is not Enabled");
		}
		Thread.sleep(2000);
		driver.close();
		
	}

}
