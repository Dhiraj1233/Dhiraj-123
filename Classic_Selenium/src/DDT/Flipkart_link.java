package DDT;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
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

public class Flipkart_link
{
	    /*Read multiple data from excel*/
	    public static void main(String[] args) throws IOException
	    {
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.flipkart.com");
		List<WebElement> links = driver.findElements(By.xpath("//a"));  // find all the link in flipkart
		FileInputStream fis=new FileInputStream("./Excel/Test.xlsx");   //create the file and give path of file
		Workbook book=WorkbookFactory.create(fis);                      // by using ref var access the file 
		Sheet sheet = book.createSheet("Flipkart_Links");               //create sheet in excel
		int count = links.size();                                      // count the size of link
		for (int i = 0; i < count; i++)
		{
			WebElement link = links.get(i);                             // fetch all the links one by one and store into the ref var
			String url = link.getAttribute("href");                     //fetch link
			Row rw = sheet.createRow(i);                                //store the link row by row
			Cell cl = rw.createCell(0);                                 // Store the link by cell
			cl.setCellValue(url);                                       //It will set all the cell value
		}
		FileOutputStream fos=new FileOutputStream("./Excel/Test.xlsx"); //it is use to write the data inside the excel
		book.write(fos);
		driver.close();
	}
}
