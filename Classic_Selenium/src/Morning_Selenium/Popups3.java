package Morning_Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Popups3 
{
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		ChromeOptions opt= new ChromeOptions();
		opt.addArguments("--disable-notification-");
		WebDriver driver=new  ChromeDriver();
		driver.get("https://admin:admin@basic-auth-git-main-shashis-projects-4fa03ca5.vercel.app/");
		Thread.sleep(2000);
		driver.quit();
	}

}
