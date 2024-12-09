package Morning_Selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assingment2Logic2nd 
{
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.selenium.dev/downloads/");
		ArrayList< WebElement> l=new ArrayList< WebElement>();
		 l.add(driver.findElement(By.xpath("(//a[.='4.24.0 (August 28, 2024)'])[1]")));
		l.add( driver.findElement(By.xpath("(//a[.='4.24.0 (August 28, 2024)'])[2]")));
		l.add(driver.findElement(By.xpath("(//a[.='4.24.0 (August 28, 2024)'])[4]")));
		l.add(driver.findElement(By.xpath("(//a[.='4.24.0 (August 28, 2024)'])[5]")));
		
		
		Actions act =new Actions(driver);
		Robot r=new Robot();
		for (WebElement link : l) 
		{      
			 act.contextClick(link).perform();
			    r.keyPress(KeyEvent.VK_DOWN);
				r.keyRelease(KeyEvent.VK_DOWN);
				r.keyPress(KeyEvent.VK_ENTER);
				r.keyRelease(KeyEvent.VK_ENTER);
				
			
		}
	     String Parent = driver.getWindowHandle();
	     Set<String> win = driver.getWindowHandles();
	     win.remove(Parent);
	     for (String wins: win)
	     {
	    	 WebDriver child = driver.switchTo().window(wins);
	    String title = child.getTitle();
	    System.out.println(title);
	    	 
	    if (wins==wins)
	    {
	    	driver.close();
			
		}
			
		}
	     driver.switchTo().window(Parent);
	     Thread.sleep(2000);
	     driver.quit();
		
	}

}
