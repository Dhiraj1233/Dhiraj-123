package Morning_Selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class Assingment2 
{
	public static void main(String[] args) throws AWTException, Exception {
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		String p_t = driver.getTitle();
		System.out.println(p_t);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.selenium.dev/downloads/");
		List<WebElement> eles = driver.findElements(By.xpath("//a[.='4.25.0 (September 20, 2024)']"));
		eles.remove(2);
		for (WebElement ele : eles) 
		{
			Actions act=new Actions(driver);
			act.contextClick(ele).perform();
			Robot r=new Robot();
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);
		}
		Set<String> wins = driver.getWindowHandles();
		String parent = driver.getWindowHandle();
		ArrayList<String> l=new ArrayList<String>(wins);
		l.remove(parent);
		for (String l1 : l)
		{
			WebDriver wh = driver.switchTo().window(l1);
			Thread.sleep(2000);
			String title = wh.getTitle();
			System.out.println(title);
			if (l1.equals(l1)) 
			{
				driver.close();

			}
			Thread.sleep(2000);
			driver.quit();

		}


	}
	
}
//	public static void main(String[] args) throws AWTException, InterruptedException {
//		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
//		String p_t = driver.getTitle();
//		System.out.println(p_t);
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		driver.manage().window().maximize();
//		driver.get("https://www.selenium.dev/downloads/");
//		List<WebElement> eles = driver.findElements(By.xpath("//a[.='4.24.0 (August 28, 2024)']"));
//		eles.remove(2);
//		for (WebElement ele:eles)
//		{
//			Actions act=new Actions(driver);
//			act.contextClick(ele).perform();
//			Robot r=new Robot(); 
//			r.keyPress(KeyEvent.VK_DOWN);
//			r.keyRelease(KeyEvent.VK_DOWN);
//			r.keyPress(KeyEvent.VK_ENTER);
//			r.keyRelease(KeyEvent.VK_ENTER);
//			
//
//		}
//		Set<String> wins = driver.getWindowHandles();
//		String parent = driver.getWindowHandle();
//		ArrayList< String> l=new ArrayList<String>(wins);
//		l.remove(parent);
//		for (String  l1: l) 
//		{
//			WebDriver wh = driver.switchTo().window(l1);
//			Thread.sleep(2000);
//			String title = wh.getTitle();
//			System.out.println(title);
//			if (l1.equals(l1)) 
//			{
//
//				driver.close();
//			} 
//
//		}
//		Thread.sleep(2000);
//		driver.quit();
//	}
//
//}
//
//
