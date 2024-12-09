package Morning_Selenium;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DD1 
{
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/dhira/OneDrive/Desktop/All%20html%20src/Dropdown.multi.html");
		WebElement dd = driver.findElement(By.id("Akshay_Dum-Birayani"));
		Select s= new Select(dd);
		
List<WebElement> opt = s.getOptions();
TreeSet<String> t=new TreeSet<String>();
for (WebElement we : opt)
{
	String txt = we.getText();
	t.add(txt);
	
	
}
for (String t1: t) 
{
	System.out.println(t1);
	
}
		
		
		
		
		
		Thread.sleep(2000);
		driver.quit();
//		List<WebElement> opt = s.getOptions();
//		System.out.println(opt.size());
//		Thread.sleep(2000);
//		driver.quit();
		
				
	}

}
