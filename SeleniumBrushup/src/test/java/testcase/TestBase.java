package testcase;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;

public class TestBase {
	public WebDriver driver;
	public Properties prop;
	public File path;
	public FileInputStream fis;
   
	@BeforeTest
	public void initalization() throws Exception
	{
        path = new File(System.getProperty("user.dir")+"\\src\\test\\resources\\config\\config.properties");
		fis = new FileInputStream(path);
		prop = new Properties();
		prop.load(fis);	
	}	
	
		/*@AfterTest
		public void teardown() {
			driver.quit();
		}*/
}
