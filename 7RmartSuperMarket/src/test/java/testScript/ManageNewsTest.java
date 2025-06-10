package testScript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import constant.Constants;
import pages.HomePage;
import pages.LoginPage;
import pages.ManageNewsPage;
import utitlities.ExcelUtility;


public class ManageNewsTest extends Base{
	
	ManageNewsPage managenewspage;
	HomePage homepage;
	
	@Test(description="Verifying the user is able to add manage news")
	
	public void verifyTheUserIsAbleToAddMangeNews() throws IOException {
		
		String user_name=ExcelUtility.getStringData(1, 0, "loginpage");
		String password=ExcelUtility.getStringData(1, 1, "loginpage");
		String news=ExcelUtility.getStringData(1, 0, "ManageNews");
		LoginPage login_page=new LoginPage(driver);
		login_page.enterUserName(user_name).enterPassword(password);
		homepage=login_page.clickTheSignInButton();
	    managenewspage=homepage.clickManageNewsOption();
	    managenewspage.clickNewButton().enterNews(news).clickSaveButton();
		Boolean isAlertDisplayed= managenewspage.isAlertDisplayed();
		Assert.assertTrue(isAlertDisplayed,Constants.MANAGENEWSPAGE);
		
	}

	
}