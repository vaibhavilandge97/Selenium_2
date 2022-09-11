package flipKart;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestClass extends BaseClass {
	
	POM1_LogIn login;
	POM2_HomePage page;
	POM3_searchContent con;
	POM1_LogIn Close;
	
	@BeforeClass
	public void openFlipkart() throws EncryptedDocumentException, IOException {
		
		 baseclass();
		 Close=new POM1_LogIn(driver);
	     page=new POM2_HomePage(driver);
	     con=new POM3_searchContent(driver);
	     
		
	}
	
	@BeforeMethod
	public void logIn() throws InterruptedException {
		Close.clickClosebtn();
		Thread.sleep(2000);
		
	}
	
	
	@Test
	public void dynamicElements() throws InterruptedException, EncryptedDocumentException, IOException {
		page.inpFKsearch(UtilityClass.excel(0, 2));
		Thread.sleep(2000);
		
		page.clickIcon();
		Thread.sleep(2000);
		
		String value=con.getTextReview();
	    System.out.println(value);
		
		
	}
	
	@AfterMethod
	public void logOut() {
		
	}
	
	@AfterClass
	public void closeFlipkart() {
		driver.close();                
		
	}
	
	
	
	
	

}
