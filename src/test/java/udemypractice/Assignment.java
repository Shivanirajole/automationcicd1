package udemypractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");

		Thread.sleep(2000);

		driver.findElement(By.name("name")).sendKeys("shivani");
		driver.findElement(By.name("email")).sendKeys("shivrajole26@gmail.com");
		driver.findElement(By.id("exampleInputPassword1")).sendKeys("12345");
		driver.findElement(By.id("exampleCheck1")).click();
		WebElement dropdown = driver.findElement(By.id("exampleFormControlSelect1"));
		Select gender = new Select(dropdown);
		gender.selectByIndex(1);
		driver.findElement(By.id("inlineRadio1")).click();
		driver.findElement(By.name("bday")).sendKeys("26/09/1997");
		driver.findElement(By.xpath("//input[@value='Submit']")).click();

		System.out.println(
				driver.findElement(By.xpath("//div[@class='alert alert-success alert-dismissible']")).getText());
		driver.quit();

	}

}
