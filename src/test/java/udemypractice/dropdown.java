package udemypractice;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class dropdown {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		//Dynamic dropdown
		
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='BLR']")).click();
		Thread.sleep(2000);
		//driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();
		
		//parent to child x path example
		
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(text(),'12')][1]")).click();
//		
//		
		//Auto suggestive dropdown
//		
//		driver.findElement(By.id("autosuggest")).sendKeys("ind");
//		Thread.sleep(2000);
//	List<WebElement> options =driver.findElements(By.cssSelector("li[class='ui-menu-item"));
//	
//	for(WebElement option : options)
//	{
//		if(option.getText().equalsIgnoreCase("india"))
//		{
//			option.click();
//			break;
//		}
	}
	
	
	
	
		
		
		
	}


