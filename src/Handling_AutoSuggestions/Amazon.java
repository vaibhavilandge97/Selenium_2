package Handling_AutoSuggestions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\Selenium Folders\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("samsung");
		
		List<WebElement> auto=driver.findElements(By.xpath("//div[@class='autocomplete-results-container']/div"));
		
		for(WebElement elements:auto) {
			String actual=elements.getText();
			String expected="samsung m32";
			if(actual.equals(expected)) {
				elements.click();
				break;
			}
			
		}
		
	}

}
