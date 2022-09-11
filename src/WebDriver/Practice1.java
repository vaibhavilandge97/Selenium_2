package WebDriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Desktop\\Selenium Folders\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//Thread.sleep(2000);
		
		driver.navigate().to("https://www.google.com/");
		Thread.sleep(2000);
		
		driver.manage().window().minimize();
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		String url=driver.getCurrentUrl();
		System.out.println(url);
		
		driver.navigate().back();
		Thread.sleep(2000);
		
		//String title=driver.getTitle();
		System.out.println(driver.getTitle());
		
		driver.navigate().refresh();
		Thread.sleep(2000);
		
		driver.quit();
		
		
		
	}


}
