/** Program: Exercise 13.13
* 
* File: Exercise_13_13.java
* Summary: Chapter 13, Exercise 13. 
* 
* (Enable the Course class cloneable) Rewrite the Course class in Listing 10.6
* to add a clone method to perform a deep copy on the students field.
* 
* Author: Aaron Fonseca
* Date: July 17, 2016
**/

public class Exercise_13_13 {
	public static void main(String[] args) throws CloneNotSupportedException {
		
		// Create new Course Obj
		Course course1 = new Course("Mat101");

		// Add 3 students to course1
		course1.addStudent("Ron Peral");
		course1.addStudent("Eric Roberts");
		course1.addStudent("Aaron Fonseca");

		// Clone course1.obj
		Course course2 = course1.clone();

		// Add three students to course2
		course2.addStudent("Darth Vader");
		course2.addStudent("Han Solo");

		// Display students in course1
		System.out.println(course1.toString());
		String[] students = course1.getStudents();
		for (int i = 0; i < course1.getNumberOfStudents(); i++)
			System.out.print(students[i] + "\n");
		System.out.println();

		// Display students in course2
		System.out.println(course2.toString());
		students = course2.getStudents();
		for (int i = 0; i < course2.getNumberOfStudents(); i++)
			System.out.print(students[i] + "\n");
	}
}