package flipKart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM1_LogIn {
	//@FindBy(xpath="(//input[@type='text'])[2]")private WebElement MobNo;
	//@FindBy(xpath="//input[@type='password']")private WebElement pass;
	//@FindBy(xpath="(//button[@type='submit'])[2]")private WebElement btn;
	@FindBy(xpath="//button[@class='_2KpZ6l _2doB4z']")private WebElement close;
	POM1_LogIn(WebDriver driver){
		PageFactory.initElements(driver, this);
		
	}
	
	public void clickClosebtn() {
		close.click();
	}
	
	

}
