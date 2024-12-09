package DDT;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice11 
{ 
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/dhira/OneDrive/Desktop/All%20html%20src/Demo1.html");
	   WebElement ele = driver.findElement(By.tagName("a"));
	   ele.click();
		
		
	}
	

}
