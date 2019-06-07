package testcase;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenHDFC {

	public static WebDriver driver;
	public static String url;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		url = "http://www.hdfcbank.com";
		try {
			// 1.Automate Driver
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"\\src\\test\\resources\\drivers\\geckodriver.exe");

			// 2.Open Firefox
			driver = new FirefoxDriver();
			// 3.Open URL
			driver.get(url);
			Thread.sleep(5000);
			Set<String> myWindow = driver.getWindowHandles();
			java.util.Iterator<String> winid = myWindow.iterator();
			//4.Open Link
			driver.findElement(By.xpath("/html/body/div[1]/div[4]/div/div[1]/div[2]/ul/li[1]/a")).click();
			Thread.sleep(5000);
			myWindow = driver.getWindowHandles();
			winid = myWindow.iterator();
			String firstwinid1 = winid.next();
			String secondwinid1 = winid.next();
			driver.switchTo().window(secondwinid1);
			driver.findElement(By.xpath("/html/body/div[2]/section[2]/div/div[1]/div[1]/div[2]/div/div[3]/a")).click();
			Thread.sleep(4000);
			myWindow = driver.getWindowHandles();
			winid = myWindow.iterator();
			String firstwinid = winid.next();
			String secondwinid = winid.next();
			String thirdwinid = winid.next();
			System.out.println("First window id is" + firstwinid);
			System.out.println("Second window id is" + secondwinid);
			System.out.println("Third window id id" + thirdwinid);
			driver.switchTo().window(thirdwinid);
			driver.close();
			driver.switchTo().window(secondwinid);
			driver.close();
			Thread.sleep(5000);
			driver.switchTo().window(firstwinid);
			driver.quit();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
}
