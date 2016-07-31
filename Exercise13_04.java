/** Program: Exercise 13.4
* File: Exercise_13_4.java
* Summary: Chapter 13, Exercise 4
*  
*  Display calendars) Rewrite the PrintCalendar class in Listing 6.12 to display
*  a calendar for a specified month using the Calendar and GregorianCalendar
*  classes. Your program receives the month and year from the command line. For
*  example:
*  
*  java Exercise13_04 5 2016
*  
*  You also can run the program without the year. In this case, the year is the current
*  year. If you run the program without specifying a month and a year, the month is
*  the current month.
* 
* Author: Aaron Fonseca
* Date: July 31, 2016
**/

import java.util.Calendar;

public class Exercise13_04 {

	public static void main(String[] args) {
		
		// If 0 arguments or more then 2 arguments are passed through the command line
		 if (args.length > 2 || args.length == 0) {
			 System.out.println("Invalid arguments");
				System.out.println("Usage: java Exercise13_04 month year");
			    System.out.println("Usage: java Exercise13_04 5 2016");
			    System.exit(1); 			 
		 }
		 
		 int year;
		 
		 // run the program without the year if years is not passes
		 if (args.length == 1) {
	            year = Calendar.getInstance().get(Calendar.YEAR);
	        } else {
	            year = new Integer(args[1]);
	        }
		 	
		 
		int month = Integer.parseInt(args[0]);
		year = Integer.parseInt(args[1]);
		
		// pass values to MyCalendar
		MyCalendar calendar = new MyCalendar(year, month);
		
	}
}