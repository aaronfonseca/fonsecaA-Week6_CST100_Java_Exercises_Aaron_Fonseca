/** 
*	Program: 	MyDate class
* 	File: 		MyDate.java
* 	Summary: 	Chapter 10, Exercise 10.14
*				Write a test program that creates two MyDate objects (using new MyDate() and 
*				new MyDate(34355555133101L)) and displays their year, month, and day.
*      			The first two constructors will extract the year, month, and day from the elapsed time.
* 	Author: 	Ronald Pearl
* 	Date: 		July 15, 2016 
**/

import java.util.Calendar;
import java.util.GregorianCalendar;

public class MyDateRon {

    private int year;
    private int month;
    private int day;

    public MyDateRon() {

        GregorianCalendar cal = new GregorianCalendar();
        year = cal.get(Calendar.YEAR);
        month = cal.get(Calendar.MONTH);
        day = cal.get(Calendar.DAY_OF_MONTH);

    }

    public MyDateRon(long elapsedTime) {
        GregorianCalendar cal = new GregorianCalendar();
        cal.setTimeInMillis(elapsedTime);
        year = cal.get(Calendar.YEAR);
        month = cal.get(Calendar.MONTH);
        day = cal.get(Calendar.DAY_OF_MONTH);
    }

    public MyDateRon(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void setDate(long elapsedTime) {
        GregorianCalendar cal = new GregorianCalendar();
        cal.setTimeInMillis(elapsedTime);
        year = cal.get(Calendar.YEAR);
        month = cal.get(Calendar.MONTH);
        day = cal.get(Calendar.DAY_OF_MONTH);
    }
}