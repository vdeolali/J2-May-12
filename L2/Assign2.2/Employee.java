public class Employee extends Person
{
	private double salary;
	private int emplId;
	protected String emplTypeDescr;

	public Employee(int emplId, String firstName, String lastName, double salary) {
		super(firstName, lastName);
		this.salary = salary;
		this.emplId = emplId;
	}

	int getEmplId(){
		return (this.emplId);
	}

	double getSalary(){
		return (this.salary);
	}

	void setEmplId(int eid){
		this.emplId = eid;
	}

	void setSalary(double sal){
		this.salary = sal; 
	}

	String getEmplTypeDescr(){
		return (this.emplTypeDescr);
	}
}
