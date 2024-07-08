package ecommerce.ecommerce.test;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import ecommerce.saucedemo.base.TestBase;
import ecommerce.saucedemo.pages.HomePage;
import ecommerce.saucedemo.pages.LoginPage;
import org.testng.asserts.SoftAssert;
public class Logintest extends TestBase{
	LoginPage loginpage;
	HomePage homepage;
	SoftAssert softAssert;
	
	public Logintest() throws IOException {
		super();
		softAssert=new SoftAssert();
	}

	@BeforeMethod
	public void setup() throws IOException {
		initialize();
		loginpage = new LoginPage();
		
	}
	
	@Test
	public void validateLogin() throws IOException {
		homepage= loginpage.login("standard_user", "secret_sauce");
		boolean homepageDisplayed = homepage.checkHomepageDisplayed();
		assertEquals(homepageDisplayed, true);
	}
	
	
	@AfterMethod
	public void teardown() {
		driver.quit();
	}
	
	

}
