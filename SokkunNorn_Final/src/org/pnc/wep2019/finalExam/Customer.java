package org.pnc.wep2019.finalExam;

public abstract class Customer {
	private String name;
	private double packageCost;
	private double serviceCost;
	
	public Customer(String name, double packageCost, double serviceCost) {
		this.name = name;
		this.packageCost = packageCost;
		this.serviceCost = serviceCost;
	}
	
	public String getName() {
		return name;
	}
	
	public double getPackageCost() {
		return packageCost;
	}
	
	public double getServiceCost() {
		return serviceCost;
	}
	
	public abstract double findTotalExpense();
}
