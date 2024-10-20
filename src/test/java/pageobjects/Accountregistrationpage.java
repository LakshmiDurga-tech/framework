package pageobjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.JavascriptExecutor;

public class Accountregistrationpage extends basepage {
	
	public Accountregistrationpage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	// Elements
			@FindBy(name = "firstname")
			WebElement txtFirstname;

			@FindBy(name = "lastname")
			WebElement txtLasttname;

			@FindBy(name = "email")
			WebElement txtEmail;

			@FindBy(name = "telephone")
			WebElement txtTelephone;

			@FindBy(name = "password")
			WebElement txtPassword;
			@FindBy(xpath = "//input[@id='input-newsletter-no']")
			WebElement subscription;

			@FindBy(xpath = "//button[normalize-space()='Continue']")
			WebElement chkdPolicy;

			@FindBy(xpath = "//button[normalize-space()='Continue']")
			WebElement ccontinue;

			@FindBy(css = "a[href='https://demo.opencart.com/index.php?route=account/success&language=en-gb&customer_token=4441600e7f756ecb73f8e684db']")
			WebElement msgConfirmation;

			public void setFirstName(String fname) {
				txtFirstname.sendKeys(fname);

			}

			public void setLastName(String lname) {
				txtLasttname.sendKeys(lname);

			}

			public void setEmail(String email) {
				txtEmail.sendKeys(email);

			}

			public void setTelephone(String tel) {
				txtTelephone.sendKeys(tel);

			}

			public void setPassword(String pwd) {
				txtPassword.sendKeys(pwd);

			}

			public void subscription() {
				
				js.executeScript("arguments[0].click();", subscription);

			}

			public void setPrivacyPolicy() {
				js.executeScript("arguments[0].click();",chkdPolicy);

			}

			public void clickContinue() {
				//sol1 
				js.executeScript("arguments[0].click();", ccontinue);
				
				//sol2 
				//btnContinue.submit();
				
				//sol3
				//Actions act=new Actions(driver);
				//act.moveToElement(btnContinue).click().perform();
							
				//sol4
				//JavascriptExecutor js=(JavascriptExecutor)driver;
				//js.executeScript("arguments[0].click();", btnContinue);
				
				//Sol 5
				//btnContinue.sendKeys(Keys.RETURN);
				
				//Sol6  
				//WebDriverWait mywait = new WebDriverWait(driver, Duration.ofSeconds(10));
				//mywait.until(ExpectedConditions.elementToBeClickable(btnContinue)).click();
				
			}

			public String getConfirmationMsg() {
				try {
					return (msgConfirmation.getText());
				} catch (Exception e) {
					return (e.getMessage());

				}

			}

}
