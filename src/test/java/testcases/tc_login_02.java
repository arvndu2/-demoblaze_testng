package testcases;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageobjects.Homepage;
import pageobjects.loginpage;

public class tc_login_02 extends baseclass {
	
	@Test(groups = {"Sanity" , "Master"})
	public void login() {
		
		
		
		Homepage lgnpage = new Homepage(driver);
		lgnpage.lgnclk();
		
		//lgnclk
		
		loginpage lpage = new loginpage(driver);
		
		lpage.email("arvndu2234@gmail.com");
		lpage.epass("koti2929@");
		lpage.lclk();
		
		lpage.us();
	}

	
	

}

