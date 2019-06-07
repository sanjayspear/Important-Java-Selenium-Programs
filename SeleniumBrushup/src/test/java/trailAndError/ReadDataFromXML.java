package trailAndError;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ReadDataFromXML {
	Object obj[][];
	
	@Parameters({"uname", "email_id", "pwd"})
	@Test(priority=1)
	public void test(String uname, String email_id, String pwd) {
		System.out.println(uname+" "+email_id+" "+pwd);
	}
	
	@Test(priority=2, dataProvider="credentials")
	public void test1(String un, String email_id, String password) {
		System.out.println(un+" "+email_id+" "+password);
	}
	
	@DataProvider(name="credentials")
	public Object[][] getData() {
		Object obj[][]=new Object[4][3];
		
		obj[0][0]="Sanjay";
		obj[0][1]="sanjay@gamil.com";
		obj[0][2]="abc123";
		
		obj[1][0]="Sanjay1";
		obj[1][1]="sanjay1@gamil.com";
		obj[1][2]="abc456";
		
		obj[2][0]="Sanjay2";
		obj[2][1]="sanjay2@gamil.com";
		obj[2][2]="abc789";
		
		obj[2][0]="Sanjay3";
		obj[2][1]="sanjay3@gamil.com";
		obj[2][2]="abc101112";
		return obj;
	}
}
