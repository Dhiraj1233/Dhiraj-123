package Morning_Selenium;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll 
{
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.FLIPKART.com");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		Thread.sleep(2000);
		for (int i = 0; i<=4; i++) 
		{
			js.executeScript("window.scrollBy(0,500)");
			Thread.sleep(1000);
		}
	    for (int i =0;i<=4;i++) 
	    {
	    	js.executeScript("window.scrollBy(0,-500)");
	    	Thread.sleep(1000);
			
		}
		
		
	}

}
