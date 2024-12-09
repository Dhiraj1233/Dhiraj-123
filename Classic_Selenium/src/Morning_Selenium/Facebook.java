package Morning_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Facebook 
{
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./Software/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com");
		WebElement usn = driver.findElement(By.id("email"));
		Dimension r = usn.getSize();
		System.out.println(r);
		JavascriptExecutor js= (JavascriptExecutor)driver;
		
//		Point loc = usn.getLocation();
//		System.out.println(loc.getX());
//		System.out.println(loc.getY());
		
//		usn.sendKeys("admin");
//		Thread.sleep(2000);
//		WebElement psw = driver.findElement(By.id("pass"));
//		psw.sendKeys("admin@123");
//		Thread.sleep(2000);
//		usn.clear();
//		Thread.sleep(2000);
//		usn.sendKeys("Abcd@gmail.com");
//		driver.findElement(By.name("login")).click();
//		Thread.sleep(2000);
//		
//		
//		
	}

}
