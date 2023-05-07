package testcases;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import base.BaseClass;
import pageObjects.OneWayTripPage;

public class OneWayTripTest  extends BaseClass{

	@Test
	public void SearchFlight(){
		OneWayTripPage oneway=new OneWayTripPage(driver);
		oneway.onewaytripBtn();
		oneway.onBoardingfromBtn(prop.getProperty("From"));
		oneway.destination(prop.getProperty("To"));
		oneway.departure();
		oneway.SearchBtn();
	}

}
