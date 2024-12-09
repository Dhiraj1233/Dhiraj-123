package Morning_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Youtube_xpath 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.youtube.com");
		Thread.sleep(2000);
		WebElement src = driver.findElement(By.cssSelector("input[id='search']"));
		src.sendKeys("Bulleya");
		Thread.sleep(2000);
		WebElement act = driver.findElement(By.cssSelector("button[id='search-icon-legacy']"));
		act.click();
		Thread.sleep(2000);
		WebElement song = driver.findElement(By.cssSelector("a[title='Bulleya (Reprise)']"));
		song.click();
		WebElement like = driver.findElement(By.className("YtLikeButtonViewModelHost"));
		like.click();
	}

}
