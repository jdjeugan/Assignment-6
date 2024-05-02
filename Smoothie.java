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
public class Smoothie extends Beverage {
	private int numOfFruits;
	private boolean addProtien;
	private final double proteinPrice = 1.50;
	private final double fruitPrice = 0.50;

	public Smoothie(String name, Size size, int fruits, boolean protein) {
		super(name,Type.SMOOTHIE, size);
		this.numOfFruits = fruits;
		this.addProtien = protein;
	}

	@Override
	public String toString() {
		return super.toString() + "\n" +
	           "Smoothie [fruits=" + numOfFruits + ", protein=" + addProtien + "]" + "\n" +
				"Price =" + this.calcPrice();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Smoothie other = (Smoothie) obj;
		if (Double.doubleToLongBits(fruitPrice) != Double.doubleToLongBits(other.fruitPrice))
			return false;
		if (numOfFruits != other.numOfFruits)
			return false;
		if (addProtien != other.addProtien)
			return false;
		if (Double.doubleToLongBits(proteinPrice) != Double.doubleToLongBits(other.proteinPrice))
			return false;
		return true;
	}

	@Override
	public double calcPrice() {
		double price = 0.0;
		price += super.getBasePrice();
		switch (super.getBeverageSize()) {
			case SMALL: break;
			case MEDIUM: price += super.getSizePrice();
						 break;
			case LARGE: price += 2 * super.getSizePrice();
						break;
		}
		price += this.addProtien ? this.proteinPrice : 0.0;
		price += this.numOfFruits * this.fruitPrice;
		return price;
	}

	public int getNumOfFruits() {
		return numOfFruits;
	}

	public void setNumOfFruits(int fruits) {
		this.numOfFruits = fruits;
	}

	public boolean getAddProtien() {
		return addProtien;
	}

	public void setAddProtien(boolean protein) {
		this.addProtien = protein;
	}

	public double getProteinPrice() {
		return proteinPrice;
	}

	public double getFruitPrice() {
		return fruitPrice;
	}

}
