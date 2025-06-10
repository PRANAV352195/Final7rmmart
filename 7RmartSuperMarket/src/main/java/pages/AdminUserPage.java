package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utitlities.PageUtility;

public class AdminUserPage{



public WebDriver driver;
	
	public AdminUserPage(WebDriver driver) {
		
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}	
	@FindBy(xpath="//a[@onclick='click_button(1)']") WebElement newbutn;
	@FindBy(xpath="//input[@id='username']") WebElement userNametext;
	@FindBy(xpath="//input[@id='password']") WebElement passwordtext;
	@FindBy(xpath="//select[contains(@class,'form-control') and contains(@id,'user_type')]") WebElement selectusertype;
	@FindBy(xpath="//button[@name='Create']") WebElement savebutton;
	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']") WebElement alertbox;
	
	PageUtility pageutility=new PageUtility();

	public AdminUserPage clickNewButton() {
		
		newbutn.click();
		return this;
	}
	
	public AdminUserPage enterUserName(String username) {
		
		newbutn.sendKeys(username);
		return this;
	}
	
	public AdminUserPage enterPassword(String password) {
		
		 passwordtext.sendKeys(password);
		return this;
	}
	
	public AdminUserPage selectUserTypeDropDwon(String value) {
		
		pageutility.selectDropdownByValue(userNametext, value);
		return this;
		
	}
	
	public AdminUserPage clickSaveButton() {
		
		
		savebutton.click();
		return this;
	}
	
	public boolean isAlertDisplayed() {
		
		return alertbox.isDisplayed();
		
	}

}











