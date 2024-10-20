package testcases;

import java.time.Duration;
import java.util.*;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;

public class baseclass {
	public WebDriver driver;
	public Logger logger;
	public ResourceBundle rb;
	@BeforeClass
	@Parameters("browser")
	public void setup(String br){
		rb=ResourceBundle.getBundle("config");
		logger=LogManager.getLogger(this.getClass()); //logging
		//ChromeOptions options=new ChromeOptions();
		//options.setExperimentalOption("excludeswitches", new String[] {"enable automation"});
		if(br.equals("chrome"))
		{
		driver=new ChromeDriver();
		}
		else if(br.equals("edge"))
		{
			driver=new EdgeDriver();
		}
		else
		{
			driver=new FirefoxDriver();
		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.opencart.com/index.php");
		driver.manage().window().maximize();
	}
	@AfterClass
	public void teardown() {
		driver.close();
	}
    public String randomstring()
    {
    	String generatedstring=RandomStringUtils.randomAlphabetic(8);
    	return generatedstring;
    }
    public String randomnumber()
    {
    	String gennum=RandomStringUtils.randomNumeric(10);
    	return gennum;
    }
    public String randomalphanumeric()
    {
    	String gennum1=RandomStringUtils.randomNumeric(4);
    	String genstring=RandomStringUtils.randomAlphabetic(5);
    	return (gennum1+"@"+genstring);
    }
    public String capturescreen(String tname)throws IOException
   {
	//SimpleDateFormat df=new SimpleDateFormat("yyyyMMddhhmmss");
	//Date d=new Date();
	//String timestamp=df.format(d);
	String timestamp=new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
	TakesScreenshot takescreenshot=(TakesScreenshot) driver;
	File source=takescreenshot.getScreenshotAs(OutputType.FILE);
	String destination=System.getProperty("user.dir")+"\\screenshots\\"+tname+"_"+timestamp+".png";
	try
	{
		FileUtils.copyFile(source, new File(destination));
	}
	catch(Exception e)
	{
		e.getMessage();
	}
			
	return destination;
   }
    
}
