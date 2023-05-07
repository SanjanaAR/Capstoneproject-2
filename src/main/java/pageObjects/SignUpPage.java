package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUpPage {

	public WebDriver driver;
	
	public SignUpPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}

	 @FindBy(xpath="(//div[@class='css-76zvg2 r-jwli3a r-ubezar'])[2]")	
	 WebElement Signup;
	 

	@FindBy(xpath="(//option[@value='MISS'])[1]")
	WebElement Select;


	@FindBy(xpath="//input[@id='first_name']")
	WebElement Firstname;
	
 
	@FindBy(xpath="//input[@id='last_name']")
	WebElement Lastname;

 
	@FindBy(xpath="//select[@class='form-control form-select']")
	WebElement Country;

 
	@FindBy(xpath="//input[@id='dobDate']")
	WebElement DOB;
 
	@FindBy(xpath="//input[@type='tel']")
	WebElement MOB;
 
	@FindBy(xpath="//input[@id='email_id']")
	WebElement Email;
 
	@FindBy(xpath="//input[@id='new-password']")
	WebElement Password;

	@FindBy(xpath="//input[@id='c-password']")
	WebElement ConfirmPass;

	@FindBy(xpath="//input[@class='form-check-input mt-02']")
	WebElement CheckboxAgree;

	@FindBy(xpath="//a/button[@type='button']")
	WebElement SubmitBtn;	
	
	
	public void Signup() {
		Signup.click();
	}
	
	public void Select() {
		Select.click();
	}
	
	public void Firstname(String FirstName) {
		Firstname.sendKeys(FirstName);
	}
	
	public void Lastname(String LastName) {
		Lastname.sendKeys(LastName);
	}
	
	public void Country(String country) {
		Country.sendKeys(country);
	}
	
	public void DOB(String dob) {
		DOB.sendKeys(dob);
	}
	
	public void MOB(String mob) {
		MOB.sendKeys(mob);
	}
	
	public void Email(String email) {
		Email.sendKeys(email);
	}
	
	public void Password(String password) {
		Password.sendKeys(password);
	}
	
	public void ConfirmPass(String cpass) {
		ConfirmPass.sendKeys(cpass);
	}

	public void CheckboxAgree() {
		CheckboxAgree.click();
	}
	
	public void SubmitBtn() {
		SubmitBtn.click();
	}
}
