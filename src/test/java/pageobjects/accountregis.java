package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class accountregis extends Basepage {
	WebDriver rdriver;
public accountregis(WebDriver rdriver) {
		super(rdriver);
		
	}



	
	
	
		
		
		@FindBy(id = "firstname")
		WebElement fname;
		
		@FindBy(id = "lastname")
		WebElement lname;
		
		@FindBy(id = "email_address")
		WebElement email;
		
		
		@FindBy(id = "password")
		WebElement pass;
		
		@FindBy(id = "password-confirmation")
		WebElement cpass;
		
		@FindBy(xpath = "//button[@title='Create an Account']//span[contains(text(),'Create an Account')]")
		WebElement btnregis;
		
		
		@FindBy(xpath = "//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']")
		WebElement msg;
		
		public void sfname(String name) {
			fname.sendKeys(name);
		}
		
		public void slname(String lame) {
			lname.sendKeys(lame);
		}
		
		public void semail(String mail) {
			email.sendKeys(mail);
		}
		
		
		public void spas(String pas) {
			pass.sendKeys(pas);
		}
		
		public void scpas(String cpas) {
			cpass.sendKeys(cpas);
		}
		
		public void clk() {
			btnregis.click();
		}
	}



