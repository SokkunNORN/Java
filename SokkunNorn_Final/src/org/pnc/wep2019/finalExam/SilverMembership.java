package org.pnc.wep2019.finalExam;

public class SilverMembership extends Customer implements iMembership {

	public SilverMembership(String name, double packageCost, double serviceCost) {
		super(name, packageCost, serviceCost);
	}

	@Override
	public double getDiscount() {
		double discount = 0;
		discount = (super.getPackageCost() + super.getServiceCost()) * 10 / 100;
		return discount;
	}

	@Override
	public double findTotalExpense() {
		double expense = 0;
		expense = (super.getPackageCost() + super.getServiceCost()) - getDiscount();
		return expense;
	}
	
	public String toString() {
		return "Customer Name: " + super.getName() + " [Silver Membership]	\nPackage Cost: " + super.getPackageCost() + "$"
		+ " \nService Cost: " + super.getServiceCost() + "$" + " \nTotal Expence: " + findTotalExpense() + "$" + 
				"\n============================";
	}

}
