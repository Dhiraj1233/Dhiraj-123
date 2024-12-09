package Morning_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipcart 
{
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com");
		WebElement search = driver.findElement(By.className("Pke_EE"));
		Thread.sleep(2000);
		search.sendKeys("mobiles");
		driver.findElement(By.className("_2iLD__")).click();
		Thread.sleep(2000);
		WebElement mbl = driver.findElement(By.className("DByuf4"));
		mbl.click();
		Thread.sleep(2000);
		WebElement cart = driver.findElement(By.xpath("//button[text()='Add to cart']"));
		cart.click();
	}

}
