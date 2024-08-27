package FrameworkPracticeudemy;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import ReuseablecomponentsForFrameworkUdemy.ReuseablecomponentsForFramworkUdemy;

public class Productcatlog extends ReuseablecomponentsForFramworkUdemy {
	
        WebDriver driver;
	
	    public Productcatlog(WebDriver driver){   //this driver use for object creation in main class   
		super(driver);
		this.driver=driver;  //this.driver use for the class driver 
		PageFactory.initElements(driver, this); 	
	}
	    
	 //  List <WebElement> products=driver.findElements(By.cssSelector(".mb-3"));
	    @FindBy(css= ".mb-3")
	    List< WebElement> products;
	    
	    @FindBy(css= "ng-animating")
	     WebElement spinner;
	    
	    By products1 =By.cssSelector(".mb-3");
	    By addtocart=By.cssSelector(".card-body button:last-of-type");
	    By toastmsg=By.cssSelector("#toast-container");
	    
	    public List<WebElement> getproductlist() {
	    	waitForElementtobeapper(products1);
			return products;
		}
	    
	    public WebElement gettheproductbyname(String productname) {

	    	 WebElement prod=products.stream().filter(product ->product.findElement(By.cssSelector("b")).getText().equals(productname)).findFirst().orElse(null);
		     return prod; 
	    }
	    
	    public void addtocart(String productname) {
	    	WebElement prod= gettheproductbyname( productname);
	    	  prod.findElement(addtocart).click();
	    	  waitForElementtobeapper(toastmsg);
	    	  waitforelementtodisapper(spinner);
	    	

	    }
}


