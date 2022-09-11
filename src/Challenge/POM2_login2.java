package Challenge;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM2_login2 {
	@FindBy(xpath="//input[@id='pin']")private WebElement pin;
	@FindBy(xpath="//button[@type='submit']")private WebElement Btn;
	
	POM2_login2(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	public void inpKiteLogin2Pin() {
		
	}
	
	public void clickKiteLogin2Cnt() {
		
	}

}
