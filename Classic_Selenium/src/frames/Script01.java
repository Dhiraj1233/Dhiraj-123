package frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Script01 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver", "./Software/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/dhira/OneDrive/Desktop/Main.html");
		WebElement ele2 = driver.findElement(By.id("f3"));
		ele2.sendKeys("Dhiraj");
		Thread.sleep(2000);
		driver.switchTo().frame(0);
		WebElement ele1 = driver.findElement(By.id("f2"));
		ele1.sendKeys("kumar");
		Thread.sleep(2000);
		driver.switchTo().frame(0);
		 WebElement ele=driver.findElement(By.id("f1"));
		ele.sendKeys("9128628147");
		Thread.sleep(2000);
		ele.clear();
		driver.switchTo().parentFrame();
		Thread.sleep(2000);
		ele1.clear();
		driver.switchTo().parentFrame();
		Thread.sleep(2000);
		ele2.clear();
		


	}

}
