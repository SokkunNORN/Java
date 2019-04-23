package org.pnc.wep2019.finalExam;

public class GoldMembership extends Customer implements iMembership {

	private int registeredYear;
	private double discountRate;
	
	public GoldMembership(String name, double packageCost, double serviceCost) {
		super(name, packageCost, serviceCost);
	}
	
	public int getRegisteredYear() {
		return registeredYear;
	}
	
	public void setRisteredYear(int registeredYear) {
		this.registeredYear = registeredYear;
	}
	
	public int getMembershipYear() {
		return registeredYear;
	}

	@Override
	public double getDiscount() {
		double totalExpence = super.getPackageCost() + super.getServiceCost();
		if (getMembershipYear() >= 2) {
			discountRate = totalExpence * 25 / 100;
		} else if (totalExpence >= 250) {
			discountRate = totalExpence * 20 / 100;
		} else {
			discountRate = totalExpence * 15 / 100;
		}
		return discountRate;
	}

	@Override
	public double findTotalExpense() {
		double expence = super.getPackageCost() + super.getServiceCost();
		double totalExpence = expence - getDiscount();
		return totalExpence;
	}
	
	public String toString() {
		return "Customer Name: " + super.getName() + " [Gold Membership," + getMembershipYear() + "Years]	\nPackage Cost: " + super.getPackageCost() + "$"
				+ " \nService Cost: " + super.getServiceCost() + "$" + " \nTotal Expence: " + findTotalExpense() + "$" + 
						"\n============================";
	}

}
