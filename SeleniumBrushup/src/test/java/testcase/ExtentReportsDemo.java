package testcase;

import java.io.IOException;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReportsDemo {
   
	@Test
	public void logintest() throws IOException {
        // start reporters
		ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter(System.getProperty("user.dir")+"\\src\\test\\resources\\extentReports\\reports.html");
		
        // create ExtentReports and attach reporter(s)
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
		
		ExtentTest logger = extent.createTest("logintest", "Login to Gmail");
		logger.log(Status.INFO, "Login of admin user");
		logger.log(Status.PASS, "Login success");
		logger.addScreenCaptureFromPath(System.getProperty("user.dir")+"\\src\\test\\resources\\screenshots\\2019_05_07 17_41_38+0530.png");
		
		ExtentTest logger2 = extent.createTest("invalidLogin", "Login with invalid credentials");
		logger2.log(Status.FAIL, "User given invalid credentials");
		

		//Once test is done then you need flush the information
		extent.flush();
	}
	
}
