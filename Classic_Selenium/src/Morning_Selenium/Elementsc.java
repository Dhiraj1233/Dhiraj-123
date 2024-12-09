package Morning_Selenium;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

public class Elementsc 
{
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.gecko.driver", "./Software/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		Date d= new Date();
		String d1 = d.toString().replace(":", "-");
		System.out.println(d1);
		driver.get("https://www.flipkart.com");
		//TakesScreenshot ts= (TakesScreenshot)driver;
		WebElement ele = driver.findElement(By.xpath("//div[@class='_38VF5e']"));
		File temp = ele.getScreenshotAs(OutputType.FILE);
		File perm=new File("./Defects/Element2.png");
	    FileHandler.copy(temp, perm);
	   
	    
	    Thread.sleep(2000);
	    driver.quit();
		
	}
}
