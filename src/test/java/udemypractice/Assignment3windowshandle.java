package udemypractice;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment3windowshandle {
	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver(); 
		driver.get("http://the-internet.herokuapp.com/");
		driver.findElement(By.linkText("Multiple Windows")).click();
		driver.findElement(By.xpath("//a[contains (text(),'Click Here')]")).click();
		
		Set <String> abc=driver.getWindowHandles();
		Iterator <String> it =abc.iterator();
		String parentwindow=it.next();
		driver.switchTo().window(it.next());
		System.out.println(driver.findElement(By.xpath("//h3[contains (text(),'New Window')]")).getText());
        driver.switchTo().window(parentwindow);
       System.out.println( driver.findElement(By.xpath("//div[@id='content']/div/h3")).getText());
	}

	
	
	
}
