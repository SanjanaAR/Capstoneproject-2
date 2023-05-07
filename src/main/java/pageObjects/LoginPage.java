package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	public WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	
	//Locating Elements
	
	@FindBy(xpath="(//div[@class='css-76zvg2 r-jwli3a r-ubezar'])[1]")
	WebElement LoginBtn;
	
	@FindBy(xpath="(//div[@class='css-76zvg2 r-homxoj r-ubezar r-1ozqkpa'])[4]")
	WebElement EmailBtn;
	
	@FindBy(xpath="//input[@type='email']")
	WebElement EnterEmailIDBtn;
	
	@FindBy(xpath="//input[@type='password']")
	WebElement EnterPwdBtn;
	
	@FindBy(xpath="//input[@type='password']")
	WebElement EnterInvalidPwdBtn;
	
	@FindBy(xpath="//div[@data-testid='login-cta']")
	WebElement ClickLoginBtn;
	
	//Method Creation
	
	public void Login() {
		LoginBtn.click();
	}
	
	public void Email() {
		EmailBtn.click();
	}
	
	public void EmailId(String EmailId) {
		EnterEmailIDBtn.sendKeys(EmailId);
	}
	
	public void Password(String Password) {
		EnterPwdBtn.sendKeys(Password);
	}
	
	public void invalidPassword(String invalidPassword) {
		EnterInvalidPwdBtn.sendKeys(invalidPassword);
	}
	
	public void LoginButton() {
		ClickLoginBtn.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
