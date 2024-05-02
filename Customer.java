/*
 * Class: CMSC203 CRN 33099
 Program: Assignment 6 Design
 Instructor: Farnaz Eivazi
 Summary of Description:  Create a Java program that automates the order 
 transactions and reports and purchase a software for testing order activities for one month.
 Using inheritance. 
 Due Date: 05/05/2024
 Integrity Pledge: I pledge that I have completed the programming assignment independently.
 I have not copied the code from a student or any source.
Student: Jean Claude Djeugang

 * 
 */
public class Customer {
	private String name;
	private int age;

	public Customer(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public Customer(Customer other) {
		this.name = other.getName();
		this.age = other.getAge();
	}

	@Override
	public String toString() {
		return "Customer [name=" + name + ", age=" + age + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}