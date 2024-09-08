package workingWithExcel;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel {

	public static void main(String[] args) throws IOException {
		
		String path = "C:\\Users\\HP\\OneDrive\\Desktop\\TestNGExcel\\TestData.xlsx";
		File f = new File(path);
		FileInputStream fis = new FileInputStream(f);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sh = wb.getSheet("employee");
		
		int row =sh.getLastRowNum();
		int col = sh.getRow(0).getLastCellNum();
		
		for(int r=1;r<=row;r++)
		{
			for(int c=0;c<col;c++)
			{
				// if sheet have both string and numeric values then we use dataformatter
				// dataformatter convert all value into string ..... 
				
				DataFormatter df = new DataFormatter();
				
				String value = df.formatCellValue(sh.getRow(r).getCell(c));
				System.out.println(value);
				
				
			}
			System.out.println();
		}
		
		wb.close();
		fis.close();

	}

}
