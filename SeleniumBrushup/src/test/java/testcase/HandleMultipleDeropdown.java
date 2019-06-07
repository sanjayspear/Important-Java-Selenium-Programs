package testcase;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HandleMultipleDeropdown {
	
	public WebDriver driver;
	
	@BeforeTest()
	public void setUp() {
		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"\\src\\test\\resources\\drivers\\geckodriver.exe");
		driver=new FirefoxDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	}

	@Test(priority=1)
	public void getDataFromAllDropdown() {
		
		List<WebElement> listboxes = driver.findElements(By.tagName("option"));
		
		System.out.println("To featch values from all the dropdown");
		
		for(int i=0; i<listboxes.size(); i++) {
			System.out.println(listboxes.get(i).getText());
		}
		
		System.out.println("*****=================///=====================///=========================*****");
		
	}
	
	@Test(priority=2)
	public void getDataFromSpecificDropdown() {
		
		
		WebElement month = driver.findElement(By.xpath("//*[@id=\"month\"]"));
		
		List<WebElement> listboxes = month.findElements(By.tagName("option"));
		
		System.out.println("To featch values from only month dropdown");
		
		for(int i=0; i<listboxes.size(); i++) {
			System.out.println(i+". "+listboxes.get(i).getText());
		}
		
		
	}
	
	@AfterTest()
	public void teardown() {
		System.out.println("You can use this concept for any dropdown and it is not application specific.");
		driver.quit();
	}
	
}
