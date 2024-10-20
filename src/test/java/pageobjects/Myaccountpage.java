package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Myaccountpage extends basepage {
	
	public Myaccountpage(WebDriver driver)
	{
		super(driver);
	}
	@FindBy(xpath="//span[normalize-space()='Products']")
	WebElement msgheading;
	

}
