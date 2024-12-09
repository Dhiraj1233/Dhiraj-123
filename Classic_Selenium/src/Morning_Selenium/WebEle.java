package Morning_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebEle 
{
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/dhira/OneDrive/Desktop/All%20html%20src/webele.html");
		WebElement USN = driver.findElement(By.id("email"));
		boolean res = USN.isDisplayed();
		System.out.println(res);
		boolean res1 = USN.isEnabled();
		System.out.println(res1);
		boolean res2 = USN.isSelected();
		System.out.println(res2);
	    WebElement cb = driver.findElement(By.name("checkbox"));
	    boolean res3 = cb.isSelected();
	    System.out.println(res3);
	    Thread.sleep(2000);
	    driver.close();
	    
	}

}
