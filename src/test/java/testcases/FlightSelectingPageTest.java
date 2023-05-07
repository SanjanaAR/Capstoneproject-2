package testcases;

import org.testng.annotations.Test;
import base.BaseClass;
import pageObjects.FlightSelectingPage;

public class FlightSelectingPageTest extends BaseClass {
	
	@Test
	public void SelectFlight() throws InterruptedException {
		FlightSelectingPage select=new FlightSelectingPage(driver); {
			select.onewaytripBtn();
			select.onBoardingfromBtn(prop.getProperty("From"));
			select.destination(prop.getProperty("To"));
			select.departure();
			select.SearchBtn();
			select.SelectFlight();
			select.ContinueBtn();
			Thread.sleep(2000);
		}
	}

	

}
