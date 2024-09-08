package workingWithExcel;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;



public class UseExcelForLogin {
	@DataProvider(name ="exceldataprovider")
	public Object[][]  useexcel() throws IOException {

	String workbookpath = "C:\\Users\\HP\\OneDrive\\Desktop\\TestNGExcel\\Testfire.xlsx";
	File file = new File(workbookpath);
	FileInputStream fileinput = new FileInputStream(file);
	XSSFWorkbook workbook = new XSSFWorkbook(fileinput);
	XSSFSheet sheet = workbook.getSheet("inputidpass");
	
	int row = sheet.getLastRowNum();
	int col = sheet.getRow(0).getLastCellNum();
	
	Object obj [][] = new Object [row][col];
	
	for(int r=0;r<row;r++)
	{
		XSSFRow rw = sheet.getRow(r); 
		for(int c =0;c<col;c++)
		{
			XSSFCell cell = rw.getCell(c);
			CellType celltype = cell.getCellType();
			
			DataFormatter df = new DataFormatter();
			
			obj[r][c] = df.formatCellValue(sheet.getRow(r).getCell(c));
			
			
//			switch(celltype) {
//			case STRING:
//				obj[r][c] = cell.getStringCellValue();
//				break;
//			case NUMERIC:
//				obj[r][c] = (Integer.toString((int)cell.getNumericCellValue()));
//				break;
//			case BOOLEAN:
//				obj[r][c] = cell.getBooleanCellValue();
//				break;
//			default:
//				System.out.println("incorrect data");
//				
//			}
			
		}
	}
	fileinput.close();
	workbook.close();
	return obj;

	}
}
