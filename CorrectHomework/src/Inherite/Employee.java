package Inherite;

public class Employee extends Person implements ITaxPayer {

	private String company;
	private double salary;
	
	public Employee(String id, String name) {
		super(id, name);
	}
	
	public Employee(String id, String name, String company, double salary) {
		super(id, name);
		this.company = company;
		this.salary = salary;
	}
	
	public String getCompany() {
		return company;
	}
	
	public double getSalary() {
		return salary;
	}

	@Override
	public double caculateTax(double salary) {
		double Netsalary = 0;
		double tax = 0;
		if (salary <= 200) {
			tax = salary * 5 / 100;
		} else {
			tax = salary * 1 / 10;
		}
		Netsalary = salary - tax;
		return Netsalary;
	}

	@Override
	void display() {
		System.out.println("ID: " + getId() + ", Name: " + getName() + 
				", Company: " + company + ", Netsalary: " + caculateTax(salary) );
	}

}
