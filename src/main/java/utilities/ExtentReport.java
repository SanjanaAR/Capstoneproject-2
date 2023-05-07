package utilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReport {

	//Generating HTML Report 
	public static ExtentReports getExtentReport() {
		String extentReportPath=System.getProperty("user.dir")+"\\Reports\\extentreport.html";
		ExtentSparkReporter reporter=new ExtentSparkReporter(extentReportPath);
		reporter.config().setReportName("SpiceJet Automation Report");
		reporter.config().setDocumentTitle("SpiceJet Automation Testing");
		
	ExtentReports extentReport=new ExtentReports();
	extentReport.attachReporter(reporter);
	return extentReport;
		
	}

}
