package testcase;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Calendar {
	
	public WebDriver driver;
	
	@BeforeMethod
	public void setup() {
		System.setProperty("webdriver.chrome.driver", 
				System.getProperty("user.dir")+"\\src\\test\\resources\\drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.path2usa.com/travel-companions");
		
	}
	
	@Test
	public void clanedarDatePicker() throws InterruptedException{
		    driver.findElement(By.xpath("//input[@name='travel_date']")).click();
		    
		    String month = driver.findElement(By.cssSelector("[class='datepicker-days'] [class='datepicker-switch']")).getText();
		    
		    System.out.println(month);
		    
		    while(!(month.contains("August"))) {
		    	driver.findElement(By.cssSelector("[class='datepicker-days'] [class='next']")).click();
		    	Thread.sleep(2000);
		    }
		    //Grab common attribute and put into list then iterate
			List<WebElement> date = driver.findElements(By.className("day"));
			
			int count=driver.findElements(By.className("day")).size();
			
			for(int i=0; i<count; i++) {
				String text=date.get(i).getText();
				
				
				if(text.equalsIgnoreCase("23")) {
					date.get(i).click();
					break;
				}
			}
	}
	
	@AfterMethod
	public void teardown() throws InterruptedException {
		Thread.sleep(3000);
		driver.close();
	}

}
