package Morning_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice10
{
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/dhira/OneDrive/Desktop/All%20html%20src/practice.html");
		WebElement usn = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
		if (usn.isDisplayed())
		{
			System.out.println("Displayed");
			usn.sendKeys("Dhiraj");

		}
		else 
		{
			System.out.println("Not Displayed");

		}
		WebElement psw = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		if (psw.isEnabled())
		{
			System.out.println("Enabled");
			psw.sendKeys("Dhiraj");

		}
		else
		{
			System.out.println("Not enabled");

		}
		WebElement check = driver.findElement(By.xpath("(//input[@type='checkbox'])[1]"));
		if (check.isSelected())
		{
			System.out.println("selected");
			//check.click();

		}
		else 
		{
			System.out.println("checked");
		}
	}
}
