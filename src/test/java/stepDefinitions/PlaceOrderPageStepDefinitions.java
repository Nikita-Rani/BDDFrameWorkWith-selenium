package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Then;
import pageObjects.PageObjectManager;
import pageObjects.PlaceOrderPage;

public class PlaceOrderPageStepDefinitions {
	WebDriver driver;
	PageObjectManager managerPage=new PageObjectManager();
	PlaceOrderPage placeOrderPage=managerPage.getPlaceOrderPage();
	
	@Then("User Select Country {string}")
	public void user_select_country(String countryName) {
		placeOrderPage.selectCountry(countryName);
		
	}
	@Then("User Click on Agree Terms and Conditions")
	public void user_click_on_agree_terms_and_conditions() {
	    placeOrderPage.clickOnTermsAndContions();
	}
	@Then("User place the order")
	public void user_place_the_order() {
	   placeOrderPage.placeOrder();
	}

}
