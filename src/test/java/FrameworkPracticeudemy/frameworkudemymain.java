package FrameworkPracticeudemy;


	import java.time.Duration;
	import java.util.List;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.interactions.Actions;
	import org.openqa.selenium.support.ui.ExpectedCondition;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.WebDriverWait;
	import org.testng.Assert;

	public class frameworkudemymain {
		
		public static void main(String[] args) {
			String productname="ZARA COAT 3";
			WebDriver driver= new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("https://rahulshettyacademy.com/client");
			driver.findElement(By.id("userEmail")).sendKeys("shivanirajole@gmail.com");
			driver.findElement(By.id("userPassword")).sendKeys("Shivani@123");
			driver.findElement(By.id("login")).click();
			
			 WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(5));
			  wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#toast-container")));
			List <WebElement> products=driver.findElements(By.cssSelector(".mb-3"));
		    WebElement prod=products.stream().filter(product ->product.findElement(By.cssSelector("b")).getText().equals("ZARA COAT 3")).findFirst().orElse(null);
		    prod.findElement(By.cssSelector(".card-body button:last-of-type")).click();
		    
		  
		    wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#toast-container")));
		    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("ng-animating")));
		    driver.findElement(By.cssSelector("[routerlink*='cart']")).click();
		    
		   List <WebElement> cartproducts= driver.findElements(By.cssSelector(".cartSection h3"));
		   Boolean match=cartproducts.stream().anyMatch(cartproduct-> cartproduct.getText().equalsIgnoreCase(productname));
		   Assert.assertTrue(match);
		   driver.findElement(By.cssSelector(".totalRow button")).click();
		   
		   Actions a=new Actions(driver);
		   a.sendKeys(driver.findElement(By.cssSelector("[placeholder='Select Country']")), "india").build().perform();
		   wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".ta-results")));
		   driver.findElement(By.xpath("//button[contains (@class,'ta-item')][2]")).click();
		   driver.findElement(By.cssSelector(".action__submit")).click();
		   
		  String confirmmsg= driver.findElement(By.cssSelector(".hero-primary")).getText();
		  Assert.assertTrue(confirmmsg.equalsIgnoreCase("THANKYOU FOR THE ORDER."));
	driver.close();
		  
		   
		   
			
				}

	}



