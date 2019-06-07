package testcase;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ReadDataFromPropFile  {
	
	private static WebDriver driver;
	private static String browser, url;
	private static Properties pro;
	private static File path;
	private static FileInputStream fis;

	@BeforeTest
	public void browserSetUp() throws Exception {
        path=new File(System.getProperty("user.dir")+"\\src\\test\\resources\\config\\config.properties");
        fis=new FileInputStream(path);
        pro=new Properties();
        pro.load(fis);
        
        //Data is driving from properties file
		browser = pro.getProperty("browsername");
		url = pro.getProperty("urlLink");

		switch (browser) {
		case "chrome":
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "\\src\\test\\resources\\drivers\\chromedriver.exe");
			driver = new ChromeDriver();
			break;

		case "firefox":
			//data for FireFox path is flowing from properties file
			System.setProperty("webdriver.gecko.driver",
					System.getProperty("user.dir") + pro.getProperty("firefoxPath"));
			driver = new FirefoxDriver();
			
			break;

		default:
			System.out.println("Browser not supported");
			break;

		}

	}
	
	@Test
	public void loginToGmail() {
		driver.get(url);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//reading xpath from properties file
		driver.findElement(By.xpath(pro.getProperty("Gamillink"))).click();
		
	}
	
	

	@AfterTest
	public void teardown() throws InterruptedException {
		Thread.sleep(4000);
		driver.quit();
	}

}
