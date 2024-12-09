package Morning_Selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Parent_browser 
{
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.flipkart.com");
		WebElement srch = driver.findElement(By.name("q"));
		srch.sendKeys("mobiles"+Keys.ENTER);
		WebElement product = driver.findElement(By.xpath("//div[.='Motorola Edge 50 Fusion (Marshmallow Blue, 256 GB)']"));
		product.click();
		Set<String> wins = driver.getWindowHandles();
		String pid = driver.getWindowHandle();
		for (String win : wins) 
		{
			WebDriver wh = driver.switchTo().window(win);
			String title = wh.getTitle();
			System.out.println(title);
			if (win.equals(pid))
			{
				driver.close();
			}
			
		}
		
		
	}

}
