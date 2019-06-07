package com.javaDateTimeAPI;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTimeFormat2 {
	
	/*The java.text.SimpleDateFormat class provides methods to format and parse date 
	and time in java. The SimpleDateFormat is a concrete class for formatting and 
	parsing date which inherits java.text.DateFormat class.*/
	
	public static SimpleDateFormat formatter;
	public static String strDate;
    public static Date date;
	public static void main(String[] args) {
        date = new Date();
        
        formatter = new SimpleDateFormat("MM/dd/yyyy");  
        strDate = formatter.format(date);  
        System.out.println("Date Format with MM/dd/yyyy : "+strDate); 
        
        formatter = new SimpleDateFormat("dd-M-yyyy hh:mm:ss");
        strDate = formatter.format(date);
        System.out.println(strDate.replace("-", "/").replace(":", "/"));
        
        formatter = new SimpleDateFormat("dd MMMM yyyy");  
        strDate = formatter.format(date);  
        System.out.println("Date Format with dd MMMM yyyy : "+strDate);  
      
        formatter = new SimpleDateFormat("dd MMMM yyyy zzzz");  
        strDate = formatter.format(date);  
        System.out.println("Date Format with dd MMMM yyyy zzzz : "+strDate);  
      
        formatter = new SimpleDateFormat("E, dd MMM yyyy HH:mm:ss z");  
        strDate = formatter.format(date);  
        System.out.println("Date Format with E, dd MMM yyyy HH:mm:ss z : "+strDate);  
                
	}

}
