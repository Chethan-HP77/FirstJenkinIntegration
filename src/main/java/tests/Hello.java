package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.Assert;

public class Hello {
	private WebDriver driver; 
	String appURL = "https://www.gmail.com/";

	@BeforeClass
	public void testSetUp() {
		 System.setProperty("webdriver.gecko.driver", "C:\\Program Files\\geckodriver.exe");
		driver = new FirefoxDriver();
	}
	
	@Test
	public void verifyGooglePageTittle() {
		driver.navigate().to(appURL);
		String getTitle = driver.getTitle();
		Assert.assertEquals(getTitle, "Gmail");
	}
	
	@AfterClass
	public void tearDown() {
			driver.close();	
	}
}
