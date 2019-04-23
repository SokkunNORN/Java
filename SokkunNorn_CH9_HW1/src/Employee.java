
public class Employee extends Person implements ITaxPayer {

	private String company;
	private double salary;
	
	public Employee(String id, String name) {
		super(id, name);
	}
	
	public	Employee(String id, String name, String company, double salary) {
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
		double Tax = 0;
		double Netsalary = 0;
		if(salary <= 200) {
			Tax = (5 / 100) * salary; 
		} else {
			Tax = 0.1 * salary;
		}
		Netsalary = salary - Tax;
		return Netsalary;
	}
	
	@Override
	void display() {
		System.out.println("ID: " + getId() + ", Name: " + getName() + ", Company " + company + ", NetSalary:" + caculateTax(salary));
	}

}
