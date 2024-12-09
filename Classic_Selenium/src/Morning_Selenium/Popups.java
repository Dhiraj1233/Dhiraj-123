package Morning_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Popups 
{
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/dhira/OneDrive/Desktop/All%20html%20src/Disabled.html");
		Thread.sleep(2000);
		WebElement btn = driver.findElement(By.xpath("//input[@type='file']"));
		Thread.sleep(2000);
		btn.sendKeys("C:\\Users\\dhira\\OneDrive\\Desktop\\My Resume\\Dhiraj Kumar Resume2.docx");
		Thread.sleep(2000);
		driver.quit();	
	}

}
