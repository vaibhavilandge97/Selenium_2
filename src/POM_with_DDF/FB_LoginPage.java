package POM_with_DDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FB_LoginPage {
	@FindBy(xpath="//input[@id='email']")private WebElement emailID;
	@FindBy(xpath="//input[@id='pass']")  private WebElement pass;
	@FindBy(xpath="//button[@name='login']") private WebElement btn;
	
	public FB_LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	 
	

	public void inpLoginPageEmail(String user) {
		 emailID.sendKeys(user);
	 }
	 
	 public void inpLoginPagePass(String psw) {
		 pass.sendKeys(psw);
	 }
	 
	 public void clickLoginPageBtn() {
		 btn.click();
	 }

}
