package Challenge;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM3_Home {
	@FindBy(xpath="//span[text()='KXW990']")private WebElement un;
	
	POM3_Home(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	public void verifyKiteHomeUsername() {
		
	}

}
