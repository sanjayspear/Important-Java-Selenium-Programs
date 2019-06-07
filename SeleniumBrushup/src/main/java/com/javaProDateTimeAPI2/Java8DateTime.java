package com.javaProDateTimeAPI2;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Set;

public class Java8DateTime {

	public static void main(String[] args) {
       LocalDate date = LocalDate.now();
       LocalDate Yesterday = date.minusDays(1);
       LocalDate Tomorrow = date.plusDays(1);
       
       System.out.println("Today date: "+date);
       System.out.println("Tomorrow date: "+Tomorrow);
       System.out.println("Yessterday date: "+Yesterday);
       
       LocalDate pre2Week = date.minusWeeks(2);
       LocalDate post2Week = date.plusWeeks(2);
       
       System.out.println("Date before two weeks: "+pre2Week);
       System.out.println("Date after two weeks: "+post2Week);
       System.out.println();
       
       Set<String> zoneId = ZoneId.getAvailableZoneIds();
       
       System.out.println("Print all the available zone id's");
       System.out.println();

       for(String X:zoneId) {
    	   System.out.println(X);
       }
       date = LocalDate.now(ZoneId.of("America/Toronto"));
       System.out.println("What is the current time in America: "+date);

	}

}
