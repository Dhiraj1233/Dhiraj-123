package DDT;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Practice 
{
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.flipkart.com");
		List<WebElement> links = driver.findElements(By.xpath("//a"));
		FileInputStream fis=new FileInputStream("./Excel/Test.xlsx");
		Workbook book=WorkbookFactory.create(fis);
		Sheet sheet = book.createSheet("Flipkart_Links"); 
		int count = links.size();
		for (int i = 0; i < count; i++) 
		{
			WebElement link = links.get(i);
			String url = link.getAttribute("href");
			Row rw = sheet.createRow(i);
			Cell cl = rw.createCell(0);
			cl.setCellValue(url);
		}
		FileOutputStream fos =new FileOutputStream("./Excel/Test.xlsx");
		book.write(fos);
		driver.close();
	}
}
