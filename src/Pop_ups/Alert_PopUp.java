package Pop_ups;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_PopUp {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\Selenium Folders\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get(" https://chercher.tech/practice/hidden-division-popup");
		
		driver.findElement(By.xpath("//a[text()='View Pop-up']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[text()='Alert']")).click();
		Thread.sleep(2000);
		
		Alert alt=driver.switchTo().alert();
		
		String text =alt.getText();
		Thread.sleep(2000);
		
		alt.accept();
	}


}
