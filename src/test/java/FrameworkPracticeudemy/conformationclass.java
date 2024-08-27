package FrameworkPracticeudemy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ReuseablecomponentsForFrameworkUdemy.ReuseablecomponentsForFramworkUdemy;

public class conformationclass extends ReuseablecomponentsForFramworkUdemy {
	    WebDriver driver;
	    public conformationclass(WebDriver driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	  //  String confirmmsg= driver.findElement(By.cssSelector(".hero-primary")).getText();
	    @FindBy(css=".hero-primary")
	    WebElement confirmmsg;

	    public String getconformationmsg()
{
	    	return confirmmsg.getText(); 	
}
}
