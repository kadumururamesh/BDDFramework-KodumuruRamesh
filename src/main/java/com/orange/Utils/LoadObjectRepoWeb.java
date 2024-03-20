package com.orange.Utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import java.util.prefs.Preferences;

import org.apache.log4j.Logger;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class LoadObjectRepoWeb {
	
	private static final String LOCATOR_REFERENCES_FILE_LOCATION=System.getProperty("user.dir")+ "//src//test//resources//Object_Repo//Object_Repo_ExcelSheet.xlsx";

	WebDriver driver=null;
	private static final String ID="ID";
	private static final String NAME="NAME";
	private static final String XPATH="XPATH";
	private static final String CSS_SELECTOR="CSS_SELECTOR";
	private static final String LINK_TEXT="LINK_TEXT";
	private static final String PARTIAL_LINK_TEXT="PARTIAL_LINK_TEXT";
	private static final String	TAG_NAME="TAG_NAME";
	private static final String CLASS_NAME="CLASS_NAME";
	
	private static XSSFWorkbook workbook=null;
	
	private static int sheetcount=0;
	
	private static XSSFSheet sheet=null;
	
	
	public static HashMap<String,By> references=null;
	
	
	static Logger log =Logger.getLogger(LoadObjectRepoWeb.class);
	
	  
	 // @Test
	public static void getLocators()  {
		 
		try {
			FileInputStream fis = new FileInputStream(LOCATOR_REFERENCES_FILE_LOCATION);
			workbook= new XSSFWorkbook(fis);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.getMessage();
		}
		 
		references=new HashMap<String,By>();
		
		sheetcount=workbook.getNumberOfSheets();
		
		for(int i=0;i<sheetcount;i++) {
			sheet=workbook.getSheetAt(i);
			String sheetname=sheet.getSheetName();
			for(int j=1;j<sheet.getLastRowNum();j++) {
				String alias=sheetname +" "+sheet.getRow(j).getCell(0).getStringCellValue();
				String type=sheet.getRow(j).getCell(1).getStringCellValue();
				String value=sheet.getRow(j).getCell(2).getStringCellValue();
				By val=getBy(type,value);
				references.put(alias, val);
				log.info((alias +"-"+val));
				//log.info(references.get(alias));
				
				
				
			}
			
			
		}
		
		
	}

	private static By getBy(String type, String value) {
		if(type.equalsIgnoreCase(ID)) {
			return By.id(value);
		}else if(type.equalsIgnoreCase(NAME)) {
			return By.name(value);
		}else if(type.equalsIgnoreCase(XPATH)) {
			return By.xpath(value);
		}else if(type.equalsIgnoreCase(CSS_SELECTOR)) {
			return By.cssSelector(value);
		}else if(type.equalsIgnoreCase(LINK_TEXT)) {
			return By.linkText(value);
		}else if(type.equalsIgnoreCase(PARTIAL_LINK_TEXT)) {
			return By.partialLinkText(value);
		}else if(type.equalsIgnoreCase(TAG_NAME)) {
			return By.tagName(value);
		}else if(type.equalsIgnoreCase(CLASS_NAME)) {
			return By.className(value);
		}		
		return null;
	}

}
