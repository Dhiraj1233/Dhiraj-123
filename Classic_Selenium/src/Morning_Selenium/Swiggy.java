package Morning_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Swiggy 
{
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./Software/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.swiggy.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[.='Search']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Search for restaurants and food']")).sendKeys("Biryani"+Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.xpath("((//div[.='170'])[1]/ancestor::div[3]//div[text()='Add'])[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//span[.='1'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[.='SIGN UP']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("mobile")).sendKeys("9128628147");
		Thread.sleep(2000);
		driver.findElement(By.id("name")).sendKeys("Dhiraj");
		Thread.sleep(2000);
		driver.findElement(By.id("email")).sendKeys("dhirajkryadav1999@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[.='CONTINUE']")).click();
		Thread.sleep(2000);
		driver.quit();
	}

}
