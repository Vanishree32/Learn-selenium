import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
public class FileLibrary {
	
	
	

	public String getPropData(String key) throws IOException {
		
		FileInputStream fis=new FileInputStream("C:\\Users\\Brigosha_Guest\\eclipse-workspace\\LearnSelenium\\src\\test\\resources\\Config_Folder\\fetch.properties");
		Properties p=new Properties();
		p.load(fis);
		String data = p.getProperty(key);
		return data;
	}
	
	public String getExcelData(String sheetName,int row,int cell) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream("C:\\Users\\Brigosha_Guest\\eclipse-workspace\\LearnSelenium\\src\\test\\resources\\Config_Folder\\ExcelA.xlsx");
	Workbook wb = WorkbookFactory.create(fis);
	
		 String data=wb.getSheet(sheetName).getRow(row).getCell(cell).getStringCellValue();
		// int data1=wb.getSheet(sheetName).getRow(row).getCell(cell).getNumericCellValue();
		// boolean data2=wb.getSheet(sheetName).getRow(row).getCell(cell).getBooleanCellValue();
			
			
		return data;
		
	}

	

	public void setExcelData(int sheet, int row, int cell, String value) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream("C:\\Users\\Brigosha_Guest\\eclipse-workspace\\LearnSelenium\\src\\test\\resources\\Config_Folder\\ExcelA.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		//wb.getSheet(sheetName).getRow(row).getCell(cell).setCellValue(value);
		  wb.getSheetAt(sheet).getRow(row).createCell(cell).setCellValue(value);
		FileOutputStream fos=new FileOutputStream("C:\\Users\\Brigosha_Guest\\eclipse-workspace\\LearnSelenium\\src\\test\\resources\\Config_Folder\\ExcelA.xlsx");
       wb.write(fos);
       wb.close();
	}
}

