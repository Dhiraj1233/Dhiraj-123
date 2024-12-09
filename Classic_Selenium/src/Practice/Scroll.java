package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Scroll 
{
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./Software/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.amazon.in");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.xpath("(//a[.='Start here.'])[3]"));

//		js.executeScript("arguments[0].click();", ele);
		//		js.executeScript("arguments[0].ScrollIntoView();", ele);




		//		for (int i = 0; i<=4; i++) 
		//		{
		//			js.executeScript("window.scrollBy(0,500)");
		//			Thread.sleep(1000);
		//		}
		//	    for (int i =0;i<=4;i++) 
		//	    {
		//	    	js.executeScript("window.scrollBy(0,-500)");
		//	    	Thread.sleep(1000);
		//			
		//		}
	}

}
