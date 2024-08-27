package TestComponentsUdemyframeworkpractice;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.HashMap;
import java.util.List;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import FrameworkPracticeudemy.Landingpage;


import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	
	public  WebDriver driver;
	public Landingpage landingpage;

	public WebDriver initializationDriver() throws IOException {
		
		//properties class
		
	Properties prop= new Properties();
	FileInputStream fis= new FileInputStream(System.getProperty("user.dir")+
			"//src//main//java//ResourcesUdemyFrameworkPractice//GlobalData.properties");
				prop.load(fis);
	
	String browsername=prop.getProperty("browser");
	
	if(browsername.equalsIgnoreCase("Chrome")) {
		WebDriverManager.chromedriver().setup();
	 driver=new ChromeDriver();
		
	}
	else if(browsername.equalsIgnoreCase("firefox")) {
		 driver=new FirefoxDriver();
	}
	else if(browsername.equalsIgnoreCase("edge")) {	
		 driver=new EdgeDriver();
	}
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.manage().window().maximize();
	return driver;
		}
	
       public List<HashMap<String,String>> GetJsonDatatoMap(String filePath) throws IOException {
		
		//Read json to string
		String Jsoncontent =FileUtils.readFileToString(new File (filePath)
				);
				
		
		//String to hashmap for this add dependency jackson databind
		
		ObjectMapper mapper=new ObjectMapper();
		List<HashMap<String,String>> data= mapper.readValue(Jsoncontent, new TypeReference<List<HashMap<String,String>>>() {
			
		});
		return data;
	}
       
       public String GetScreenshot(String testCaseName,WebDriver driver) throws IOException {
   		TakesScreenshot TS= (TakesScreenshot)driver;
   		File source=TS.getScreenshotAs(OutputType.FILE);
   		File file=new File(System.getProperty("user.dir") +"//reports//" + testCaseName + ".png");
   		FileUtils.copyFile(source, file);
   		return System.getProperty("user.dir") +"//reports//" + testCaseName + ".png";
       }
	

	@BeforeMethod(alwaysRun=true)
	
	 public Landingpage launchapplication() throws IOException {
		 
		 driver=initializationDriver();
		 landingpage=new Landingpage(driver);
		 landingpage.GoTo();
		 return landingpage;
	 }

  @AfterMethod(alwaysRun=true)
	public void teardown() {
	
    	driver.close();
    }
}
