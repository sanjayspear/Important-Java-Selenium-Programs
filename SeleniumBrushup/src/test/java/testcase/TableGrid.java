package testcase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableGrid {

	public static void main(String[] args) {
      
		System.setProperty("webdriver.chrome.driver", 
				System.getProperty("user.dir")+"\\src\\test\\resources\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.cricbuzz.com/live-cricket-scorecard/20242/eng-vs-pak-match-6-icc-cricket-world-cup-2019");
		
		WebElement table = driver.findElement(By.cssSelector("#innings_1 [class='cb-col cb-col-100 cb-ltst-wgt-hdr']:nth-child(1)"));
		int count=table.findElements(By.cssSelector("#innings_1 div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).size();
		int sum=0, total_score=0;
		for(int i=0; i<count-2; i++) {
			String value=table.findElements(By.cssSelector("#innings_1 div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).get(i).getText();
			int x=Integer.parseInt(value);
			sum=sum+x;	
		}
		
		String y=driver.findElement(By.cssSelector("#innings_1 [class='cb-col cb-col-100 cb-ltst-wgt-hdr'] [class='cb-col cb-col-8 text-bold cb-text-black text-right']")).getText();
		int extras=Integer.parseInt(y);
		total_score=sum+extras;
		
		String ev= driver.findElement(By.cssSelector("#innings_1 [class='cb-col cb-col-8 text-bold text-black text-right']")).getText();
        int expected=Integer.parseInt(ev);
		
		System.out.println("Total score including extras is "+total_score);
		
		if(total_score==expected) {
			System.out.println("Expected and Actual score is printing correctly");
	    }

  }
}