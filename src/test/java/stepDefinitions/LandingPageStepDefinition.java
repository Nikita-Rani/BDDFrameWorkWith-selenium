package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.LandingPage;
import pageObjects.PageObjectManager;

public class LandingPageStepDefinition {
	WebDriver driver;
	PageObjectManager managePage=new PageObjectManager();
	LandingPage landingPage=managePage.getLandingPage();
	
	@Given("User is on Landing Page")
	public void user_is_on_landing_page() {
		
	}

	
	@When("User search for {string} product")
	public void user_search_for_product(String productName) {
		landingPage.searchProduct(productName);
	    
	}
	@When("User Select {int} Quantity of product")
	public void user_select_quantity_of_product(int count) throws InterruptedException {
		landingPage.increaseQuantityOfProduct(count);    
	}
	@When("User add  product to cart")
	public void user_add_product_to_cart() throws InterruptedException {
		landingPage.addProductToCart();
	   
	}
	@When("User click on Checkout page")
	public void user_click_on_chcekout_page() {
		landingPage.goToCheckOutPage();
	    
	}
	
	
}
