package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class PlaceOrderPage {
	WebDriver driver;
	By placeOrderBtn =By.xpath("//button[contains(text(),'Proceed')]");
	By SelectElement=By.tagName("select");
	By termsAndCondition=By.cssSelector("input[type='checkbox']");
	
	public PlaceOrderPage(WebDriver driver) {
		this.driver=driver;
	}

	public void selectCountry(String countryName) {
		WebElement selectLocator=driver.findElement(SelectElement);
		Select se= new Select(selectLocator);
		se.selectByValue(countryName);
	}
	
	public void clickOnTermsAndContions() {
		driver.findElement(termsAndCondition).click();
	}
	
	public void placeOrder() {
		 driver.findElement(placeOrderBtn).click();
		 
	}

}
