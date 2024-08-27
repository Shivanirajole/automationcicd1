package DsAlgoproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class dsalgologinpage {
	
	WebDriver ldriver;
	
	public dsalgologinpage(WebDriver d) {
		
		ldriver= d;
		PageFactory.initElements(d, this);
	}
	
	@FindBy(xpath ="//a[text()='Sign in']") WebElement sign;
	@FindBy(xpath ="//input[@name='username']") WebElement txt_username;
	@FindBy(xpath="//input[@name='password']") WebElement txt_password;
	@FindBy(xpath ="//input[@value='Login']") WebElement login;
	@FindBy(xpath ="//*[text()='Array']/..//*[text()='Get Started']") WebElement getstarted;
	@FindBy(xpath="//a[text()='Arrays in Python']") WebElement python;
	@FindBy(xpath="//a[text()='Arrays Using List']") WebElement list;
	@FindBy(xpath="//a[text()='Basic Operations in Lists']") WebElement lists;
	@FindBy(xpath="//a[text()='Applications of Array']") WebElement arry;
	@FindBy(xpath="//a[@class='list-group-item list-group-item-light text-info']") WebElement questions;
	@FindBy(xpath="//a[text()='Sign out']") WebElement out;
	@FindBy(xpath="//a[text()='Sign in']") WebElement in;
 	
	
	
	public void enterusername(String usrname) {
		sign.click();
		txt_username.sendKeys(usrname);
	}
	
	public void enterpassword(String password) {
		txt_password.sendKeys(password);
	}
	
	public void clickonlogin() {
		login.click();
	}
	
	public void started() {
		getstarted.click();
	}
	
	public void topiccovered() {
		python.click();
		list.click();
		lists.click();
		arry.click();
		questions.click();
	  	
	}
	public void signout() {
		out.click();
	}
	
	public void signin() {
		in.click();
	}
}
