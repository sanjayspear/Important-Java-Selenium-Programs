package testcase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Linkedintest extends TestBase{

@Test
public void searchTest() throws InterruptedException {
   
	switch (prop.getProperty("browsername")) {
		
		case "firefox":
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"\\src\\test\\resources\\drivers\\geckodriver.exe");
			driver=new FirefoxDriver();
			driver.get(prop.getProperty("urlLinkedin"));
			//Thread.sleep(4000); //explicit wait or fixed wait
			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			break;
			
        case "chrome":
        	System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\src\\test\\resources\\drivers\\chromedriver.exe");
        	driver=new ChromeDriver();
        	driver.get(prop.getProperty("urlLinkedin"));
        	//Thread.sleep(4000); //explicit wait or fixed wait
        	driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGELOADTIMEOUT, TimeUnit.SECONDS);
    		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICITWAITTIME, TimeUnit.SECONDS);
			break;

		default:
			System.out.println("Browser not supported");
			break;
		}
	}
	
}
