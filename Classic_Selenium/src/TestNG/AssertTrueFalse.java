package TestNG;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AssertTrueFalse 

{
	@Test
	public void Assert() throws InterruptedException
	{
	System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com");
	WebElement usn = driver.findElement(By.id("email"));
	boolean res = usn.isDisplayed();
	System.out.println(res);
	//assertTrue(res);
	assertFalse(res);
	System.out.println("Assertion is completed");
	Thread.sleep(2000);
	driver.quit();

}
}