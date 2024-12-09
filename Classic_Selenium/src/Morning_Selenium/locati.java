    package Morning_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class locati 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver", "./Software/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.amazon.com");
		driver.manage().window().maximize();
		JavascriptExecutor js= (JavascriptExecutor)driver;
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,4500)");
		Thread.sleep(2000);
		WebElement sign = driver.findElement(By.xpath("(//span[.='Sign in'])[3]"));
		Thread.sleep(2000);
		Point loc = sign.getLocation();
		int x = loc.getX();
		int y = loc.getY();
	    js.executeScript("window.scrollIntoView(x,y)");
		Thread.sleep(2000);
		driver.quit();
		
		

}
}