package Morning_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDrop{
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		Actions act=new Actions(driver);
		WebElement src1 = driver.findElement(By.id("box2"));
	    WebElement dst1 = driver.findElement(By.id("box102"));
	    act.dragAndDrop(src1, dst1).perform();
	    Thread.sleep(2000);
	    WebElement src2 = driver.findElement(By.id("box6"));
	    WebElement dst2 = driver.findElement(By.id("box106"));
	    act.dragAndDrop(src2, dst2).perform();
	    Thread.sleep(2000);
	    WebElement src3 = driver.findElement(By.id("box1"));
	    WebElement dst3 = driver.findElement(By.id("box101"));
	    act.dragAndDrop(src3, dst3).perform();
	    Thread.sleep(2000);
	    WebElement src4 = driver.findElement(By.id("box5"));
	    WebElement dst4 = driver.findElement(By.id("box105"));
	    act.dragAndDrop(src4, dst4).perform();
	    Thread.sleep(2000);
	    WebElement src5 = driver.findElement(By.id("box3"));
	    WebElement dst5 = driver.findElement(By.id("box103"));
	    act.dragAndDrop(src5, dst5).perform();
	    Thread.sleep(2000);
	    WebElement src6 = driver.findElement(By.id("box4"));
	    WebElement dst6 = driver.findElement(By.id("box104"));
	    act.dragAndDrop(src6, dst6).perform();
	    Thread.sleep(2000);
	    WebElement src7 = driver.findElement(By.id("box7"));
	    WebElement dst7 = driver.findElement(By.id("box107"));
	    act.dragAndDrop(src7, dst7).perform();
	    Thread.sleep(2000);
	    driver.quit();
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	}

}
