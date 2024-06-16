package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.CheckOutPage;
import pageObjects.PageObjectManager;

public class CheckOutPageStepDefinitions{
	WebDriver driver;
	PageObjectManager managePage=new PageObjectManager();
	CheckOutPage checkoutPage=managePage.getCheckOutPage();
	
	@Then("placeOrder button is enabled")
	public void place_order_button_is_enabled() {
		checkoutPage.checkIfPlaceOrderBtnIsDisplayed();
	   
	}
	@Then("User click on placeOrder Button")
	public void user_click_on_place_order_button() {
		checkoutPage.clickOnPlaceOrderBtn();
	}

}
