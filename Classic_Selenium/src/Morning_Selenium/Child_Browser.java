package Morning_Selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Child_Browser 
{
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		String p_t = driver.getTitle();
		System.out.println("Address of the parent browser"+p_t);
		driver.get("https://demoapps.qspiders.com/ui/browser/multipleWindow?sublist=2");
		WebElement btn = driver.findElement(By.xpath("//button[.='Click to open multiple popup windows']"));
		btn.click();
		String p_b = driver.getWindowHandle();
		Set<String> wins = driver.getWindowHandles();
		int count = wins.size();
		wins.remove(p_b);
		for (String win : wins) 
		{
			WebDriver wh = driver.switchTo().window(win);
			String title = wh.getTitle();
			System.out.println("Address of the child browser"+title);
			
			
		}
		
		
		
	}

}
