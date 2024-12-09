package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Script011 {

	public static void main(String[] args) throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--incognito");
		//opt .setAcceptInsecureCerts(true);
		WebDriver driver=new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui/keyboard?sublist=0");
		Thread.sleep(2000);
		WebElement tf = driver.findElement(By.name("handleInput"));
		Actions act=new Actions(driver);
		act.sendKeys(tf,"admin").perform();
		Thread.sleep(2000);
		act.keyDown(Keys.CONTROL).sendKeys("a").keyDown(Keys.CONTROL).perform();
		Thread.sleep(2000);
		act.keyDown(Keys.CONTROL).sendKeys("x").keyDown(Keys.CONTROL).perform();
		Thread.sleep(2000);
		act.keyDown(Keys.CONTROL).sendKeys("v").keyDown(Keys.CONTROL).perform();
		Thread.sleep(2000);
		driver.quit();
		
		
		
	}

}
