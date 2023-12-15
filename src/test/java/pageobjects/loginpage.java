package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class loginpage extends Basepage {
	WebDriver rdriver;
	public loginpage(WebDriver rdriver) {
		super(rdriver);
		
	}
	
	@FindBy(id = "email")
	WebElement lmail;
	
	@FindBy(id = "pass")
	WebElement lpass;
	
	@FindBy(xpath = "//fieldset[@class='fieldset login']//span[contains(text(),'Sign In')]")
	WebElement lbtn;
	
	@FindBy(xpath = "//div[@class='panel header']//span[@class='logged-in'][normalize-space()='Welcome, arvn11 naman12!']")
	WebElement usr;
	
	// Action elements
	
	public void email(String mal) {
		lmail.sendKeys(mal);
	}
	
	public void epass(String pas) {
		lpass.sendKeys(pas);
	}
	
	public void lclk() {
		lbtn.click();
	}
	
	// user verify
	
	public void us() {
		
		String x =usr.getText();
		System.out.println(x);
		String y = "Welcome, arvn11 naman12!";
		Assert.assertEquals(x, y);
	}
	

}
