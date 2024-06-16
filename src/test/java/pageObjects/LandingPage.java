package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LandingPage {
	WebDriver driver;
	
	private By searchbtn=By.cssSelector("input[type='Search']");
	private By incrementBtn=By.cssSelector(".increment");
	private By addToCartBtn=By.cssSelector("div.product-action button[type='button']");
	private By checkOutImage=By.cssSelector("img[alt='Cart']");
	private By proceedToCheckoutBtn=By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]");
	
	public LandingPage(WebDriver driver) {
		this.driver=driver;
	}
	public void searchProduct(String productName) {
		driver.findElement(searchbtn).sendKeys(productName);
	}
	public void increaseQuantityOfProduct(int count) {
		for(int i=1;i<count;i++) {
			driver.findElement(incrementBtn).click();
		}
	}
	public void addProductToCart() {
		driver.findElement(addToCartBtn).click();
	}
	public void goToCheckOutPage() {
		driver.findElement(checkOutImage).click();
		driver.findElement(proceedToCheckoutBtn).click();
	}

}
