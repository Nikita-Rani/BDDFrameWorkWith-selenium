package stepDefinitions;

import org.testng.annotations.AfterTest;

import io.cucumber.java.After;
import utils.utility;

public class Hooks extends utility {
	
	@After
	public void teardown() {
		driver.close();
	}
	

}
