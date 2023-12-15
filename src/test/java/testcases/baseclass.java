package testcases;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;



public class baseclass {
	
	public  WebDriver driver; 
	
	@BeforeClass(groups = {"Master" , "Sanity" , "Smoke"})
	@Parameters("browser")
	void setup(String br) {
		if(br.equals("chrome")) {
		
		driver = new ChromeDriver();}
		
		
		else if(br.equals("edge")) {
			
			driver = new EdgeDriver();}
		
		else if(br.equals("fire")) {
			
			driver = new FirefoxDriver();}
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("https://magento.softwaretestingboard.com/");
		
		driver.manage().window().maximize();
		
		
	}
	
	
	@AfterClass
	void tear() throws Throwable {
		
		
		
		
		
	}
	
	public String captureScreen(String tname) throws IOException {

		/*Date dt=new Date();
		SimpleDateFormat sp=new SimpleDateFormat("yyyyMMddhhmmss");
		String timestamp=sp.format(dt);
		*/
		//String timeStamp = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
				
		TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
		File source = takesScreenshot.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(source, new File("D:\\Datadrivenframework\\demoblaze_testng\\test-output\\old\\vindu.png"));

		
		return tname;

	}

	
	
			
			
			
			
			
			

	

}
