// --------- Begin Customer.java -------------------
public class Customer extends Person
{
    double orderValue;

    public Customer (String firstName, String lastName, double orderValue)
    {
        super(firstName, lastName);
        this.orderValue = orderValue;
    }
}
// --------- End Customer.java -------------------