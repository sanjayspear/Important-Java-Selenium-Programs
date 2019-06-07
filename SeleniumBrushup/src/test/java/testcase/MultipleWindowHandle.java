package testcase;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MultipleWindowHandle {
	public WebDriver driver;
	public JavascriptExecutor je;
	public Set<String> ChildWindows2;
	public Set<String> ChildWindows3;
	public String parent;
	public String cwin1;
	public String cwin2;

	@Test
	public void mwhDemo() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + "\\src\\test\\resources\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		je = (JavascriptExecutor) driver;
		driver.get("https://www.hdfcbank.com/");
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		WebElement ele = driver.findElement(By.xpath("//a[text()='Careers']"));
		je.executeScript("arguments[0].scrollIntoView(true)", ele);
		Thread.sleep(4000);

		parent = driver.getWindowHandle();

		driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[1]/div[1]/div[2]/ul/li[2]/a")).click();

		Set<String> ChildWindows = driver.getWindowHandles();

		System.out.println("Parent window id ->" + parent);

		Iterator<String> container = ChildWindows.iterator();

		while (container.hasNext()) {
			cwin1 = container.next();
			if (!parent.equals(cwin1)) {
				System.out.println("Child Window-1 id-->" + cwin1);

				driver.switchTo().window(cwin1);

				WebElement applyNow = driver.findElement(By.xpath("//*[@id=\"new-carloan\"]/a[2]"));

				je.executeScript("arguments[0].scrollIntoView(true)", applyNow);

				Thread.sleep(2000);

				applyNow.click();

			}

		}

		ChildWindows2 = driver.getWindowHandles();

		Iterator<String> container2 = ChildWindows2.iterator();

		while (container2.hasNext()) {
			cwin2 = container2.next();

			if (!cwin1.equals(cwin2) && !cwin2.equals(parent)) {
				System.out.println("Child Window-2 id-->" + cwin2);

				driver.switchTo().window(cwin2);
				driver.close();
				Thread.sleep(3000);
				driver.switchTo().window(cwin1);
				driver.close();
				driver.switchTo().window(parent);
				Thread.sleep(3000);
				driver.quit();
			}
		}

	}

}
