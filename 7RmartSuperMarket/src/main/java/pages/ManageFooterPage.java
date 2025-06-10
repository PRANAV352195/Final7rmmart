package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManageFooterPage {

	public WebDriver driver;

	public ManageFooterPage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);

	}
	
	
	@FindBy(xpath="//a[contains(@role,'button') and contains(@href,'Footertext/edit?edit=1')]") WebElement action_btn;
	//@FindBy(xpath="//tr[td[1]]//a[contains(@href,'Footertext/edit?edit=1')]  ") WebElement action_btn;
	@FindBy(xpath="//textarea[@id='content']") WebElement addresstext;
	@FindBy(xpath="//input[@id='email']") WebElement emailtext;
	@FindBy(xpath="//input[@id='phone']") WebElement phonetext;
	@FindBy(xpath="//button[@name='Update']") WebElement updatebutton;
	@FindBy(xpath="//button[@data-dismiss='alert']") WebElement alertbox;
	
	public ManageFooterPage clearAll() {
		
		addresstext.clear();
		emailtext.clear();
		phonetext.clear();
		return this;
	}
	
	public ManageFooterPage clickActionButton() {
		
		action_btn.click();
		return this;
		
	}
	
	public ManageFooterPage enterAddress(String address) {
		
		addresstext.sendKeys(address);
		return this;
	}
	
	public ManageFooterPage enterEmail(String email) {
		
		emailtext.sendKeys(email);
		return this;
	}
	
	public ManageFooterPage enterPhoneNumber(String phone_number) {
		
		phonetext.sendKeys(phone_number);
		return this;
	}
	
	public ManageFooterPage clickUpdateButton() {
		
		updatebutton.click();
		return this;
	}
	
	public boolean isAlertDisplayed() {
		
		return alertbox.isDisplayed();
	}
	
	public boolean isUpdateButtonDisplayed() {
		
		return updatebutton.isDisplayed();
	}

}
