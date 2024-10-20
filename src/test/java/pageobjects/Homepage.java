package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Homepage extends basepage {
	
	public Homepage(WebDriver driver)
	{
		super(driver);
	}
	//Elements
	
	@FindBy(xpath="//span[normalize-space()='My Account']")
	WebElement myaccount;
	
	@FindBy(linkText="Login")
	WebElement log;
	
	@FindBy(xpath="//a[normalize-space()='Register']")
	WebElement register;
	
	//Action methods
	public void clickaccount()
	{
		//myaccount.click();
		js.executeScript("arguments[0].click();", myaccount);
	}
	public void clickregister()
	{
		//register.click();
		js.executeScript("arguments[0].click();", register);
	}
	public void clicklogin()
	{
		//log.click();
		js.executeScript("arguments[0].click();", log);
	}

}
