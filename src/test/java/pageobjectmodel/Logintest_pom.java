package pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Logintest_pom {
	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver =new ChromeDriver();
		
		//loginpage_pom login =new loginpage_pom(driver);
		loginpage2_pf login=new loginpage2_pf(driver);
		
		driver.get("https://www.saucedemo.com/");
		
		login.enterusername("standard_user");
		login.enterpassword("secret_sauce");
		login.enterloginbtn();
		
	}

}
