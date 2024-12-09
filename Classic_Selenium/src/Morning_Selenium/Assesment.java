package Morning_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Assesment 
{
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.geckodriver", "./Software/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.facebook.com");
		Thread.sleep(2000);
		WebElement usn = driver.findElement(By.id("email"));
		Thread.sleep(2000);
		usn.sendKeys("admin");
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		usn.sendKeys("Admin@123");
		Thread.sleep(2000);
		driver.quit();
		
	}

}
