package testcase;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class WikiPediaDeropdown {
	
	public WebDriver driver;
	
	@BeforeTest()
	public void setUp() {
		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"\\src\\test\\resources\\drivers\\geckodriver.exe");
		driver=new FirefoxDriver();
		driver.get("https://www.wikipedia.org/");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	}

	@Test(priority=1)
	public void getDataFromAllDropdown() {
		
		WebElement lang = driver.findElement(By.xpath("//*[@id='searchLanguage']"));
		
		Select se=new Select(lang);
		se.selectByValue("hi");	
		
		List<WebElement> listboxes = lang.findElements(By.tagName("option"));
		
		for(int i=0; i<listboxes.size(); i++) {
			System.out.println(listboxes.get(i).getText());
		}
		
		System.out.println("*****/////////////=============///////////////////==============/////////////*****");
		System.out.println("Count total number of links");
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		
		System.out.println("Total number of likns in wikipedia website are :"+links.size());
		
		for(int i=0; i<links.size(); i++) {
			System.out.println(i+". "+links.get(i).getText()+"---->"+links.get(i).getAttribute("href"));
		}
		
		System.out.println("*****/////////////=============///////////////////==============/////////////*****");
		
		System.out.println("Count total number of links in specific area (i.e. footer)");
		
        List<WebElement> links2 = driver.findElements(By.xpath("//div[@class='footer']//a"));
        
        System.out.println("Total number of links in specific area are :"+links2.size());
		
		for(int i=0; i<links2.size(); i++) {
			System.out.println(i+". "+links2.get(i).getText()+"---->"+links2.get(i).getAttribute("href"));
		}

			}
	
	
	@AfterTest()
	public void teardown() throws InterruptedException {
		Thread.sleep(5000);
		driver.quit();
	}
	
}
