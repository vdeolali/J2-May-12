public abstract class Employee extends Person
{
	protected double salary;
	private int emplId;
	protected String emplTypeDescr;
	protected int contributionLimit;
	protected double taxRate;

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

	int getContributionLimit(){
		return (this.contributionLimit);
	}

	double getTaxRate(){
		return (this.taxRate);
	}

	abstract void  updateDerivedAttrs();

}
