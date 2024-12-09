package Morning_Selenium;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseP_browser 
{
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver  driver=new ChromeDriver();
		driver.get("https://www.flipkart.com");
		WebElement srch = driver.findElement(By.name("q"));
		srch.sendKeys("mobiles"+Keys.ENTER);
		WebElement product = driver.findElement(By.xpath("//div[.='Motorola Edge 50 Fusion (Marshmallow Blue, 256 GB)']"));
		product.click();
		Set<String> wins = driver.getWindowHandles();
		ArrayList<String> l=new ArrayList<String>(wins);
	    String ch_b= l.get(1);
	    Thread.sleep(2000);
	    driver.switchTo().window(ch_b);
	    String p_b=l.get(0);
	    driver.switchTo().window(p_b).close();
	    
		
		
		
	}

}
