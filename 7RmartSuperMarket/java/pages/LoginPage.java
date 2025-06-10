package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {// pages class is known as repository class

	@FindBy(name="username")WebElement usernamefield;
	@FindBy(name="password")WebElement passwordfield;
	@FindBy(xpath="//button[@type='submit']")WebElement signin;
	@FindBy(xpath="//p[text()='Dashboard']")WebElement Dashboard;
	
	
	public  WebDriver driver;//Global Deceleration WebDriver {
	
	
	
	public LoginPage(WebDriver driver) {//Parameterized Constructor
		this.driver=driver;
		PageFactory.initElements(driver,this); // 
		
	}
	
	public void enterusername(String username) { // paramerized constructor converting{

usernamefield.sendKeys(username);

	}


public void enterpassword(String password)
{
	passwordfield.sendKeys(password);
}
public void signin()
{
	signin.click();                
}
public boolean isdashboarddisplayed()
{
	return Dashboard.isDisplayed();
}
}
