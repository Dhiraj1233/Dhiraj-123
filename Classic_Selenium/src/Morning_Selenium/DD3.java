package Morning_Selenium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DD3 
{
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/dhira/OneDrive/Desktop/All%20html%20src/Dropdown.multi.html");
		WebElement dd = driver.findElement(By.id("Akshay_Dum-Birayani"));
		Select s= new Select(dd);
		ArrayList<String> l=new ArrayList<String>();
		if (s.isMultiple()) 
		{
			List<WebElement> opt = s.getOptions();
			int count =opt.size();
			for (int i = 0; i < count; i++) 
			{
				WebElement opts = opt.get(i);
				String txt = opts.getText();
				System.out.println(txt);
				l.add(txt);
				
				
			}
			System.out.println("=======");
			Collections.sort(l,Collections.reverseOrder());
			for (String j:l) 
			{
				System.out.println(j);
			}
		}
		Thread.sleep(2000);
		driver.quit();
}
	}
