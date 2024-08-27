package ResourcesUdemyFrameworkPractice;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReporterNG {
	
	public  static ExtentReports GetReportObject() {
		
		String path=System.getProperty("user.dir")+"\\Reports\\index.html";
		ExtentSparkReporter reporter= new ExtentSparkReporter(path);
		reporter.config().setReportName("Web automation result");
		reporter.config().setDocumentTitle("Test Results");
	
	
   ExtentReports extent=new ExtentReports();
	extent.attachReporter(reporter);
	extent.setSystemInfo("Tester", "rahul sheety");
    return extent;
		
	}

}
