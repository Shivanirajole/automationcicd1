package udemypractice;

import java.io.File;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;


public class Newwindowscrrenshot {
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/angularpractice/");
		
		//Switching Window
		
		driver.switchTo().newWindow(WindowType.TAB);
		Set<String> window=driver.getWindowHandles();
		Iterator <String> it=window.iterator();
		String parentwindow=it.next();
		String childwindow=it.next();
		driver.switchTo().window(childwindow);
		
		driver.get("https://rahulshettyacademy.com/");
		
		String courseName = driver.findElements(By.cssSelector("a[href*='https://courses.rahulshettyacademy.com/p']")).get(1).getText();
		
	    driver.switchTo().window(parentwindow);
	    WebElement name=  driver.findElement(By.name("name"));
	    name.sendKeys("courseName");
	    
	   

	  // driver.quit();
	   
	    //Get Height & Width

	    System.out.println(name.getRect().getDimension().getHeight());

	    System.out.println(name.getRect().getDimension().getWidth());
		
	}

	
	
}
