package Challenge;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM1_login1 {
	@FindBy(xpath="//input[@id='userid']")private WebElement UN;
	@FindBy(xpath="//input[@id='password']")private WebElement Psw;
	@FindBy(xpath="//button[@type='submit']")private WebElement btn;
	
	POM1_login1(WebDriver driver){
		PageFactory.initElements(driver, this);
		
	}
	
	public void inpKiteLogin1Username() {
		
	}
	
	public void inpKiteLogin1Password() {
		
	}
	
	public void clickKiteLoginBtn() {
		
	}

}
