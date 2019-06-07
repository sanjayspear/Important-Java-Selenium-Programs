package trailAndError;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginToGmail extends ExcelReader {
	
	public WebDriver driver;
	
	@BeforeMethod
	public void setUp() throws Exception{
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\src\\test\\resources\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(ExcelReader.getValue("baseUrl"));
	}

	@Test
	public void loginToGmail() throws Exception {
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys(ExcelReader.getValue("username"));
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys(ExcelReader.getValue("password"));
		//driver.findElement(By.xpath("//input[@type='submit']")).click();
	}
	
	@AfterMethod
	public void tearDown() throws Exception {
		Thread.sleep(2000);
		driver.quit();
	}
	
}
