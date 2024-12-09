package DDT;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadSingleData 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream fis= new FileInputStream("./Excel/Sheet1.xlsx");
		Workbook book =WorkbookFactory.create(fis);
		Sheet sheet = book.getSheet("Sheet1");
		Row rw = sheet.getRow(0);
		Cell cl = rw.getCell(0);
		String usn = cl.getStringCellValue();
		System.out.println(usn);
		Cell cl1 = rw.getCell(1);
		String psw = cl1.getStringCellValue();
		System.out.println(psw);
		
		
		
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		WebElement id = driver.findElement(By.id("email"));
		
		WebElement id1 = driver.findElement(By.id("pass"));
		
		WebElement name = driver.findElement(By.name("login"));
		
		id.sendKeys(usn);
		id1.sendKeys(psw);
		name.click();
		
		
	//	driver.quit();
	}

}
