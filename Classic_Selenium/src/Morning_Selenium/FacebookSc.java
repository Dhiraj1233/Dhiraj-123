package Morning_Selenium;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

public class FacebookSc 
{
	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./Software/geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement ele = driver.findElement(By.xpath("//div[@class='_8esn']"));
		File temp = ele.getScreenshotAs(OutputType.FILE);
		File perm=new File("./Defects/D2.png");
		FileHandler.copy(temp,perm);
		Thread.sleep(2000);
	    driver.quit();
		
		
	}

}
