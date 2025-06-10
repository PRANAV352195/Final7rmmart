package testScript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import constant.Constants;
import pages.AdminUserPage;
import pages.HomePage;
import pages.LoginPage;
import utitlities.ExcelUtility;
import utitlities.FakerUtility;

public class AdminUserTest extends Base {

	
	
	public AdminUserPage adminuserpage;
	public HomePage homepage;
	
	@Test(retryAnalyzer=retry.RetryClass.class ,description = "Verifying the user is able to add adminuser")
	
	public void verifyTheUserIsAbleToAddAdminUser() throws IOException {
			
		
		String user_name=ExcelUtility.getStringData(1, 0, "loginpage");
		String password=ExcelUtility.getStringData(1,1, "loginpage");
		LoginPage login_page=new LoginPage(driver);
		login_page.enterUserName(user_name).enterPassword(password);
		homepage=login_page.clickTheSignInButton();	
		FakerUtility faker_utility=new FakerUtility();
		String username_AdminUserTest=faker_utility.creatARandomFirstName();
		String password_AdminUserTest=faker_utility.creatARandomLastName();
//		String username_AdminUserTest=ExcelUtility.getStringData(0, 1, "adminuser");
//		String password_AdminUserTest=ExcelUtility.getIntegerData(1, 1, "adminuser");	
		String userType=ExcelUtility.getStringData(2, 1, "adminuser");
		adminuserpage=homepage.clickAdminUserMoreInfo();
		adminuserpage.clickNewButton().enterUserName(username_AdminUserTest).enterPassword(password_AdminUserTest).selectUserTypeDropDwon(userType).clickSaveButton();
		Boolean isAlertDisplayed=adminuserpage.isAlertDisplayed();
		Assert.assertTrue(isAlertDisplayed,Constants.ADDADMINUSER);
		
	}
}


