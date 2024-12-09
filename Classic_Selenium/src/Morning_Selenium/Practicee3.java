package Morning_Selenium; 
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Practicee3 
{
	public static void main(String[] args) {
		//System.setProperty("webdriver.gecko.driver", "./Software/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--disable-notifications");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.navigate().to("https://www.facebook.com");
		//driver.get("https://www.facebook.com");
		WebElement usn = driver.findElement(By.id("email"));
		WebElement psw = driver.findElement(By.name("pass"));
		WebElement lg = driver.findElement(By.xpath("//button[.='Log in']"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].value='admin';", usn);
		js.executeScript("arguments[0].value=' admin@123';", psw);
		js.executeScript("arguments[0].click();", lg);
	}

}
