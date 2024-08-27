package Rahulshettyacadamytest.testcomponents;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import FrameworkPracticeudemy.CartPage;
import FrameworkPracticeudemy.CheckoutPage;
import FrameworkPracticeudemy.OrderPage;
import FrameworkPracticeudemy.Productcatlog;
import FrameworkPracticeudemy.conformationclass;
import TestComponentsUdemyframeworkpractice.BaseTest;


public class Submitordertest  extends BaseTest{
	String productname = "ZARA COAT 3";
	
	@Test(dataProvider="getdata1",groups= {"purches"})
	public void submitorder1(HashMap<String,String> input ) throws IOException {
	
	
		
		Productcatlog productcatlog = landingpage.loginapplication(input.get("email"),input.get("password"));

		List<WebElement> products = productcatlog.getproductlist();
		productcatlog.addtocart(input.get("product"));
        CartPage cartpage = productcatlog.GotocartPage();
       
		Boolean match = cartpage.verifyproductdisplay(input.get("product"));
		Assert.assertTrue(match);
		CheckoutPage checkoutpage = cartpage.gotocheckout();
		checkoutpage.SelectCountry("india");
		
		conformationclass conformationpage = checkoutpage.submitorder();
		
		String confirmmsg = conformationpage.getconformationmsg();
		Assert.assertTrue(confirmmsg.equalsIgnoreCase("THANKYOU FOR THE ORDER."));
	

	}
	@Test(dependsOnMethods = {"submitorder1"})
	public void OrderHistoryPage() {
		

		Productcatlog productcatlog = landingpage.loginapplication("shivanirajole@gmail.com", "Shivani@123");
		OrderPage orderpage=productcatlog.GotoorderPage();
	    Assert.assertTrue(orderpage.verifyorderdisplay(productname));
		
	}
	
	
		
		
	
	
	@DataProvider
	public Object[][] getdata1() throws IOException {
//		HashMap <String,String> map=new HashMap<String,String>();
//		map.put("email", "shivanirajole@gmail.com");
//		map.put("password", "Shivani@123");
//		map.put("product", "ZARA COAT 3");
//		
//		HashMap <String,String> map1=new HashMap<String,String>();
//		map1.put("email", "shivanishinde@gmail.com");
//		map1.put("password", "Shivani@098");
//		map1.put("product", "ADIDAS ORIGINAL");
//		
		
		List<HashMap<String,String>> data=GetJsonDatatoMap(System.getProperty("user.dir")+"//src//test//java//FrameworkudemyData//PurchesOrder.json");
		
	  return new Object [][] {{data.get(0)},{data.get(1)}};
	}
		
}
		
		
