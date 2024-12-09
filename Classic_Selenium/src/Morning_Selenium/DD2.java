package Morning_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DD2 

{
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/dhira/OneDrive/Desktop/All%20html%20src/Dropdown.multi.html");
		WebElement dd = driver.findElement(By.id("Akshay_Dum-Birayani"));
		Select s= new Select(dd);
		if (s.isMultiple()) 
		{
			s.selectByIndex(4);
			Thread.sleep(2000);
			s.selectByValue("j");
			Thread.sleep(2000);
			s.selectByVisibleText("chicken lollipop");
			Thread.sleep(2000);
			s.deselectAll();
			
			
		}
		Thread.sleep(2000);
		driver.quit();

}
}