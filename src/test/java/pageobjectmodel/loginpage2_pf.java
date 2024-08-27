package pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginpage2_pf {
	
	WebDriver driver;
	
	loginpage2_pf(WebDriver d){
		
		driver =d;
		//this method create a webelements
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id ="user-name") WebElement username;
	@FindBy(id="password") WebElement password;
	@FindBy(id="login-button") WebElement loginbtn;
	
	public void enterusername(String usr) {
		username.sendKeys(usr);  }
	
	public void enterpassword(String pass) {
		password.sendKeys(pass);  }
	
	public void enterloginbtn() {
		loginbtn.click();  }
	
	

}
