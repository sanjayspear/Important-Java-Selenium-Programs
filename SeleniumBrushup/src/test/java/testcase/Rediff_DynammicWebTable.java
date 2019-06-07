package testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Rediff_DynammicWebTable {
	public WebDriver driver;
	public String actualCompany, expectedCompany, actualShare;
   
	@Test
	public void dynamicWebTable() {
		expectedCompany="Advani Hotels";
		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"\\src\\test\\resources\\drivers\\geckodriver.exe");
		driver=new FirefoxDriver();
		driver.get("https://money.rediff.com/gainers");
		int size=driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr")).size();
		System.out.println(size);
		
		for(int i=1; i<=size;i++) {
			actualCompany=driver.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr["+i+"]/td[1]/a")).getText();
			actualShare=driver.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr["+i+"]/td[4]")).getText();
			//System.out.println(i+". "+actualCompany);
			if(actualCompany.equalsIgnoreCase(expectedCompany)) {
				System.out.println(actualCompany+"---->"+actualShare);
			}
		}
		
	}
	
}
