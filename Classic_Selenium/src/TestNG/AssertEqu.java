package TestNG;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AssertEqu 
{
@Test
	public void Assert() throws InterruptedException
	{
	System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com");
	String ER="Facebook – log in or sign up";
	String AR = driver.getTitle();
	assertEquals(AR, ER);
	System.out.println(AR);
	Thread.sleep(2000);
	driver.quit();
	}
}
