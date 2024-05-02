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


	abstract class Beverage {

		private String name;
		private Type BeverageType;
		private Size BeverageSize;
		private final double Price = 2.0;
		private final double S_Price = 1.0;
  
		public Beverage(String name, Type BeverageType, Size BeverageSize) {
			this.name = name;
			this.BeverageType = BeverageType;
			this.BeverageSize = BeverageSize;
		}
		public abstract double calcPrice();

		public String toString() {
			return name +", " +BeverageSize;
		}
		public boolean equals(Beverage bev) {
			if (name.equals(bev.getBevName()) && BeverageType==bev.getBeverageType() && BeverageSize==bev.getBeverageSize()) {
				return true;
			}
			else {
				return false;
			}
		}
  
		public String getBevName() {
			return name;
		}
		public Type getBeverageType() {
			return BeverageType;
		}
		public Size getBeverageSize() {
			return BeverageSize;
		}
		public double getBasePrice() {
			return Price;
		}
		public double getSizePrice() {
			return S_Price;
		}
  
		public void setName(String name) {
			this.name = name;
		}
		public void setBeverageType (Type BeverageType) {
			this.BeverageType = BeverageType;
		}
		public void setBeverageSize(Size BeverageSize) {
			this.BeverageSize = BeverageSize;
		}

		

	}