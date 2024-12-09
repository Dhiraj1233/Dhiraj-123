package Morning_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByClassName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class JioTestCase 
{
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./Software/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.jio.com");
		Thread.sleep(2000);
		WebElement mob = driver.findElement(By.xpath("(//a[.='Mobile'])[1]"));
		mob.click();
		Thread.sleep(2000);
		WebElement rech = driver.findElement(By.xpath("(//a[.='Recharge'])[1]"));
		rech.click();
		Thread.sleep(2000);
		driver.findElement(By.id("submitNumber")).sendKeys("9128628147");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[.='Continue'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[.='Recharge'])[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(((//div[text()='3599'])[1]/ancestor::div[3]//div[text()='Recharge'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[.='Google Pay']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("upi")).sendKeys("gdhdjsjioijwio");
		Thread.sleep(2000);
		driver.quit();
		
	}

}
