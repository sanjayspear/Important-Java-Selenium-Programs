package testcase;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ScreenCapture {
	
	public static WebDriver driver;
	public static String path;
   
	@BeforeTest
	public void setup() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\src\\test\\resources\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	@Test
	public void rediffLogin() throws IOException {
		ScreenCapture.takeScreenShot();
		driver.findElement(By.xpath("//*[@id='login1']")).sendKeys("sanjayspear@rediffmail.com");
		driver.findElement(By.xpath("//*[@id='password']")).sendKeys("Sanjay92#@!");
		driver.findElement(By.xpath("//input[@value='Go']")).click();
		ScreenCapture.takeScreenShot();
	}
	
	public static void takeScreenShot() throws IOException {
		
		path = System.getProperty("user.dir")+"\\src\\test\\resources\\screenshots\\"+ScreenCapture.getCurrentTimeStamp()
		.replace("-", "_").replace(":", "_")+".png"; 
		File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile, new File(path));
	}
	
	public static String getCurrentTimeStamp() {
		
		SimpleDateFormat sdfDate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ssZ");
		Date now = new Date();
		String date = sdfDate.format(now);
		return date;
	}
	
	@AfterTest
	public void teardown() throws InterruptedException {
		Thread.sleep(4000);
		driver.quit();
	}
	
}
