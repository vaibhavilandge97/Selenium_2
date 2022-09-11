package flipKart;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	WebDriver driver;
	public void baseclass() {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Desktop\\Selenium Folders\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

}
