package POM_with_DDF;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TestFB {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream file= new FileInputStream("C:\\Users\\Admin\\Desktop\\Selenium Folders\\Book1.xlsx");
		Sheet sh=WorkbookFactory.create(file).getSheet("Sheet6");
		
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--disable-notifications");
		

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\Selenium Folders\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(option);
		
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		FB_LoginPage login=new FB_LoginPage(driver);
		
		String user=sh.getRow(0).getCell(0).getStringCellValue();
		login.inpLoginPageEmail(user);
		
		String psw=sh.getRow(1).getCell(0).getStringCellValue();
		login.inpLoginPagePass(psw);
		
		login.clickLoginPageBtn();
		
		
		
		
	}

}
