package Pop_ups;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildWindowPopUp {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Desktop\\Selenium Folders\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://secure.indeed.com/auth");
		
		driver.findElement(By.xpath("//button[@id='login-facebook-button']")).click();
		
		Set<String> allId=driver.getWindowHandles();
		
		ArrayList<String> array=new ArrayList<String>(allId) ;
		
		driver.switchTo().window(array.get(1));
		Thread.sleep(2000);
		
		driver.switchTo().window(array.get(0));
		Thread.sleep(2000);
		
		driver.close();
		
		
	}

}
