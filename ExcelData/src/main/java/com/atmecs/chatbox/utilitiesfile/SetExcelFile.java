package com.atmecs.chatbox.utilitiesfile;
import java.io.FileInputStream;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFRow;
import com.atmecs.chatbox.constants.Constants;

public class SetExcelFile {

	public static XSSFRow row ;
	static Object[][] data ;
	public   Object[][] setExcelFile(String sheetName) throws Exception {

		FileInputStream fis = new FileInputStream(Constants.TEST_FILE);
			 HSSFWorkbook excelWBook = new HSSFWorkbook(fis);
			 HSSFSheet	excelWSheet = excelWBook.getSheet(sheetName);
			int rowCount = excelWSheet.getLastRowNum();
			System.out.println("rowCount= "+ rowCount);
			int columnCount = excelWSheet.getRow(0).getLastCellNum();
			System.out.println("columnCount =" + columnCount);
			data = new Object [rowCount][columnCount];
			
			for (int rowIndex = 1; rowIndex <=rowCount; rowIndex++) {
				int cellCount = excelWSheet.getRow(rowIndex).getLastCellNum();
				for (int columnIndex = 0; columnIndex < cellCount; columnIndex++) {
					String value = excelWSheet.getRow(rowIndex).getCell(columnIndex).getStringCellValue();
					
					data[rowIndex-1][columnIndex] = value;
					
		}
			}
			excelWBook.close();
			return data;
	}
}