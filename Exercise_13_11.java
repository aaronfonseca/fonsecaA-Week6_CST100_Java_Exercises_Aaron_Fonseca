/** Program: Exercise 13.1
* File: Exercise_13_11.java
* Summary: Chapter 13, Exercise 11
*  
*  (The Octagon class) Write a class named Octagon that extends
*  GeometricObject and implements the Comparable and Cloneable interfaces.
*  Assume that all eight sides of the octagon are of equal length. The area can
*  be computed using the following formula:
*  
*  area = (2 + 4/Math.sqrt(2))* side * side
*  
*  Draw the UML diagram that involves Octagon, GeometricObject,
*  Comparable, and Cloneable. Write a test program that creates an Octagon
*  object with side value 5 and displays its area and perimeter. Create a new object
*  using the clone method and compare the two objects using the compareTo
*  method.
* 
* Author: Aaron Fonseca
* Date: July 31, 2016
* 
**/


public class Exercise_13_11 {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		// create variable
		String compareString;
		
		// Create an Octagon object
		Octagon oct1 = new Octagon(5);
		
		// Clone an Octagon object
		Octagon oct2 = oct1.clone();
		
		// Compare oct1 - oct2
		switch(oct1.compareTo(oct2)) {
        case 0:  compareString = "equal";
        	break;
		default: compareString = "not equal";
		    break;
		}
		
		// Print out Octagon 1 
		System.out.println("Octagon 1\n" + oct1.toString() + "\n");
		
		// Print out Octagon compare results
		System.out.println("Octagon 1 and Octagon 2 are " + compareString);
		

	}

}
