package testcase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
//shortcut for align code CTRL+SHIFT+F 
//shortcut for search class name CTRL+SHIFT+R
public class CrossBrowserTesting {
	public static WebDriver driver;
	public static String browsername, url;

	@Test
	public void crossBrowser() {

		browsername = "firefox";
		url = "https://www.google.com";

		switch (browsername) {
		case "chrome":
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "\\src\\test\\resources\\drivers\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get(url);
			break;

		case "firefox":
			System.setProperty("webdriver.gecko.driver",
					System.getProperty("user.dir") + "\\src\\test\\resources\\drivers\\geckodriver.exe");
			driver = new FirefoxDriver();
			driver.get(url);
			driver.manage().window().maximize();
			break;

		default:
			System.out.println("Browser not supported");
			break;

		}

	}

	@AfterTest
	public void teardown() throws InterruptedException {
		Thread.sleep(4000);
		driver.quit();
	}

}
