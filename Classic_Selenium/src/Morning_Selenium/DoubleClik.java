package Morning_Selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClik 
{
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
//		WebElement right = driver.findElement(By.xpath("//span[.='right click me']"));
//		//WebElement ele = driver.findElement(By.xpath("//button[.='Double-Click Me To See Alert']"));
//		Actions act=new Actions(driver);
//		act.contextClick(right).perform();
//		//act.doubleClick(ele).perform();
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_ALT);
		r.keyRelease(KeyEvent.VK_F4);
		
		Thread.sleep(2000);
		
		
		r.keyRelease(KeyEvent.VK_ALT);
		r.keyPress(KeyEvent.VK_F4);
	}

}
