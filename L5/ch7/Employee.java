
// --------Begin: Employee.java ----------------
public class Employee
{
    String firstName;
    String lastName;
    int age;
    double salary;

    Employee()
    {
        firstName = "";
        lastName = "";
        age = 0;
        salary = 0.0;
    }

    Employee(String firstName, String lastName, int age, double salary)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
    }

    // Getters:
    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public int getAge() { return age; }
    public double getSalary() { return salary; }

    // Setters:
    public void setFirstName(String firstName) { this.firstName = firstName; }
    public void setLastName(String lastName) { this.lastName = lastName; }
    public void setAge(int age) { this.age = age; }
    public void setSalary(double salary) { this.salary = salary; }
}
// -------- End: Employee.java ----------------