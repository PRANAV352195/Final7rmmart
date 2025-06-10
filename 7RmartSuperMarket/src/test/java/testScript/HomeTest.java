package testScript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import constant.Constants;
import pages.HomePage;
import pages.LoginPage;
import utitlities.ExcelUtility;

public class HomeTest extends Base {

	
	HomePage homepage;
	LoginPage loginpage;

	
	@Test(description="Verifying the user is able to logout")
		
	public void verifyTheUserIsAbleTologOut() throws IOException{
	
	String user_name=ExcelUtility.getStringData(1, 0, "loginpage");
	String password=ExcelUtility.getStringData(1,1, "loginpage");
	loginpage=new LoginPage(driver);
	loginpage.enterUserName(user_name).enterPassword(password);
	homepage=loginpage.clickTheSignInButton();	
	homepage.clickAdminDropDwon();
	loginpage=homepage.clickLogOutButton();
	Boolean isUserNameFieldDisplayed=homepage.isUserNameFieldDisplayed();
	Assert.assertTrue(isUserNameFieldDisplayed,Constants.LOGOUT);
	
	
	}

}
