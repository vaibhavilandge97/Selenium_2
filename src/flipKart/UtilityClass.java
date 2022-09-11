package flipKart;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class UtilityClass {
	
	public static String excel(int rowId,int colId) throws EncryptedDocumentException, IOException {
		FileInputStream file=new FileInputStream("C:\\Users\\Admin\\Desktop\\Selenium Folders\\FrameWork.xlsx");
		Sheet sh=WorkbookFactory.create(file).getSheet("FlipKart");
		String value=sh.getRow(rowId).getCell(colId).getStringCellValue();
		
		return value;
	}

}
