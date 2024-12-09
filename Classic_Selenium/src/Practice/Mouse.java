package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse
{
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
//		WebElement mob = driver.findElement(By.xpath("(//span[.='Fashion'])[2]"));
		
		Actions act=new Actions(driver);
		WebElement src = driver.findElement(By.id("box6"));
		WebElement des = driver.findElement(By.id("106"));
		act.dragAndDrop(src, des).perform();
//		Thread.sleep(2000);
//		act.moveToElement(mob).perform();
		Thread.sleep(2000);
//		act.contextClick().perform();
		
		
		
	}
	

}
