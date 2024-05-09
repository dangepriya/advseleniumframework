package Practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;

public class FetchSingleDataFromExcel {

	public static void main(String[] args) throws Throwable 
	{
		//step 1---set the path
		FileInputStream fes = new FileInputStream("./src/test/resources/Book1.xlsx");
		Workbook book = WorkbookFactory.create(fes);
		Sheet sheet = book.getSheet("Data1");
		Row row = sheet.getRow(0);
		Cell cell = row.getCell(0);
		
		String data=cell.getStringCellValue();
		
	}

}
