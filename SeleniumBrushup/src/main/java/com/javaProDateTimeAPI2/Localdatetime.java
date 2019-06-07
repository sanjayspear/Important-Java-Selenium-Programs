package com.javaProDateTimeAPI2;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Localdatetime {

	public static void main(String[] args) {
       LocalDateTime now = LocalDateTime.now();
       System.out.println("Current local date & time before formatting: "+now);
       
       DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
       String formattedDate = now.format(formatter);
       System.out.println("Current local date & time post formatting: "+formattedDate);
       System.out.println("Current local date & time post formatting: "+formattedDate.replace(":", "/").replace("-", ":"));

       
	}

}
