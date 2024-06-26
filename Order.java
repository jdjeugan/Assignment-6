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
import java.util.ArrayList;
import java.util.Random;

public class Order implements OrderInterface, Comparable<Order> {
	private int orderNo;
	private int orderTime;
	private Day orderDay;
	private Customer customer;
	private ArrayList<Beverage> beverages;

	public Order(int time, Day day, Customer customer) {
		Random rand = new Random();
		this.orderNo = rand.nextInt(90000-10000)+10000;
		this.orderTime = time;
		this.orderDay = day;
		this.customer = new Customer(customer);
		this.beverages = new ArrayList<Beverage>();
	}

	@Override
	public boolean isWeekend() {
		switch (this.orderDay) {
			case SATURDAY:
			case SUNDAY: return true;
			default: return false;
		}
	}

	@Override
	public Beverage getBeverage(int itemNo) {
		return this.beverages.get(itemNo);
	}

	@Override
	public void addNewBeverage(String bevName, Size size, boolean extraShot, boolean extraSyrup) {
		this.beverages.add(new Coffee(bevName, size, extraShot, extraSyrup));

	}

	@Override
	public void addNewBeverage(String bevName, Size size) {
		this.beverages.add(new Alcohol(bevName, size, this.isWeekend()));

	}

	@Override
	public void addNewBeverage(String bevName, Size size, int numOfFruits, boolean addPRotien) {
		this.beverages.add(new Smoothie(bevName, size, numOfFruits, addPRotien));

	}

	@Override
	public double calcOrderTotal() {
		double total = 0.0;
		for (Beverage bev: this.beverages) {
			total += bev.calcPrice();
		}
		return total;
	}

	@Override
	public int findNumOfBeveType(Type type) {
		int result = 0;
		for (Beverage bev: beverages) {
			if (bev.getBeverageType() == type) {
				result++;
			}
		}
		return result;
	}
	
	public int getTotalItems() {
		return this.beverages.size();
	}

	@Override
	public int compareTo(Order o) {
		if (this.orderNo > o.getOrderNo()) {
			return 1;
		} else if(this.orderNo < o.orderNo) {
			return -1;
		} else {
			return 0;
		}
	}

	@Override
	public String toString() {
		return "Order [orderNo=" + orderNo + ", orderTime=" + orderTime + ", orderDay=" + orderDay + ", customer="
				+ customer + ", beverages=" + beverages + ", orderTotal=" + this.calcOrderTotal() + "]";
	}

	public int getOrderNo() {
		return orderNo;
	}

	public void setOrderNo(int orderNumber) {
		this.orderNo = orderNumber;
	}

	public int getOrderTime() {
		return orderTime;
	}

	public void setOrderTime(int orderTime) {
		this.orderTime = orderTime;
	}

	public Day getOrderDay() {
		return orderDay;
	}

	public void setOrderDay(Day orderDay) {
		this.orderDay = orderDay;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public ArrayList<Beverage> getBeverages() {
		return beverages;
	}

	public void setBeverages(ArrayList<Beverage> beverages) {
		this.beverages = beverages;
	}

}
