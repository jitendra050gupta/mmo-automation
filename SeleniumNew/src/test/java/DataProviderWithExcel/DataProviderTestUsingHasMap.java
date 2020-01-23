package DataProviderWithExcel;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTestUsingHasMap {
	
	
	@Test(dataProvider="userData")
	public void integrationTest(Map<Object, Object> map) {
	    System.out.println("-------------Test case started ----------------");
	    System.out.println(map.get("FirstName"));
	    System.out.println(map.get("MidName"));
	    System.out.println(map.get("LastName"));
	    System.out.println(map.get("Mo No."));
	    System.out.println(map.get("Com.Name"));
	   

	    System.out.println("-------------Test case Ended ----------------");

	  }
	
	@DataProvider(name = "userData")
	public Object[] excelData() throws IOException{
		
		FileInputStream file = new FileInputStream("C:\\Users\\kumarguptaj\\eclipse-workspace\\SeleniumNew\\src\\test\\java\\DataProviderWithExcel\\Jitu.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(file);
		XSSFSheet sheet= wb.getSheetAt(0);
		int rowCount = sheet.getLastRowNum();
		int colCount = sheet.getRow(0).getLastCellNum();
		
		 Object[] obj = new Object[rowCount];

		    for (int i = 0; i < rowCount; i++) {
		      Map<Object, Object> datamap = new HashMap<>();
		      for (int j = 0; j < colCount; j++) {
		        datamap.put(sheet.getRow(0).getCell(j).toString(), sheet.getRow(i+1).getCell(j).toString());
		      }
		      obj[i] = datamap;

		    }
		    System.out.println("Hello");
		    return  obj;
		   
		 	
	}
	
	
	

}
