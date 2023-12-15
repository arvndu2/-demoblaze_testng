package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Basepage {
	
	WebDriver ldriver;
	
	public Basepage(WebDriver rdriver) {
		
		this.ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
		// PageFactory.initElements(driver, this);
	}

}
