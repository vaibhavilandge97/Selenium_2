package Handling_AutoSuggestions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Amazon1 {
	  WebDriver driver;
	  
	  WebElement input;
	@BeforeClass
	public void openAmaznon() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Desktop\\Selenium Folders\\chromedriver_win32\\chromedriver.exe" );
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
	  input=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
	}
	
  @Test	
 public void autoSuggestions() throws InterruptedException {
	input.sendKeys("Vivo");
	//Thread.sleep(2000);
	List<WebElement> suggestions =driver.findElements(By.xpath("//div[@class='autocomplete-results-container']/div"));
      for(WebElement s:suggestions) {
    	  String act=s.getText();
    	  String exp="vivo v23";
    	  Assert.assertEquals(act, exp,"Fail");
    	 
    	  
      }

		
	}
	
	@AfterClass
	public void closeAmazon() {
		driver.close();
		
	}
	

}
