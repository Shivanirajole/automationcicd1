package TestComponentsUdemyframeworkpractice;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import ResourcesUdemyFrameworkPractice.ExtentReporterNG;

public class Listeners  extends BaseTest implements ITestListener{
	ExtentTest test;
	ExtentReports extent=ExtentReporterNG.GetReportObject();
   ThreadLocal<ExtentTest> extentTest =new 	ThreadLocal<ExtentTest>();  //threadsafe
   
@Override
public void onTestStart(ITestResult result) {
	test=extent.createTest(result.getMethod().getMethodName());
	extentTest.set(test);
}

@Override
public void onTestSuccess(ITestResult result) {
	extentTest.get().log(Status.PASS, "TEST PASS");
}

@Override
public void onTestFailure(ITestResult result) {
	extentTest.get().fail(result.getThrowable());
	try {
		driver=(WebDriver) result.getTestClass().getRealClass().getField("driver").get(result.getInstance());
	} catch (Exception e1) {
	
		e1.printStackTrace();
	
	}
	String filepath = null;
	try {
		filepath = GetScreenshot(result.getMethod().getMethodName(),driver);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	extentTest.get().addScreenCaptureFromPath(filepath, result.getMethod().getMethodName());
}

@Override
public void onFinish(ITestContext context) {
	extent.flush();
}


}
