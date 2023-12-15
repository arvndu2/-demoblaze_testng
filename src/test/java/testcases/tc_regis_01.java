package testcases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageobjects.Homepage;
import pageobjects.accountregis;

public class tc_regis_01 extends baseclass {
	
	
	
	
	int n=01;
	
	String k;
	
	
	
	@Test(groups = {"Smoke" , "Master"})
	void details() throws Throwable {
		
		Homepage bpage = new Homepage(driver);
		
		bpage.clkacc();
		accountregis acc = new accountregis(driver);
		
		acc.sfname("arvn11");
		acc.slname("naman12");
		acc.semail("arvndu2234@gmail.com");
		
		Thread.sleep(3000);
		acc.spas("koti2929@");
		acc.scpas("koti2929@");
		acc.clk();
		
		
		// String url = driver.findElement(By.xpath("//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']")).getText();
		 
		// System.out.println(url);
				 
		//Assert.assertEquals("Thank you for registering with Main Website Store.", url);
		
		String txt = driver.findElement(By.xpath("//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']")).getText();
		
		System.out.println(txt);
		if(driver.getPageSource().contains(txt)) {
			driver.close();
		}
		
		else {
			System.out.println("Same email already exits");
		}
	}
	
	
	
	

}
