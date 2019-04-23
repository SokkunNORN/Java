package org.pnc.wep2019.finalExam;

public class Visitor extends Customer {

	public Visitor(String name, double packageCost, double serviceCost) {
		super(name, packageCost, serviceCost);
	}

	@Override
	public double findTotalExpense() {
		return super.getPackageCost() + super.getServiceCost();
	}

	public String toString() {
		return "Customer Name: " + super.getName() + " [Nomal Customer]	\nPackage Cost: " + super.getPackageCost() + "$"
		+ " \nService Cost: " + super.getServiceCost() + "$" + " \nTotal Expence: " + findTotalExpense() + "$" + 
				"\n============================";
	}
}
