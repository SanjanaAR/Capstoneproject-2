package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FlightSelectingPage {

public WebDriver driver;
	
	public FlightSelectingPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	//Locating Elements
	
			@FindBy(xpath="//div[contains(text(),'one way')]")
			WebElement onewaytripBtn;
			
			@FindBy(xpath="//div[contains(text(),'From')]")
			WebElement boardingfromBtn;
			
			@FindBy(xpath="(//div[contains(text(),'To')])[1]")
			WebElement destinationBtn;
			
			@FindBy(xpath="(//div[@class='css-76zvg2 css-bfa6kz r-homxoj r-ubezar'])[1]")
			WebElement departuredateBtn;
			
			@FindBy(xpath="(//div[@data-testid='home-page-flight-cta'])[1]")
			WebElement SearchBtn;
			
			@FindBy(xpath="(//div[@class='css-76zvg2 r-homxoj r-1i10wst r-1kfrs79'])[10]")
			WebElement SelectFlight;
			
			@FindBy(xpath="//div[@data-testid='continue-search-page-cta']")
			WebElement ContinueBtn;
			
			
			public void onewaytripBtn() {
				onewaytripBtn.click();
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
			
			public void SearchBtn() {
				SearchBtn.click();
				}
			
			public void SelectFlight() {
				SelectFlight.click();
			}
			
			public void ContinueBtn() {
				ContinueBtn.click();
			}

}
