package TestNG;
import static org.testng.Assert.assertNotEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AssertNotEqu
{
	@Test
	public void AssertNot() throws InterruptedException
	{
	System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com");
	String ER="Facebook – log in or sign up1";
	String AR = driver.getTitle();
	assertNotEquals(AR,ER);
	Thread.sleep(2000);
	driver.quit();
	}

}
