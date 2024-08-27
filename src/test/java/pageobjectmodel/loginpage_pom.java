package pageobjectmodel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginpage_pom {
	
	WebDriver driver;
	
	//constractor 
	
	loginpage_pom(WebDriver d){
		driver =d;
	}
	
	By username = By.id("user-name");
	By password =By.id("password");
	By loginbtn =By.id("login-button");
	
	public void enterusername(String uname) throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(username).sendKeys(uname);
	}
	
	public void enterpassword(String psword) {
		driver.findElement(password).sendKeys(psword);
	}
	
	public void enterloginbtn() {
		driver.findElement(loginbtn).click();
	}

}
