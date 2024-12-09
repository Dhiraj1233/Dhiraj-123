package Morning_Selenium;

import java.awt.Point;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script0001 
{
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		Dimension d=new  Dimension(300, 400);
		driver.manage().window().setSize(d);
		org.openqa.selenium.Point p=new org.openqa.selenium.Point(300,400);
		driver.manage().window().setPosition(p);
	}
}
