package Morning_Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestcaseDmmo 
{
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "./Software/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demoapps.qspiders.com/ui/pageLoad/newTab");
		

//		JavascriptExecutor js= (JavascriptExecutor)driver;
//		js.executeScript("window.scrollBy(0,2000)");
//		

		
		WebElement ele = driver.findElement(By.xpath("//input[@id='email']"));
//		Point loc = ele.getLocation();
//		int x=loc.getX();
//		int y=loc.getY();
//		js.executeScript("arguments[0].scrollIntoView();"ele);
		WebDriverWait ww=new WebDriverWait(driver, 5);
		ww.until(ExpectedConditions.visibilityOf(ele));
		
		ele.sendKeys("dhirajkryadav1999@gmail.com");
		WebElement ele1 = driver.findElement(By.xpath("//button[.='Subscribe']"));
		
		ww.until(ExpectedConditions.elementToBeClickable(ele1)).click();
		
	
	}

}
