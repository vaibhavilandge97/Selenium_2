package Web_Tables;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\Selenium Folders\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://qavalidation.com/demo-table/");
		
		List<WebElement> table=driver.findElements(By.xpath("(//table[@id='table01'])//tr"));
		
		List<WebElement> t=driver.findElements(By.xpath("((//table[@id='table01'])//tr[1])//td"));
		
		int row=table.size();
		System.out.println(row);
		
		int col=t.size();
		System.out.println(col);
		
		for(WebElement elements:table) {
			String data=elements.getText();
			System.out.println(data);
		}
		
		
		
		
		
	}

}
