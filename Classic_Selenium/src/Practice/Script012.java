package Practice;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script012 
{
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com");
		List<WebElement> tf = driver.findElements(By.xpath("//a"));
		FileWriter writer=new FileWriter("urlofAmazon.txt");
		writer.write("Selenium Script");
		writer.close();
		driver.quit();
		
		
	}

}
