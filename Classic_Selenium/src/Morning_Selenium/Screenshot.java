package Morning_Selenium;

import java.io.File;
import java.io.IOException;
import java.util.Date;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot
{
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.gecko.driver", "./Software/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		Date d= new Date();
		String d1 = d.toString().replace(":", "-");
		System.out.println(d1);
		driver.get("https://www.amazon.com");
		TakesScreenshot ts= (TakesScreenshot)driver;
		File temp = ts.getScreenshotAs(OutputType.FILE);
		File perm=new File("./Defects/d1.png");
	    FileHandler.copy(temp, perm);
	   
	    
	    Thread.sleep(2000);
	    driver.quit();
		
}
}