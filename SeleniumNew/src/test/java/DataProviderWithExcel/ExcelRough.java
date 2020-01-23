package DataProviderWithExcel;

import org.testng.annotations.Test;

public class ExcelRough {
	
	
	@Test
	public void excelTest() {
		ExcelReader reader = new ExcelReader("C:\\Users\\kumarguptaj\\eclipse-workspace\\SeleniumNew\\src\\test\\java\\DataProviderWithExcel\\Jitu.xlsx");
		int rowCount = reader.getRowCount("Sheet1");
		int colCount = reader.getColumnCount("Sheet1");
		//Object obj[][] = new Object[rowCount-1][colCount];

		for(int i=1;i<=rowCount;i++) {
			for(int j=0;j<colCount;j++) {
			  System.out.print(reader.getCellData("Sheet1", j, i)+" | ");
			  
				
			}
			System.out.println();
			
		
	}
	

}
}
