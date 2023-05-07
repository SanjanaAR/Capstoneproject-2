package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RoundTripPage {

	public WebDriver driver;
	
	public RoundTripPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	//Locating Elements
	
	@FindBy(xpath="//div[contains(text(),'round trip')]")
	WebElement roundtripBtn;
	
	@FindBy(xpath="(//input[@class='css-1cwyjr8 r-homxoj r-ubezar r-10paoce r-13qz1uu'])[1]")
	WebElement boardingfromBtn;
	
	@FindBy(xpath="(//input[@class='css-1cwyjr8 r-homxoj r-ubezar r-10paoce r-13qz1uu'])[2]")
	WebElement destinationBtn;
	
	@FindBy(xpath="(//div[@class='css-76zvg2 css-bfa6kz r-homxoj r-ubezar'])[1]")
	WebElement departuredateBtn;
	
	@FindBy(xpath="(//div[@class='css-76zvg2 css-bfa6kz r-homxoj r-ubezar'])[2]")
	WebElement returndateBtn;
	
	@FindBy(xpath="//div[@data-testid='home-page-flight-cta']")
	WebElement searchBtn;
	
	public void roundtripBtn() {
		roundtripBtn.click();
	}
	
	public void onBoardingfromBtn(String Boarding) {
		boardingfromBtn.click();
		boardingfromBtn.sendKeys(Boarding);
	}
	
	public void destination(String Destination) {
		destinationBtn.click();
		destinationBtn.sendKeys(Destination);
	}
	
	public void departure() {
		departuredateBtn.click();
	}
	
	public void returndate() {
		returndateBtn.click();
	}
	
	public void Search() {
		searchBtn.click();
	}
}

	
	
	
	
