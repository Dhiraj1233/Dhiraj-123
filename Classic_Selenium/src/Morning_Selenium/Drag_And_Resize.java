package Morning_Selenium;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Drag_And_Resize 
{
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "./Software/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		Dimension d=new Dimension(300,400);
		driver.manage().window().setSize(d);
		Point p=new Point(300,100);
		driver.manage().window().setPosition(p);
	}

}
