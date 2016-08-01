/** 
*	Program: 	Course Class
* 	File: 		Course.java
* 	Summary: 	Chapter 10, Exercise 10.9  Write a test program that creates a course, adds three students, removes one, and displays the students in the course. 
* 	Author: 	Ronald Pearl
* 	Date: 		July 13, 2016 
**/

public class Course implements Cloneable{
	private String courseName; 
	private String[] students = new String[0];
	private int numberOfStudents;

	public Course(String courseName) { 
		this.courseName = courseName; 
	} 

	public void addStudent(String student) {
		String[] tempStudents = new String[students.length + 1];
		tempStudents[0] = student;

		for (int i = 1; i <= students.length; i++) {
			tempStudents[i] = students[i-1];
		}
		
		students = tempStudents;
		numberOfStudents++;
	}

	public String[] getStudents() {
		return students;
	}

	public int getNumberOfStudents() {
		return numberOfStudents;
	}

	public String getCourseName() {
		return courseName;
	}

	public void dropStudent(String student) {
		String[] tempStudents = new String[students.length - 1];
		int counter = 0;
		
		for (int i = 0; i < students.length; i++) {
			if (students[i] != student) {
				tempStudents[counter] = students[i];
				counter++;
			}
		}
		
		students = tempStudents;
		numberOfStudents--;
	}
	
	// Remove all students from the class
	public void clear() {
		students = new String[0];
		numberOfStudents = 0;
	}
	
	@Override // Override the protected clone method defined in the Object class
	public Course clone() throws CloneNotSupportedException {
		
	// Perform a shallow copy
	Course courseClone = (Course)super.clone();
	
	// Deep copy on students
	courseClone.students = students.clone();
	return courseClone;
	}
	
	@Override // Return Sting on obj
	public String toString() {
		return "CourseName: " + getCourseName() + 
			"\nNumberOfStudents: " + getNumberOfStudents();
	}
} 