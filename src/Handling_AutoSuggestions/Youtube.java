package Handling_AutoSuggestions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Youtube {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\Selenium Folders\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.youtube.com/");
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 
		 driver.findElement(By.xpath("//input[@id='search']")).sendKeys("Kesariya");
		 
		 List<WebElement> auto=driver.findElements(By.xpath("//ul[@role='listbox']/li"));
		 
		 for(WebElement list:auto) {
			 String actual=list.getText();
			 String expected="kesariya full song";
			 if(actual.equals(expected)) {
				 list.click();
				 break;
			 }
		 }
		
	}

}
