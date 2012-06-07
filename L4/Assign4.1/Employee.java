public class Employee {
	String firstName;
	String lastName;
	double salary ;

	public Employee (String firstName, String lastName, double salary){
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
	}

	public String concatName() {
		return (lastName+","+firstName);
	}
}