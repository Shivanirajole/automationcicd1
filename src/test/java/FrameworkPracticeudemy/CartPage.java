package FrameworkPracticeudemy;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import ReuseablecomponentsForFrameworkUdemy.ReuseablecomponentsForFramworkUdemy;

public class CartPage extends ReuseablecomponentsForFramworkUdemy {
     WebDriver driver;
     
  //   List <WebElement> cartproducts= driver.findElements(By.cssSelector(".cartSection h3"));
	  // Boolean match=cartproducts.stream().anyMatch(cartproduct-> cartproduct.getText().equalsIgnoreCase(productname));
	  // Assert.assertTrue(match);
	 //  driver.findElement(By.cssSelector(".totalRow button")).click();
     @FindBy(css=".totalRow button")
     WebElement checkoutele;
     
     @FindBy(css=".cartSection h3")
    List< WebElement> cartprocuts;
     
	public CartPage(WebDriver driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
		public Boolean verifyproductdisplay(String productname ) {
	    Boolean match=cartprocuts.stream().anyMatch(cartproduct-> cartproduct.getText().equalsIgnoreCase(productname));	
	    return match;
		}
	public CheckoutPage gotocheckout() {
		checkoutele.click();
		return new CheckoutPage(driver);
		
	}
	} 


