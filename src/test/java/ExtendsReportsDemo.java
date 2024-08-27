

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.annotations.BeforeTest;

	import com.aventstack.extentreports.ExtentReports;
	import com.aventstack.extentreports.reporter.ExtentSparkReporter;

	public class ExtendsReportsDemo {
		ExtentReports extent;
		@BeforeTest
		public void config() {
			
			//Extends report,Extendsparkreporter
			
			String path=System.getProperty("user.dir")+"\\Reports\\index.html";
				
			ExtentSparkReporter reporter= new ExtentSparkReporter(path);
			reporter.config().setReportName("Web automation result");
			reporter.config().setDocumentTitle("Test Results");
		
		
	    extent=new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("Tester", "rahul sheety");
		}
		
		
		
		

		public void initialDemo() {
			extent.createTest("initialDemo");
			WebDriver driver= new ChromeDriver();
			driver.get("https://rahulshettyacademy.com/");
		    System.out.println(driver.getTitle());
		    driver.close();
		   
		    extent.flush();
		}

	}



