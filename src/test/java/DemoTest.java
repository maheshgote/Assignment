
import static org.testng.Assert.assertEquals;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
//import org.testng.asserts.*;


import io.github.bonigarcia.wdm.WebDriverManager;
	
public class DemoTest {
	
	
	@Test 
	public void sum() throws InterruptedException {
		System.out.println("first test");
//		Assert.assertEquals("m", "m");
//		WebDriverManager.chromedriver().setup();
//		WebDriverManager.firefoxdriver().setup();
		
		
//		WebDriverManager.edgedriver().setup();
//		WebDriver driver = new EdgeDriver();
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.lambdatest.com/software-testing-questions/what-is-the-difference-between-driverclose-and-driverquit-commands");
		driver.close();
//		driver.quit();
//		driver.close();
		driver.quit();
		driver.getTitle();
		System.out.println("Mahesh Gote");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebElement button = driver.findElement(By.className("dd"));
		WebElement button2 = driver.findElement(By.xpath("//tag[@id='tete']"));
//		button.getScreenshotAs(null);
//		button.getCssValue("border");
		
		Assert.assertTrue(true, "after failed message");
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(6))
				.pollingEvery(Duration.ofSeconds(2))
				.ignoring(NoSuchElementException.class);
		wait.until(ExpectedConditions.elementToBeClickable(By.id("myElement")));
		
		Thread.sleep(5);
		
//		WebDriverWait wait = new WebDriverWait(driver, 20);
//		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.id("myElement")));
//		
	
		WebElement elemnt = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//tag[@id='tete']")));
		Set<String>handles =driver.getWindowHandles();
		driver.switchTo().window("dddD");
		driver.navigate();
		Alert alert = driver.switchTo().alert();
		alert.dismiss();
		alert.getText();
		alert.accept();
		WebElement selectbox = driver.findElement(By.xpath("//tag[@id='select']"));
		Select select = new Select(selectbox);
		List<WebElement> alloptions = select.getOptions();
		for(WebElement op : alloptions) {
			op.getText();
			
		}
		
		
	}
	
	@BeforeTest
	public void setup() {
		System.out.println("Before Test");
	}
	
	@AfterTest
	public void sutiecleanup() {
		System.out.println("After Test");
	}
	
	@AfterSuite(alwaysRun=true)
	public void estsuitecleanup() {
		System.out.println("After test suite");
	}
	
	@AfterSuite
	public void classsetup2() {
		System.out.println("Afater suite");
	}
	
	@BeforeClass
	public void classsetup() {
		System.out.println("Before Class");
	}
	
	@AfterClass
	public void teardownclass() {
		System.out.println("After Class");
	}
	
	@BeforeMethod
	public void testsetkup() {
		System.out.println("Before Method");
	}
	
	@AfterMethod
	public void testcleanup() {
		System.out.println("After Method");
	}
	
	
	@BeforeSuite
	public void suiteSetup() {
		System.out.println("Before test suite");
	}
	

}
