package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utitlities.PageUtility;
import utitlities.WaitUtility;

public class ManageContactPage {

	public WebDriver driver;

public ManageContactPage(WebDriver driver) {
	
	this.driver=driver;
	PageFactory.initElements(driver, this);
	
}

@FindBy(xpath="//a[@role='button']") WebElement actionbutton;
@FindBy(xpath="//input[@id='phone']") WebElement phonetext;
@FindBy(xpath="//input[@id='email']") WebElement emailtext;
@FindBy(xpath="//textarea[@name='address']") WebElement addresstext;
@FindBy(xpath="//textarea[@name='del_time']") WebElement deliverytime;
@FindBy(xpath="//input[@id='del_limit']") WebElement deliverycharge;
@FindBy(xpath="//button[@name='Update']") WebElement updatebutton;
@FindBy(xpath="//button[@data-dismiss='alert']") WebElement alertdisplay;

public ManageContactPage clearAll() {
	
	actionbutton.clear();
	emailtext.clear();
	phonetext.clear();
	addresstext.clear();
	deliverytime.clear();
	deliverycharge.clear();
	return this;
}


public void javaScriptExcecuter() {

	PageUtility pageUtility = new PageUtility();
	pageUtility.usingJavaScriptExcecuter(driver, "window.scrollBy(0,document.body.scrollHeight)", "");

}

public ManageContactPage clickActionButton() {
	
	actionbutton.click();
	return this;
}

public ManageContactPage enterPhoneNumber(String phone_number) {
	
	phonetext.sendKeys(phone_number);
	return this;

}

public ManageContactPage enterEmai(String email) {
	
	emailtext.sendKeys(email);
	return this;
}

public ManageContactPage enterAddress(String address) {
	
	addresstext.sendKeys(address);
	return this;
}

public ManageContactPage enterDeliveryTime(String delivery_time) {
	
	deliverytime.sendKeys(delivery_time);
	return this;
}

public ManageContactPage enterDeliveryCharge(String delivery_charge) {
	
	deliverycharge.sendKeys(delivery_charge);
	return this;
}

public ManageContactPage clickUpdateButton() {
	
	javaScriptExcecuter();
	WaitUtility wait_utility = new WaitUtility();
	wait_utility.waitForVisibilityOfElementLocated(driver, updatebutton);
	updatebutton.click();
	return this;
	
}

public boolean isAlertDisplayed() {
	
	return alertdisplay.isDisplayed();
}

public boolean isUpdateButtonDisplayed() {
	
	return updatebutton.isDisplayed();
}

}
