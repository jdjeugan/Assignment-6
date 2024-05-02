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

	public class Coffee extends Beverage{

			private boolean exShot;
			private boolean exSyrup;
			private final double shotprice = .5;
			private final double syrupPrice = .5;
  

			public Coffee(String n, Size s, boolean shot, boolean syrup) {
				super(n, Type.COFFEE, s);
				exShot = shot;
				exSyrup = syrup;
			}
  

			public String toString() {
				String s = getBevName() +", " +getBeverageSize();
  
				if (exShot) {
					s += " Extra shot";
				}
				if (exSyrup) {
					s += " Extra syrup";
				}
  
				s += ", $" +calcPrice();
  
				return s;
			}
			@Override
			public double calcPrice() {
				double price = super.getBasePrice();
  
				if (super.getBeverageSize() == Size.MEDIUM) {
					price += super.getSizePrice();
				}
				else if (super.getBeverageSize() == Size.LARGE) {
					price += 2 * super.getSizePrice();
				}
  
				if (exShot) {
					price += shotprice;
				}
				if (exSyrup) {
					price += syrupPrice;
				}
  
				return price;
			}
			public boolean equals(Coffee c) {
				if (super.equals(c) && exShot==c.getExtraShot() && exSyrup==c.getExtraSyrup()) {
					return true;
				}
				else {
					return false;
				}
			}
  

			public boolean getExtraShot() {
				return exShot;
			}
			public boolean getExtraSyrup() {
				return exSyrup;
			}
			public double getShotCost() {
				return shotprice;
			}
			public double getSyrupCost() {
				return syrupPrice;
			}
  

			public void setExtraShot(boolean shot) {
				exShot = shot;
			}
			public void setExtraSyrup(boolean syrup) {
				exSyrup = syrup;
			}
	}