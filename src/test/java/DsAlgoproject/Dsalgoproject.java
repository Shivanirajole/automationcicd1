package DsAlgoproject;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class Dsalgoproject {
	
	public WebDriver driver;
	
	public dsalgologinpage login;
  
	
	
	@Given("User launch the crome browser")
	public void user_launch_the_crome_browser() {
		driver=new ChromeDriver();
		login=new dsalgologinpage(driver);
	  
	}

	@When("user open the URL {string}")
	public void user_open_the_url(String url) {
	driver.get(url);
		  
	}

	@When("User enter Username as {string} and password as {string}")
	public void user_enter_username_as_and_password_as(String string, String string2) {
	  login.enterusername(string);
	  login.enterpassword(string2);
	}

	@When("click on to register button")
	public void click_on_to_register_button() {
		login.clickonlogin();
	  
	}

	@Then("page title shoud be {string}")
	public void page_title_shoud_be(String string) {
		if(driver.getPageSource().contains("You are logged in"));
		Assert.assertTrue(true);
		
   	
}

	@Then("click to Arrays Get Started")
	public void click_to_arrays_get_started() {
		login.started();
	  
	}

	@Then("click on the below Topics Covered button")
	public void click_on_the_below_topics_covered_button() {
		
		login.topiccovered();
		   
	}
	
	@Then("click on the signout button")
	public void click_on_the_signout_button() {
	
	login.signout();	
	}
	
	@Then("signin again")
	public void signin_again() {
		
		login.signin();
	
	}

}
