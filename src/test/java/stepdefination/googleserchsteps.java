package stepdefination;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

//public class googleserchsteps {
//	
//	
//		WebDriver driver = null;
//		
//	
//	
//@ Given("browser is open")
//	public void browser_is_open() throws InterruptedException {
//	
//	driver =new ChromeDriver();
//	driver.get("https://www.google.com/");
//	Thread.sleep(2000);
//	
//	}
//
//	@Given("user is on google serch page")
//	public void user_is_on_google_serch_page() {
//		
//		
//		driver.findElement(By.name("q")).sendKeys("Raghav Pal");
//	}
//
//	@When("user is enter a text in a google serch box")
//	public void user_is_enter_a_text_in_a_google_serch_box() {
//		
//		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
//		
//	}
//
//	@When("hits enter")
//	public void hits_enter() throws InterruptedException {
//	 
//		driver.getPageSource().contains("Automation Step by Step");
//		Thread.sleep(2000);
//		driver.close();
//		
//	}
//
//	@Then("user is navigated to the serch result page")
//	public void user_is_navigated_to_the_serch_result_page() {
//		driver.quit();
//	   
//	}
//
//
//
//
//}
