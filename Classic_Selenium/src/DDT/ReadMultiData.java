package DDT;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadMultiData 
{
	public static void main(String[] args) throws Throwable {
		FileInputStream fis=new FileInputStream("./Excel/Test.xlsx");
		Workbook book=WorkbookFactory.create(fis);
		Sheet sheet = book.getSheet("amazon_Links");
		int lr=sheet.getLastRowNum();
		for (int i = 0; i < lr; i++) 
		{
			Row rw = sheet.getRow(i);
			Cell cl = rw.getCell(0);
			String val = cl.getStringCellValue();
			System.out.println(val);
		}
	}

}
