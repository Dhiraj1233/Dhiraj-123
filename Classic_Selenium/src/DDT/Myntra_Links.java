package DDT;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

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
import org.openqa.selenium.firefox.FirefoxDriver;

public class Myntra_Links 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		System.setProperty("webdriver.gecko.driver", "./Software/geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.get("https://www.myntra.com");
		List<WebElement> link = driver.findElements(By.xpath("//a"));
		FileInputStream fis =new FileInputStream("./Excel/Test.xlsx");
		//it is used to specify the path of file of excel file
		Workbook book =WorkbookFactory.create(fis);
		//it is used to access the file
		Sheet sheet = book.createSheet("Myntra_Links");
		int count = link.size();
		for (int i = 0; i < count; i++) 
		{
			WebElement links = link.get(i);
			String url = links.getAttribute("href");
			Row rw = sheet.createRow(i);
			Cell cl = rw.createCell(0);
			cl.setCellValue(url);
				
		}
		FileOutputStream fos= new FileOutputStream("./Excel/Test.xlsx");
		book.write(fos);
		driver.quit();
	}

}
