package Rahulshettyacadamytest.testcomponents;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;



import FrameworkPracticeudemy.CartPage;
import FrameworkPracticeudemy.Landingpage;
import FrameworkPracticeudemy.Productcatlog;
import TestComponentsUdemyframeworkpractice.BaseTest;
import TestComponentsUdemyframeworkpractice.Retry;

public class ErrorValidationtest  extends BaseTest{

	@Test(groups= {"ErrorHandling"} ,retryAnalyzer = Retry.class)
	public void Loginerrorvalidation() throws IOException {
	
	    landingpage.loginapplication("shivanirajol@gmail.com", "Shivani@123");
         Assert.assertEquals("Incorrect email or password.", landingpage.GetErrorMsg());

	}
	@Test
	public void producterrorvalidation() throws IOException {
			String productname = "ZARA COAT 3";
		
			Productcatlog productcatlog = landingpage.loginapplication("shivanishinde@gmail.com", "Shivani@098");

			List<WebElement> products = productcatlog.getproductlist();
			productcatlog.addtocart(productname);
	        CartPage cartpage = productcatlog.GotocartPage();
	       
			Boolean match = cartpage.verifyproductdisplay("ZARA COAT 3");
			Assert.assertTrue(match);
			

		}

	}





