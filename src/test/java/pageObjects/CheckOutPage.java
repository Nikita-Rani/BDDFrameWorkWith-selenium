package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class CheckOutPage {
	WebDriver driver;
	
	By placeOrderBtn=By.xpath("//button[contains(text(),'Place Order')]");
	
	public CheckOutPage(WebDriver driver) {
		this.driver=driver;
	}

	public void checkIfPlaceOrderBtnIsDisplayed() {
		Boolean result=driver.findElement(placeOrderBtn).isDisplayed();
		Assert.assertTrue(result);
	}
	
	public void clickOnPlaceOrderBtn() {
		driver.findElement(placeOrderBtn).click();
	}

}
