package vtiger.genericLibrary;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class GetExcelData {

	
	public String getExcelData(String sheetname) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream("C:\\Users\\my pc\\eclipse-workspace\\vtiger\\src\\test\\resources\\TestData\\Book23.xlsx");
  Workbook wb=WorkbookFactory.create(fis);
    Sheet sh =wb.getSheet(sheetname); 
      Row row=sh.getRow(1);
    Cell cell =row.getCell(0);
    String orgName=cell.getStringCellValue();
		
		return orgName;
	}
}
