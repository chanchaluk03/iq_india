package workingWithExcel;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class TestNGExcelFile {
	
	@Test
	public void excelcode() throws IOException {
		
		// path = excel workbook location...
		// File for handel any file in java...
		// FileInputStream for reading row data and it throw FileNotFoundException when file empty ...
		// XSSFWorkbook read row data into xlsx workbook format...
		// XSSFSheet get workbook sheet - getSheet(sheetname) or getsheet(sheet-index)....
		
		String path = "C:\\Users\\HP\\OneDrive\\Desktop\\TestNGExcel\\TestData.xlsx";
		File f = new File(path);
		FileInputStream fis = new FileInputStream(f);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sh = wb.getSheet("employee");
		
		// getPhysicalNumberOfRows() this method count all the present rows in the sheet....
		
//		System.out.println(sh.getPhysicalNumberOfRows());
		
		// getLastRowNum() this method count from index 0 means its not count 1st row(header).....
		
		int row =sh.getLastRowNum();
		System.out.println("row "+row);
		
		
		// to count column in excel file........
		
		int col = sh.getRow(0).getLastCellNum();
		System.out.println("column "+col);
		
		// for retriving data with loop..........
		
//		for(int r=1;r<=row;r++)
//		{
//			for(int c=0;c<col;c++)
//			{
//				// if sheet have only string values .....
//				
//				System.out.println(sh.getRow(r).getCell(c).getStringCellValue());
//			}
//			System.out.println();
//		}
		
		wb.close();
		fis.close();
		
	}

}
 