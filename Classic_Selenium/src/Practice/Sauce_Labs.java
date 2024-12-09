package Practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Sauce_Labs 
{
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.saucedemo.com/v1/index.html");
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		driver.findElement(By.xpath("(//div[@class='inventory_item_img'])[1]")).click();
		WebElement ele = driver.findElement(By.xpath("//div[@class='inventory_details_name']"));
		String txt = ele.getText();
		//System.out.println(txt);
		WebElement ele1 = driver.findElement(By.xpath("//div[@class='inventory_details_price']"));
		String price = ele1.getText();
		//System.out.println(price);
		
		driver.findElement(By.xpath("//button[.='ADD TO CART']")).click();
		driver.findElement(By.xpath("//div[@id='shopping_cart_container']")).click();
		
		driver.findElement(By.xpath("//button[.='Open Menu']")).click();
		driver.findElement(By.id("logout_sidebar_link")).click();
		
	}

}
