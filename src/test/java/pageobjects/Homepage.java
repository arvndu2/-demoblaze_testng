package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Homepage extends Basepage {

	
	 WebDriver rdriver;
	public Homepage(WebDriver rdriver) {
		super(rdriver);
		
	}
	
	
	@FindBy(xpath = "//div[@class='panel header']//a[normalize-space()='Create an Account']")
     WebElement clkmyaccount;
	
	//Login
	
	@FindBy(xpath = "//div[@class='panel header']//a[contains(text(),'Sign In')]")
	WebElement lgn;
	
	
	// Action Elements
	public void clkacc() {
		clkmyaccount.click();
	}
	
	public void lgnclk() {
		lgn.click();
	}
	
	
}
