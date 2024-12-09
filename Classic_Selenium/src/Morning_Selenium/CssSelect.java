package Morning_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CssSelect 
{
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./Software/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		Thread.sleep(2000);
		WebElement usn = driver.findElement(By.cssSelector("input[data-testid='royal_email']"));
		usn.sendKeys("admin");
		Thread.sleep(2000);
		WebElement psw = driver.findElement(By.cssSelector("input[type='password']"));
		psw.sendKeys("admin@123");
		Thread.sleep(2000);
		WebElement lgn = driver.findElement(By.cssSelector("button[type='submit']"));
		lgn.click();
		
	}

}
