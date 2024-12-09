package Morning_Selenium;


import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

public class Assingment 
{
	public static void main(String[] args) throws InterruptedException, Throwable {
		String key = "webdriver.gecko.driver";
		String value = "./Software/geckodriver.exe";
		System.setProperty(key, value);
		WebDriver driver=new FirefoxDriver();
		//		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		//		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://seleniumbase.io/demo_page");
		WebElement ele = driver.findElement(By.xpath("//div[@id='myDropdown']"));
		Actions act= new Actions(driver);

		act.moveToElement(ele).perform();
		WebElement ele1 = driver.findElement(By.id("dropOption1"));
		act.moveToElement(ele1).perform();
		WebElement ele2 = driver.findElement(By.xpath("//input[@id='myTextInput']"));
		ele2.sendKeys("Dhiraj");
		WebElement ele3 = driver.findElement(By.xpath("//textarea[@id='myTextarea']"));
		ele3.sendKeys("dhirajkryadav1999@gmail.com");
		driver.findElement(By.xpath("//input[@type='text'  and @id='myTextInput2']")).clear();

		driver.findElement(By.xpath("//button[@id='myButton']")).click();
		driver.findElement(By.xpath("//input[@id='placeholderText']")).sendKeys("Dhiraj");

		WebElement txt = driver.findElement(By.xpath("//input[@id='readOnlyText']"));
		System.out.println(txt.getAttribute("value"));

		driver.findElement(By.xpath("//*[name()='svg']")).click();

		WebElement txt1 = driver.findElement(By.xpath("//p[@id='pText']"));
		System.out.println(txt1.getText());

		WebElement scroll = driver.findElement(By.xpath("//input[@name='sliderName']"));
		WebElement scroll1 = driver.findElement(By.xpath("//p[.='Paragraph with Text:']"));
		act.dragAndDrop(scroll, scroll1).perform();

		WebElement dd = driver.findElement(By.xpath("//select[@id='mySelect']"));
		Select s= new Select(dd);
		s.selectByIndex(1);

		WebElement frame = driver.findElement(By.xpath("//iframe[@id='myFrame2']"));
		// driver.switchTo().frame("myFrame2");
		System.out.println(frame.getText());

		driver.findElement(By.xpath("//input[@id='radioButton2']")).click();

		driver.findElement(By.xpath("//input[@id='checkBox1']")).click();

		driver.findElement(By.xpath("//input[@id='checkBox2']")).click();

		driver.findElement(By.xpath("//input[@id='checkBox3']")).click();

		driver.findElement(By.xpath("//input[@id='checkBox4']")).click();

		driver.findElement(By.xpath("//input[@id='checkBox5']")).click();

		WebElement frm3 = driver.findElement(By.xpath("//iframe[@id='myFrame3' ]"));
		driver.switchTo().frame(frm3);
		driver.findElement(By.xpath("//input[@id='checkBox6']")).click();

		//       WebElement src = driver.findElement(By.xpath("//div[@id='drop1']"));
		//       WebElement dest = driver.findElement(By.xpath("//div[@id='drop2']"));
		//       
		//       act.dragAndDrop(src, dest).perform();

		List<WebElement> eles = driver.findElements(By.xpath("//a[@class='linkClass']"));
		for (WebElement ele5 : eles) 
		{
			Actions act1=new Actions(driver);
			act1.contextClick(ele5).perform();
			Robot r=new Robot();
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_ENTER);

		}




	}

}
