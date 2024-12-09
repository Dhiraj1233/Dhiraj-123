package Practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Script01 
{
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		driver.findElement(By.xpath("//section[.='Dropdown']")).click();
		driver.findElement(By.xpath("//input[@id='phone']")).sendKeys("9128628147");
		WebElement dd = driver.findElement(By.xpath("//select[@id='select2']"));
		Select s=new Select(dd);
		s.selectByIndex(0);
		WebElement dd1 = driver.findElement(By.xpath("//select[@id='select3']"));
		Select s1=new Select(dd1);
		s1.selectByVisibleText("India");
		WebElement dd2 = driver.findElement(By.xpath("//select[@id='select5']"));
		Select s2=new Select(dd2);
		s2.selectByVisibleText("Bihar");
		WebElement dd3 = driver.findElement(By.xpath("//select[@id='select5']/../..//following-sibling::div[1]//select"));
		Select s3=new Select(dd3);
		s3.selectByVisibleText("Patna");
		Thread.sleep(2000);
		driver.quit();
		
		
	}

}
