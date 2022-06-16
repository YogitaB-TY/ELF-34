package advancedSelenium;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WorkingWithMultipleRead {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		testData("Series");
	}
	
	public static Object[][] testData(String Sheet) throws EncryptedDocumentException, IOException {
		
		File file=new File("./testData/TestData.xlsx");
		FileInputStream fis=new FileInputStream(file);
		Workbook wb=WorkbookFactory.create(fis);
		Sheet sheet=wb.getSheet(Sheet);
		
		int rowCount=sheet.getPhysicalNumberOfRows();
		int colCount=sheet.getRow(0).getPhysicalNumberOfCells();
		
		Object[][] data=new Object[rowCount-1][colCount];
		for(int i=1;i<rowCount;i++) {
			for(int j=0;j<colCount;j++) {
				data[i-1][j]=sheet.getRow(i).getCell(j).toString();
			}
		}
		
		return data;
		
		/*
		 * for(int i=0;i<rowCount-1;i++) { for(int j=0;j<colCount;j++) {
		 * System.out.println(data[i][j]); } }
		 */
	}

}
