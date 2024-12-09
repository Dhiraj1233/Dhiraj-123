package Morning_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Maps 
{
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/maps");
		driver.findElement(By.cssSelector("button[id='hArJGc']")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[class='tactile-searchbox-input']")).sendKeys("banglore");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[aria-controls='sbsg51']")).sendKeys("Mysuru"+Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button[@class='m6Uuef'][1]]")).click();
		Thread.sleep(2000);
		driver.quit();
		
		
		
	}
}
//	public static void main(String[] args) throws InterruptedException {
//		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
//		WebDriver driver=new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("https://www.google.com/maps");
//		Thread.sleep(2000);
//		driver.findElement(By.cssSelector("button[id='hArJGc']")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.cssSelector("input[class='tactile-searchbox-input']")).sendKeys("banglore");
//		Thread.sleep(2000);
//		WebElement dst = driver.findElement(By.cssSelector("input[aria-controls='sbsg51']"));
//		dst.sendKeys("Mysuru" +Keys.ENTER);
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("(//button[@class='m6Uuef'][1]]")).click();
//		Thread.sleep(2000);
//		driver.quit();
//	}

