package flipKart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM3_searchContent {
	@FindBy(xpath="((//div[@class='_2kHMtA'])[1]//span)[8]")private WebElement Review;
	
	POM3_searchContent(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	public String getTextReview() {
		String r=Review.getText();
		return r;
		
	}

}
