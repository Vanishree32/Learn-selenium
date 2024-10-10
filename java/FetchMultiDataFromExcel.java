
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class FetchMultiDataFromExcel
{

	
	public  static void main(String[]args) throws IOException{
		String excelPath="C:\\Users\\Brigosha_Guest\\eclipse-workspace\\LearnSelenium\\src\\test\\resources\\Config_Folder\\ExcelA.xlsx";
		
		FileInputStream fis = new FileInputStream(excelPath);
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		// XSSFSheet sheet=workbook.getSheet("iBelong");
		XSSFSheet sheet = workbook.getSheetAt(0);
		int RowNum = sheet.getLastRowNum();
		int colms = sheet.getRow(1).getLastCellNum();
		for (int r = 0; r <=RowNum; r++) {
			XSSFRow row = sheet.getRow(r);
			for (int c = 0; c < colms; c++) {
				XSSFCell cell = row.getCell(c);
			switch(	cell.getCellType()) {
			case STRING : System.out.print(cell.getStringCellValue());break;
			
			case NUMERIC :System.out.print(cell.getNumericCellValue());break;
			
			case BOOLEAN: System.out.print(cell.getBooleanCellValue());break;
			}
			System.out.print(" | ");
			}
			System.out.println("");
		}
	}

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}/*
		FileInputStream fis=new FileInputStream("C:\\Users\\Brigosha_Guest\\eclipse-workspace\\LearnSelenium\\src\\test\\resources\\Config_Folder\\ExcelA.xlsx");
			Workbook wb = WorkbookFactory.create(fis);
		 Sheet sheet = wb.getSheetAt(0);
		 int rows=sheet.getLastRowNum();//returns last row number
		int cols =sheet.getRow(1).getLastCellNum();
		for(int r=0;r<=rows;r++)
		{
			XSSFRow row = sheet.getRow(r);

		for(int c=0;c<cols;c++)
		{
		    XSSFCell cell = row.getCell(c);
		  switch(cell.getCellType())
		 {
		    case STRING:return cell.getStringCellValue();
		  break;
		    case NUMERIC :return cell.getNumericCellValue();
		break;
		    case BOOLEAN:return cell.getBooleanCellValue();
		   break;


		}


		}
		}
	}
	*/
