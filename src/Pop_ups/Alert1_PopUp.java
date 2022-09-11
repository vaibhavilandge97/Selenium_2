package Pop_ups;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert1_PopUp {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\Selenium Folders\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://demo.guru99.com/test/delete_customer.php");
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("11");
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
	   Alert a= driver.switchTo().alert();
	   String text=a.getText();
	   System.out.println(text);
	   Thread.sleep(2000);
	   
	   a.accept();
	   Thread.sleep(2000);
	   
	   String msg=a.getText();
	   System.out.println(msg);
	   
	   a.accept();
	   Thread.sleep(2000);
	   
	   
	   
	   
	   
	   
		
	}

}
