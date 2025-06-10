package utitlities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class PageUtility {
 public WebDriver driver;

	
	

	public void selectDropdownWithIndex(WebElement element, int indexNumber) {
		Select select = new Select(element);
		select.selectByIndex(indexNumber);
	}

	public void selectDropdownWithVisibleText(WebElement element, String visibleText) {
		Select select = new Select(element);
	}

	public void selectDropdownByValue(WebElement element, String value) {
		Select select = new Select(element);
		select.selectByValue(value);
	}

	public void verifyCheckBox(WebElement element) {
		element.click();
	}

	public void verifyRadioButton(WebElement element) {
		element.click();
	}

	public void verifyRightClick(WebElement element) {
		Actions action = new Actions(driver);
		action.contextClick(element).build().perform();
	}

	public void verifyMouseHover(WebElement element) {
		Actions action = new Actions(driver);
		action.moveToElement(element).build().perform();
	}
	

	public void usingJavaScriptExcecuter(WebDriver driver2, String string, String string2) {
		// TODO Auto-generated method stub
		
	}
	

	
	}

