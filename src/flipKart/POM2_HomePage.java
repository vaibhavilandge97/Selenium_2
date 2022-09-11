package flipKart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM2_HomePage {
	@FindBy(xpath="//input[@class='_3704LK']")private WebElement search;
	@FindBy(xpath="//button[@class='L0Z3Pu']")private WebElement icon;
	
	POM2_HomePage(WebDriver driver){
		PageFactory.initElements(driver, this);
		
	}
	
	public void inpFKsearch(String inp) {
		search.sendKeys(inp);
		
	}
	
	public void clickIcon() {
		icon.click();
		
	}

}
