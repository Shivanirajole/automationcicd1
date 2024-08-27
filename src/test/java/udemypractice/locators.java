package udemypractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locators {
	public static void main(String[] args) throws InterruptedException {
		
	WebDriver driver=new ChromeDriver();
	//impicitwait is use for wait,something to show 
	//Thread.sleep is use for something to get in a stable state;
  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
  driver.get("https://rahulshettyacademy.com/locatorspractice/");
	
  driver.findElement(By.id("inputUsername")).sendKeys("rahul");
  driver.findElement(By.name("inputPassword")).sendKeys("hello123");
  driver.findElement(By.className("signInBtn")).click();
  
  //css selector 
  //class name ==tagname.classname ==p.error
  //id == tagname#id ==input#inputusername
  // xpath
  //syntax= //Tagename[@attribute='value']
  
  System.out.println( driver.findElement(By.cssSelector("p.error")).getText());  
 // anker a means it is a link so we can use linktext locator if "a" is there
  driver.findElement(By.linkText("Forgot your password?")).click();
  driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("john");
  driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("john@gmail.com");
  driver.findElement(By.xpath("//input[@type='text'][2]")).clear();
  driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("john@gmail.com");
  driver.findElement(By.xpath("//form/input[3]")).sendKeys("1234567");
  Thread.sleep(2000);
  driver.findElement(By.xpath("//button[@class='reset-pwd-btn']")).click();
  System.out.println(driver.findElement(By.cssSelector("form p")).getText());
  driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]")).click();
  Thread.sleep(2000);
  driver.findElement(By.cssSelector("#inputUsername")).sendKeys("rahul");
  driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");
  driver.findElement(By.id("chkboxOne")).click();
  driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();
  
  
  
  
  
  
  
  
}
}
