package practical10;

public class Employee extends Person{
	double salary;
	
	public Employee() {
		//super();
	}
	
	public Employee(String name,int age,String emailId,double Salary) {
		super(name,age,emailId);
		this.salary = Salary;
	}
	
	public double getSalary() {
		return salary;
	}
	
	public void setSalary(double sal) {
		this.salary = sal;
	}

	@Override
	public String toString() {
		return "Salary: "+salary+"\n" +super.toString();
	}

}