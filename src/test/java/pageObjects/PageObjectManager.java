package pageObjects;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import utils.utility;

public class PageObjectManager extends utility {
	WebDriver driver;
	 public PageObjectManager() {
		 try {
			this.driver=launchDriver();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	 }
	 
	 public LandingPage getLandingPage() {
		 return new LandingPage(driver);
	 }
	 
	 public CheckOutPage getCheckOutPage() {
		 return new CheckOutPage(driver);
	 }
	 
	 public PlaceOrderPage getPlaceOrderPage() {
		 return new PlaceOrderPage(driver);
	 }

}
