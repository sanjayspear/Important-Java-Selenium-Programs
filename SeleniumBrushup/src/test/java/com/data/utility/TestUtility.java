package com.data.utility;

import java.util.ArrayList;

public class TestUtility {
	static Xls_Reader reader;
	
	
	public static ArrayList<Object[]> getDataFromExcel()
	{
		ArrayList<Object[]> myData = new ArrayList<>();
		
		try {
			reader = new Xls_Reader("./excelData/halfEbayTestData.xlsx");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		for(int rowNum = 2; rowNum <= reader.getRowCount("registration"); rowNum++)
		{
			String firstname = reader.getCellData("registration", "firstname", rowNum);
			String lasttname = reader.getCellData("registration", "lasttname", rowNum);
			String email = reader.getCellData("registration", "email", rowNum);
			String password = reader.getCellData("registration", "password", rowNum);
			
			Object obj[] = {firstname, lasttname, email, password };
			myData.add(obj);

		}
		
		return myData;
	}
}
