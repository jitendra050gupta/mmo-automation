package SimpleExcelReadTest;

import java.io.FileInputStream;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelTest {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("C:\\Users\\kumarguptaj\\eclipse-workspace\\SeleniumNew\\src\\test\\java\\DataProviderWithExcel\\Jitu.xlsx");
        XSSFWorkbook workbook = new XSSFWorkbook(fis);
        XSSFSheet sheet =  workbook.getSheet("Sheet1");
        
        //Accessing second row of the sheet
		XSSFRow row1= sheet.getRow(1);
		
		// Accessing first cell data
		XSSFCell cell1 = row1.getCell(0);
		System.out.println(cell1.getStringCellValue());
		
		// 
		System.out.println(row1.getCell(3).getNumericCellValue());
	}

}
