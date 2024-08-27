package FrameworkPracticeudemy;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import ReuseablecomponentsForFrameworkUdemy.ReuseablecomponentsForFramworkUdemy;

public class CheckoutPage extends ReuseablecomponentsForFramworkUdemy {

	WebDriver driver;
	public CheckoutPage(WebDriver driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	// a.sendKeys(driver.findElement(By.cssSelector("[placeholder='Select Country']")), "india").build().perform();
	// driver.findElement(By.cssSelector(".action__submit")).click();
	//  driver.findElement(By.xpath("//button[contains (@class,'ta-item')][2]")).click();
	
	@FindBy(xpath="//a[@class=\"btnn action__submit ng-star-inserted\"]")
	WebElement submit;
	   
	@FindBy(css="[placeholder='Select Country']")
	WebElement Country;
	
	@FindBy(xpath="//button[contains (@class,'ta-item')][2]")
	WebElement Selectcountry;

	By results=By.cssSelector(".ta-results");

      public void SelectCountry(String countryname) {
	  Actions a=new Actions(driver);
	   a.sendKeys(Country, countryname).build().perform();
	   waitForElementtobeapper(By.cssSelector(".ta-results"));
	   Selectcountry.click();	
}
    public conformationclass submitorder() {
  
	submit.click();
	return new conformationclass(driver);
	
}
}
