public class Customer
{
    String firstName;
    String lastName;
    int age;
    double orderValue;

    public Customer(String firstName, String lastName, int age, double orderValue )
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.orderValue = orderValue;
    }

    public String concatName() { return firstName + " " + lastName; }
    public int getAge() { return age; }
    public double getOrderValue() { return orderValue; }
}