package pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
public WebDriver driver;
	
	public HomePage(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[contains(@class,'small-box-footer') and contains(@href,'admin/list-admin')]") WebElement moreinfobutton;
	@FindBy(xpath="//a[contains(@href,'list-news' )and contains(@class,'nav-link')]") WebElement manageNewsOPtion;
	@FindBy(xpath="//a[contains(@class,'small-box-footer') and contains(@href,'admin/list-contact')]") WebElement mmanagecontactbutton;
	@FindBy(xpath = "//a[contains(@class,'small-box-footer') and contains(@href,'admin/list-category')]")
	WebElement managecategory_button;
	@FindBy(xpath="//a[contains(@class,'small-box-footer') and contains(@href,'admin/list-footertext')]") WebElement managefooterbutton;
	@FindBy(xpath="//a[@data-toggle='dropdown']") WebElement addadmin;
	@FindBy(xpath="//a[contains(@href,'admin/logout') and contains(@class,'dropdown-item')]") WebElement logoutbutton;
	@FindBy(xpath="//input[@name='username']") WebElement usernameField;

    public AdminUserPage clickAdminUserMoreInfo() {
		
    	moreinfobutton.click();
		return new AdminUserPage(driver);
	}
    
    public ManageNewsPage clickManageNewsOption() {
    	
    	 manageNewsOPtion.click();
    	return new ManageNewsPage(driver);
    	
    	}
    
    public ManageContactPage clcickManageContactMoreInfo() {
		
    	mmanagecontactbutton.click();
		return new ManageContactPage(driver);
	}
    
    public ManageCategoryPage clickManageCategoryMoreInfo() {

    	 managecategory_button.click();
		return new ManageCategoryPage(driver);
	}
    
    public ManageFooterPage clickManageFooterMoreInfo() {
		
    	managefooterbutton.click();
		return new ManageFooterPage(driver);
	}
	
	
	public HomePage clickAdminDropDwon() {
		
		addadmin.click();
		return this;
		
	}
	
	public LoginPage clickLogOutButton() {
		
		logoutbutton.click();
		return new LoginPage(driver);
	}
	
   public boolean isUserNameFieldDisplayed() {
		
		return usernameField.isDisplayed();
		
		
	}
	

}