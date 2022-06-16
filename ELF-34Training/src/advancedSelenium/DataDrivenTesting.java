package advancedSelenium;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class DataDrivenTesting {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		File file=new File("./testData/TestData.xlsx");
		FileInputStream fis=new FileInputStream(file);
		Workbook workbook= WorkbookFactory.create(fis);
		Sheet sheet=workbook.getSheet("Sheet1");
		System.out.println(sheet.getRow(5).getCell(1).getNumericCellValue());
		System.out.println(sheet.getRow(2).getCell(1).toString());
		
		
	}
	
	public String readStringValue(String sheetname, int rowNum, int CellNum) throws EncryptedDocumentException, IOException {
		
		File file=new File("./testData/TestData.xlsx");
		FileInputStream fis=new FileInputStream(file);
		Workbook workbook= WorkbookFactory.create(fis);
		Sheet sheet=workbook.getSheet(sheetname);
		return sheet.getRow(rowNum).getCell(CellNum).toString();
		
	}
}
