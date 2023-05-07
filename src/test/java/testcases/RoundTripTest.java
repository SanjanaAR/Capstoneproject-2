package testcases;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import base.BaseClass;
import pageObjects.RoundTripPage;

public class RoundTripTest  extends BaseClass{ 

	//Writing Testcases
	
	@Test
	public void SearchFlight() throws InterruptedException {
		RoundTripPage round=new RoundTripPage(driver);
		Thread.sleep(3000);
		round.roundtripBtn();
		round.onBoardingfromBtn(prop.getProperty("From"));
		round.destination(prop.getProperty("To"));
		round.departure();
		round.returndate();
		round.Search();
		Thread.sleep(3000);
	}

}
