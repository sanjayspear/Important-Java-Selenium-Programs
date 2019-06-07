package testcase;

import java.util.List;
import java.util.concurrent.TimeUnit;import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MultipleCheckBoxes {
	public WebDriver driver;
	
	@BeforeTest
	public void setUp() {
		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"\\src\\test\\resources\\drivers\\geckodriver.exe");
		driver=new FirefoxDriver();
		driver.get("http://www.tizag.com/htmlT/htmlcheckboxes.php");
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	}

	@Test
	public void multiCheckBox() throws InterruptedException	{
		List<WebElement> cb = driver.findElements(By.name("sports"));
		
		for(int i=0; i<cb.size(); i++) {
			System.out.println(cb.get(i).getAttribute("checked"));
			//Option-1 using array list logic
			cb.get(i).click();
			
			//Option-2 using xpath
			//driver.findElement(By.xpath("//div[4]/input["+i+"]"));
		}
		Thread.sleep(1000);
	}
	
	@AfterTest
	public void tearDown() {
		driver.quit();
	}
	
}
