/** Program: Exercise 13.11
* File: Exercise_13_11.java
* Summary: Chapter 13, Exercise 11
*  
* Octagon Class re-written for Exercise 13.11
* 
* Author: Aaron Fonseca
* Date: July 31, 2016
**/


public class Octagon extends GeometricObject 
							implements Cloneable, Comparable<Octagon>{
	
	private double side;
	
	// Construct new octagon
	public Octagon() {
	}

	// Construct an octagon with a specific side
	public Octagon(double side) {
		this.side = side;
	}


	public void setSide(double side){
		this.side = side;
	}

	@Override // Get perimeter of obj
	public double getPerimeter() {
		return 8 * side;
	}
	
	@Override // Get area of octagon
	public double getArea() {
		return (2 + 4 / Math.sqrt(2)) * side * side;
	}

	@Override // Compare octogon to obj
	public int compareTo(Octagon o) {
		if (getArea() > o.getArea())
			return 1;
		else if (getArea() < o.getArea())
			return -1;
		else
			return 0;
	}
	
	@Override // Override the protected clone in method
	public Octagon clone() throws CloneNotSupportedException {
		return (Octagon) super.clone();
	}
	
	@Override // Return Sting on obj
	public String toString() {
		return "Area: " + getArea() + 
			"\nPerimeter: " + getPerimeter();
	}

}
