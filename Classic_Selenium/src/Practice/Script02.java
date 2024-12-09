package Practice;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script02 
{
	public static void main(String[] args) throws Exception
	{

		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.amazon.in");
		List<WebElement> eles = driver.findElements(By.xpath("//a")); 
		FileInputStream fis=new FileInputStream("./Excel/Test2.xlsx");
		Workbook book= WorkbookFactory.create(fis);
		Sheet sheet = book.createSheet("Amazon_Links");
		int count = eles.size();
		for (int i = 0; i < count; i++) 
		{
			WebElement ele = eles.get(i);
			String url = ele.getAttribute("href");
			Row rw = sheet.createRow(i);
			Cell cl = rw.createCell(0);
			cl.setCellValue(url);
		}
		FileOutputStream fos=new FileOutputStream("./Excel/Test2.xlsx");
		book.write(fos);
		Thread.sleep(2000);
		driver.quit();
	}

}
