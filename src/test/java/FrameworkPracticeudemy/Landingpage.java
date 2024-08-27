package FrameworkPracticeudemy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ReuseablecomponentsForFrameworkUdemy.ReuseablecomponentsForFramworkUdemy;

public class Landingpage extends ReuseablecomponentsForFramworkUdemy {
	
	WebDriver driver;
	
	public Landingpage(WebDriver driver){   //this driver use for object creation in main class   
		super(driver);
		this.driver=driver;  //this.driver use for the class driver 
		PageFactory.initElements(driver, this);    //to initilize the driver becoz we dont use driver.findelement in findby
			
	}
//	WebElement username= driver.findElement(By.id("userEmail"));
//	pagefactory:
		
	@FindBy (id="userEmail") 
	WebElement username ;
	
	@FindBy(id ="userPassword")
	WebElement userpassword;
	
	@FindBy(id="login")
	WebElement submit;
	

	@FindBy(css="[class*='flyInOut']")
	WebElement errormsg;
	
	
	public Productcatlog loginapplication(String email,String password) {
		username.sendKeys(email);
		userpassword.sendKeys(password);
		submit.click();
		Productcatlog productcatlog= new Productcatlog(driver);
		return  productcatlog;
	}
	
	public void GoTo() {
		driver.get("https://rahulshettyacademy.com/client");
	}
	
	public String GetErrorMsg() {
		waitForWebElementtobeapper(errormsg);
		return errormsg.getText();
	}
	
	
	

}
