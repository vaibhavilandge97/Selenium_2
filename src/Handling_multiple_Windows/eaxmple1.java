package Handling_multiple_Windows;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class eaxmple1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\Selenium Folders\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/browser-windows");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//button[@id='tabButton']")).click();
		
	   Set<String> allId=driver.getWindowHandles();
	   
	   ArrayList<String> a=new ArrayList<String>(allId);
	   
	   driver.switchTo().window(a.get(1));
	   Thread.sleep(2000);
	   WebElement text=driver.findElement(By.xpath("//h1[@id='sampleHeading']"));
	   String t=text.getText();
	   System.out.println(t);
	   
	   driver.switchTo().window(a.get(0));
	   
	   driver.findElement(By.xpath("//button[@id='windowButton']")).click();
	   
	   driver.switchTo().window(a.get(1));
	   Thread.sleep(2000);
	   
	   driver.manage().window().maximize();
	   
	   
	   WebElement text1=driver.findElement(By.xpath("//h1[@id='sampleHeading']"));
	   String T=text1.getText();
	   Thread.sleep(2000);
	   System.out.println(T);
	   driver.manage().window().minimize();
	   
	   driver.switchTo().window(a.get(0));
	   
	   
	   driver.close();
	   
	   
	   
	   
		
	}


}
