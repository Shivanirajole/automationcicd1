package udemypractice;

import java.util.List;
import java.util.stream.Collectors;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Streamjavafunction {
	public static void main(String[] args) {
		
	WebDriver driver=new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		
		// click on column
		driver.findElement(By.xpath("//tr/th[1]")).click();
		
		// capture all webelements into list
		
		List<WebElement> list =driver.findElements(By.xpath("//tr/td[1]"));
		
		// capture text of all webelements into new(original) list
		List <String> orignallist=list.stream().map(s->s.getText()).collect(Collectors.toList());
		
		// sort on the original list of step 3 -> sorted list
		
		List<String> sortlist=orignallist.stream().sorted().collect(Collectors.toList());
		
		// compare original list vs sorted list

     Assert.assertTrue(orignallist.equals(sortlist));
     
     List<String> price;
     do {
    
	// scan the name column with getText ->beans->print the price of the Rice
     List<WebElement> rows =driver.findElements(By.xpath("//tr/td[1]"));
     price=rows.stream().filter(s->s.getText().contains("Rice"))
    		 .map(s->getpriceveggies(s)).collect(Collectors.toList());
     price.forEach(a->System.out.print(a));
     if(price.size()<1)
     {
    	 driver.findElement(By.cssSelector("[aria-label='Next']")).click();
     }
     }while(price.size()<1);
     }
     
    
     
     
     private static String getpriceveggies(WebElement s) {
    	 String pricevalue = s.findElement(By.xpath("following-sibling::td[1]")).getText();
		return pricevalue;
	}
}