package testcase;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderAnnotation {
	
	//@AfterMethod Executes after each test where as @AfterTest executes once after all the test case
	@AfterMethod
	public void tearDown() {
		System.out.println("[---Logout is done---]");
	}
	
	@AfterTest
	public void info() {
		System.out.println("//////////////////=============///////////////////////================/////////////");
		System.out.println("You should always remember that i am @AfterTest executes only once after all the test");
		System.out.println("Conclusion: @Dataprovider is used to execute same test case with multiple set of data");
		System.out.println("Wish you all the best and happy learing");
		System.out.println("//////////////////=============///////////////////////================/////////////");
	}

	//step-2 use data provider
	//step-3 pass input parameters values into test case
	@Test(dataProvider="getData")
	public void doLoginTest(String un, String pwd, String result, String browser) {
		System.out.println(un+" "+pwd);
	}
	
	@DataProvider
	public Object[][] getData(){
		//step-1 create 2D array
		Object[][] data=new Object[3][4];
		
		data[0][0]="Sanjay";
		data[0][1]="pass1";
		data[0][2]="pass";
		data[0][3]="firefox";
		
		data[1][0]="Vivek";
		data[1][1]="pass2";
		data[1][2]="skip";
		data[1][3]="chrome";
		
		data[2][0]="Sachin";
		data[2][1]="pass3";
		data[2][2]="fail";
		data[2][3]="ie";
		
		
		return data;
		
	}
	
}
