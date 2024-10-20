package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.JavascriptExecutor;

public class basepage {
	
	WebDriver driver;
	JavascriptExecutor js;
	public basepage(WebDriver driver)
	{
		this.driver=driver;
		
		js=(JavascriptExecutor) driver;
		
		PageFactory.initElements(driver, this);
	}

}
