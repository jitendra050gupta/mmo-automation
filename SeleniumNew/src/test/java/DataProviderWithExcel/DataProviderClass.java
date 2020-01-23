package DataProviderWithExcel;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderClass {
	
	@Test(dataProvider = "details")
	public void test001(String F, String L, String M, String M_Num, String Comp ) {
		
		System.out.println(F+"  |  "+L+"  |  "+M+"  |  "+M_Num);
		
		
	}
	
	
	
	

	
	@DataProvider()   //indices values don't cause any exceptions
	public Object details() {
		ExcelReader excel = new ExcelReader("C:\\Users\\kumarguptaj\\eclipse-workspace\\SeleniumNew\\src\\test\\java\\DataProviderWithExcel\\Jitu.xlsx");
		int rowCount = excel.getRowCount("Sheet1");
		int colCount = excel.getColumnCount("Sheet1");
		Object obj[][] = new Object[rowCount-1][colCount];

		for(int i=2;i<=rowCount;i++) {
			for(int j=0;j<colCount;j++) {
				obj[i-2][j] = excel.getCellData("Sheet1", j, i);
				
			}
			
			
			
		}
		
	
		return obj;
	}


}
