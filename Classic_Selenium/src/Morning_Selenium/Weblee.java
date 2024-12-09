package Morning_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Weblee
{
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/dhira/OneDrive/Desktop/All%20html%20src/webele.html");
		WebElement USN = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
		Thread.sleep(2000);
		USN.sendKeys(Keys.CONTROL+"a");
		Thread.sleep(2000);
		USN.sendKeys(Keys.CONTROL+"x");
		Thread.sleep(2000);
		WebElement cnpsw = driver.findElement(By.xpath("(//input[@type='text'])[3]"));
		cnpsw.sendKeys(Keys.CONTROL+"v");
		Thread.sleep(2000);
		WebElement psw = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		psw.sendKeys(Keys.CONTROL+"a");
		Thread.sleep(2000);
		psw.sendKeys(Keys.CONTROL+"x");
		Thread.sleep(2000);
		USN.sendKeys(Keys.CONTROL+"v");
		Thread.sleep(2000);
		driver.close();
		
	}

}
