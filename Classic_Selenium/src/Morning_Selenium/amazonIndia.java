package Morning_Selenium;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class amazonIndia 
{
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.amazon.in");
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("wrist watches"+Keys.ENTER);
		driver.findElement(By.xpath("//span[.='Leather']")).click();
		driver.findElement(By.xpath("(//span[.='Fastrack']/ancestor::span[2])[2]")).click();
		driver.quit();
	}
}
































//	public static void main(String[] args) throws InterruptedException {
//		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
//		WebDriver driver=new ChromeDriver();
//		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		driver.get("https://www.amazon.in");
//		driver.manage().window().maximize();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Wrist Watches"+Keys.ENTER);
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//span[.='Leather']")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("(//span[.='Fastrack']/ancestor::span[2])[2]")).click();
//		Thread.sleep(2000);
//		
//		
//	}
//
//}
