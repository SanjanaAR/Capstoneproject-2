package testcases;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import base.BaseClass;
import pageObjects.SignUpPage;

public class SignUpTest extends BaseClass{
	
	
	@Test
	public void Signup() throws InterruptedException {
		SignUpPage signup=new SignUpPage(driver);
		signup.Signup();
		Switchwindow();
		signup.Select();
		signup.Firstname(prop.getProperty("FirstName"));
		signup.Lastname(prop.getProperty("LastName"));
		signup.Country(prop.getProperty("Country"));
		signup.DOB(prop.getProperty("DOB"));
		signup.MOB(prop.getProperty("MobileNumber"));
		signup.Email(prop.getProperty("Email"));
		signup.Password(prop.getProperty("Password"));
		signup.ConfirmPass(prop.getProperty("Confirmpassword"));
		Thread.sleep(3000);
		signup.CheckboxAgree();
		signup.SubmitBtn();
	}

	
}
