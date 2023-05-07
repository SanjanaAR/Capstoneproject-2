package testcases;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import base.BaseClass;
import pageObjects.LoginPage;

public class LoginPageTest extends BaseClass{

	//Writing testcases
	
	@Test(priority =1)
	public void loginwithValidcredentials() {
		LoginPage login=new LoginPage(driver);
		login.Login();
		login.Email();
		login.EmailId(prop.getProperty("Email"));
		login.Password(prop.getProperty("Password"));
		login.LoginButton();
				
	}
	

	@Test(priority =2)
	public void loginwithInvalidcredentials() {
		LoginPage login=new LoginPage(driver);
		login.Login();
		login.Email();
		login.EmailId(prop.getProperty("Email"));
		login.Password(prop.getProperty("InvalidPass"));
		login.LoginButton();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
