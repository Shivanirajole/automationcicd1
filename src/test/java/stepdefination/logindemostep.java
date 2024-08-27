package stepdefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class logindemostep {
	
	WebDriver driver= null;
	
	@Given("browser is open")
	public void browser_is_open() throws InterruptedException {
		
		driver =new ChromeDriver();
		driver.get("https://www.google.com/");
		Thread.sleep(2000);
	  
	}

	@And("user is on login page")
	public void user_is_on_login_page() {
	   
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	
	@And("user clicks on login")
	public void user_clicks_on_login() throws InterruptedException {
		
		
		
	///	driver.findElement(By.xpath("//*[@class='oxd-text oxd-text--h5 orangehrm-login-title']"));
		Thread.sleep(2000);
	}


	@When("user enters username and password")
	public void user_enters_username_and_password() throws InterruptedException {
		
		
		Thread.sleep(2000);
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");

		
	  
	}

	@Then("user is navigated to the home page")
	public void user_is_navigated_to_the_home_page() throws InterruptedException {
		
		Thread.sleep(2000);

		driver.findElement(By.xpath("//*[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']")).click();
		driver.findElement(By.xpath("//*[@class='oxd-text oxd-text--h6 oxd-topbar-header-breadcrumb-module']")).isDisplayed();
		driver.close();
		driver.quit();
	  
	}



	

}
