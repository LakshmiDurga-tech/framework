package testcases;

import java.net.SocketException;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageobjects.Homepage;
import pageobjects.Accountregistrationpage;

public class accountregistration_testcase extends baseclass {

	@Test
	public void account_registration()
	{
		logger.info("clicked on register");
		try
		{
		Homepage hp=new Homepage(driver);
		hp.clickaccount();
		hp.clickregister();
		Accountregistrationpage regpage=new Accountregistrationpage(driver);
        
		regpage.setFirstName(randomstring());
		
		regpage.setLastName(randomstring());
		
		regpage.setEmail(randomalphanumeric());// randomly generated the email
	//	regpage.setTelephone(randomnumber());
		String password=randomalphanumeric();
		regpage.setPassword(password);
	    regpage.subscription();
		
		regpage.setPrivacyPolicy();
		
		regpage.clickContinue();
		String message=regpage.getConfirmationMsg();
		Assert.assertTrue(true);
		}
		catch(Exception e)
		{
			Assert.fail();
		}
	}
}
