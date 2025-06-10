package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

;

public class ManageNewsPage{

	public WebDriver driver;
	
	public ManageNewsPage(WebDriver driver) {
		
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath ="//a[@class='btn btn-rounded btn-danger']") WebElement clicknewbutton;
	@FindBy(xpath ="//textarea[@id='news']") WebElement addnewstextareagield;
	@FindBy(xpath ="//button[@type='submit']") WebElement clicksavebutton;
	@FindBy(xpath ="//button[@data-dismiss='alert']") WebElement alert;
	
	public ManageNewsPage clickNewButton() {
		
		clicknewbutton.click();
		return this;
	}
	
	public ManageNewsPage enterNews(String news) {
		
		addnewstextareagield.sendKeys(news);
		return this;
	}
	
	public ManageNewsPage clickSaveButton() {
		
		clicksavebutton.click();
		return this;
	}
	
	public boolean isAlertDisplayed() {
		
		return alert.isDisplayed();
	}

}