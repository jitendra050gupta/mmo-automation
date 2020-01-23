package com.racv.util;

import java.io.File;
import java.io.IOException;
import java.util.Calendar;
import java.util.GregorianCalendar;

import org.codehaus.plexus.util.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.ui.Select;

import com.racv.base.TestBase;

public class TestUtil extends TestBase{
	/*
public static boolean isExecutable(String tcid){
		
		for(int rowNum=2; rowNum<=excel.getRowCount("test_suite"); rowNum++){			
			if(excel.getCellData("test_suite", "tcid", rowNum).equals(tcid)){
				if(excel.getCellData("test_suite", "runmode", rowNum).equalsIgnoreCase("Y")){					
					return true;					
				}else{					
					return false;
				}			
			}		
		}		
		return false;		
	}
	
*/
	public static boolean isExecutable(String tcid) {
		
		for(int rownum=2; rownum<=excel.getRowCount("test_suite");rownum++) {
			if(excel.getCellData("test_suite", "tcid", rownum).equals(tcid)) {
				if(excel.getCellData("test_suite", "runmode", rownum).equalsIgnoreCase("Y"))
					return true;
			}			
	}
		return false;	
}
	
	public static void CaptureScreenshot(){
		
		  Calendar cal = new GregorianCalendar();
		  int month = cal.get(Calendar.MONTH); //3
		  int year = cal.get(Calendar.YEAR); //2014
		  int sec =cal.get(Calendar.SECOND);
		  int min =cal.get(Calendar.MINUTE);
		  int date = cal.get(Calendar.DATE);
		  int day =cal.get(Calendar.HOUR_OF_DAY);
		  
		  File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
		  String mailscreenshotpath = System.getProperty("user.dir")+"\\screenshots\\"+year+"_"+date+"_"+(month+1)+"_"+day+"_"+min+"_" +sec+".jpeg";
		  FileUtils.copyFile(scrFile, new File(mailscreenshotpath));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
	
	
	public static void creditCardPayment(){
		driver.findElement(By.xpath("//input[@id='nameoncard']")).sendKeys(prop.getProperty("nameOnCard"));
		driver.findElement(By.xpath("//input[@id='CCcardTypeId1']")).click();
		driver.findElement(By.xpath("//input[@id='card_number']")).sendKeys(prop.getProperty("creditCardNumber"));
		
		//Select expire month---------		
		driver.findElement(By.xpath("//span[@id='expiry_month-button']//span[@class='ui-selectmenu-icon ui-icon ui-icon-triangle-1-s']")).click();
		
		String startXpath = "//a[contains(text(),'";
		String monthXpath = prop.getProperty("expiryMonth");
		String endXpath = "')]";
		
		driver.findElement(By.xpath(startXpath+monthXpath+endXpath)).click();
			
		
		//Select expire year---------		
				driver.findElement(By.xpath("//span[@id='expiry_year-button']//span[@class='ui-selectmenu-icon ui-icon ui-icon-triangle-1-s']")).click();
				String yearXpath = prop.getProperty("expiryYear");
				driver.findElement(By.xpath(startXpath+yearXpath+endXpath)).click();				
				
		
		driver.findElement(By.xpath("//input[@id='securitynumberId']")).sendKeys(prop.getProperty("cvv"));
		
	}
	
	}
