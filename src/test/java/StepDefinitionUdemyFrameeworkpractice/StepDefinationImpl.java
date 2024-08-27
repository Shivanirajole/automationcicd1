package StepDefinitionUdemyFrameeworkpractice;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.Assert;

import FrameworkPracticeudemy.CartPage;
import FrameworkPracticeudemy.CheckoutPage;
import FrameworkPracticeudemy.Landingpage;
import FrameworkPracticeudemy.Productcatlog;
import FrameworkPracticeudemy.conformationclass;
import TestComponentsUdemyframeworkpractice.BaseTest;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinationImpl extends BaseTest {
	
	public Landingpage landingpage;
	public Productcatlog productcatlog;
	public conformationclass conformationpage;
	
	@Given ("I landed on Ecommerce page")
	public void I_landed_on_Ecommerce_page() throws IOException {
		
		landingpage=launchapplication();
	}
	
	@Given ("^logged in with the username (.+) and password (.+)$")
	
	public void logged_in_with_the_username_and_password (String username,String password)
		
	{
		 productcatlog = landingpage.loginapplication(username,password);
		
	}
	 @When ("^I add product (.+) from cart$")
	 public void I_add_product_from_cart(String productnme)
	 {
		 List<WebElement> products = productcatlog.getproductlist();
			productcatlog.addtocart(productnme); 
	 }
	
	 @	And("^checkout (.+) and submit the order$")
       public void  checkout_and_submit_the_order(String productname) {
		 
		     CartPage cartpage = productcatlog.GotocartPage();
	         Boolean match = cartpage.verifyproductdisplay(productname);
		  	 Assert.assertTrue(match);
			 CheckoutPage checkoutpage = cartpage.gotocheckout();
			 checkoutpage.SelectCountry("india");
		   conformationpage = checkoutpage.submitorder();
	 }
	 
	  @Then("{string} message is display on conformation page")
	  public void message_is_display_on_conformation_page(String string)
	  {
			String confirmmsg = conformationpage.getconformationmsg();
			Assert.assertTrue(confirmmsg.equalsIgnoreCase(string));
			driver.close();
	  }
	  
	  @Then( "^\"([^\"]*)\" msg is displayed$")
	  public void something_msg_is_displayed(String strArg1) throws Throwable {
		    Assert.assertEquals(strArg1, landingpage.GetErrorMsg());
		  driver.close();
	  }
	  
}


