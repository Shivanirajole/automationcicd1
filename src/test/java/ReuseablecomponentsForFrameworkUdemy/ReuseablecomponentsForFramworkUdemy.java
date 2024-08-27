package ReuseablecomponentsForFrameworkUdemy;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import FrameworkPracticeudemy.CartPage;
import FrameworkPracticeudemy.OrderPage;

public class ReuseablecomponentsForFramworkUdemy {
	WebDriver driver;
	public ReuseablecomponentsForFramworkUdemy(WebDriver driver) {
		this.driver=driver;
	}
	 @FindBy(css= "[routerlink*='cart']")
	  WebElement  addtocart;
	 
	 @FindBy(css= "[routerlink*='myorders']")
	  WebElement  OrderHeader;
	
	public void waitForElementtobeapper(By findby) {
		
	 WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(5));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(findby));
	} 
	
	public void waitForWebElementtobeapper(WebElement findby) {
		
		 WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(5));
		  wait.until(ExpectedConditions.visibilityOf(findby));
		} 
	
	public void waitforelementtodisapper(WebElement ele) {
		
		 WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(5));
	
		    wait.until(ExpectedConditions.invisibilityOf(ele));
	}
	
	public CartPage GotocartPage() {
		addtocart.click();
		  CartPage cartpage=new CartPage(driver);
		  return cartpage;
	}
	
	public OrderPage GotoorderPage() {
		OrderHeader.click();
		  OrderPage orderpage=new OrderPage(driver);
		  return orderpage;
	}

}
