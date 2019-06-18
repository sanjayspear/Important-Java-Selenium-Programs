package testcase;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.data.utility.TestUtility;

public class DataProviderHalfEbayTest 
{
public WebDriver driver;
	
	@BeforeMethod
	public void setup() 
	{
		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + "\\src\\test\\resources\\drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://reg.ebay.com/reg/PartialReg?ru=https%3A%2F%2Fwww.ebay.com%2Fglobaldeals");
		
	}
	
	@DataProvider
	public Iterator<Object[]> getTestData()
	{
		ArrayList<Object[]> testData = TestUtility.getDataFromExcel();
		return testData.iterator();
	}
	
	@Test(dataProvider="getTestData")
	public void halfEbauRegPageTest(String firstname,String lastname, String email, String password) throws InterruptedException
	{
		   driver.findElement(By.xpath("//input[@name='firstname']")).clear();
		   driver.findElement(By.cssSelector("input[name='firstname']")).sendKeys("");
		   
		   driver.findElement(By.xpath("//input[@name='lastname']")).clear();
		   driver.findElement(By.cssSelector("input[name='lastname']")).sendKeys("");
		   
		   driver.findElement(By.xpath("//input[@name='email']")).clear();
		   driver.findElement(By.cssSelector("input[name='email']")).sendKeys("");
		   
		   driver.findElement(By.xpath("//input[@name='PASSWORD']")).clear();
		   driver.findElement(By.cssSelector("input[name='PASSWORD']")).sendKeys("");	
	}
	
	@AfterMethod
	public void teardown() throws InterruptedException 
	{
		driver.close();
	}
}
