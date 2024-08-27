package FrameworkPracticeudemy;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.io.IOException;
import java.time.Duration;
import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import TestComponentsUdemyframeworkpractice.BaseTest;

public class frameworkpractice  extends BaseTest{

@Test
public void submitorder1() throws IOException {
		String productname = "ZARA COAT 3";
	
		Landingpage landingpage=launchapplication();
		Productcatlog productcatlog = landingpage.loginapplication("shivanirajole@gmail.com", "Shivani@123");

		List<WebElement> products = productcatlog.getproductlist();
		productcatlog.addtocart(productname);
        CartPage cartpage = productcatlog.GotocartPage();
       
		Boolean match = cartpage.verifyproductdisplay(productname);
		Assert.assertTrue(match);
		CheckoutPage checkoutpage = cartpage.gotocheckout();
		checkoutpage.SelectCountry("india");
		
		conformationclass conformationpage = checkoutpage.submitorder();
		
		String confirmmsg = conformationpage.getconformationmsg();
		AssertJUnit.assertTrue(confirmmsg.equalsIgnoreCase("THANKYOU FOR THE ORDER."));
	//driver.close();

	}

}

