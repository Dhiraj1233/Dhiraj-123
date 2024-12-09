package Morning_Selenium;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Ddtwrite 
{
	public static void main(String[] args) throws IOException {
		 FileInputStream fis=new FileInputStream("./Excel/Sheet1.xlsx");
		 Workbook book= WorkbookFactory.create(fis);
		Sheet sheet = book.createSheet("sheet2");
	    Row rw = sheet.createRow(0);
		Cell cl = rw.createCell(0);
		cl.setCellValue("Admin");
		FileOutputStream fos= new FileOutputStream("./Excel/Sheet1.xlsx");
		book.write(fos);
		
		 
	}

}
