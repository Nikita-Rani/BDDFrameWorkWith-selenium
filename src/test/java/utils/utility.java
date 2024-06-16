package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class utility {
	public static WebDriver driver;
	
	public WebDriver launchDriver() throws IOException {
		if(driver==null) {
			Properties prop=new Properties();
			FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+"//src//test//java//resources//data.properties");
			prop.load(fis);
			if(prop.getProperty("browser").equalsIgnoreCase("Chrome")) {
				driver=new ChromeDriver();
				driver.get(prop.getProperty("url"));
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			}
			
		}
		return driver;	
	}
	

}
