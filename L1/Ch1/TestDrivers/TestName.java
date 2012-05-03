import customtypes.Customer;

class TestName
{
    public static void main(String[] args)
    {
        Customer cst = new Customer("John", "Cox", 100.0);
        cst.setFirstName("Steve");
        cst.setLastName("Ferrone");
        System.out.println(cst.getLastName() + ", " + cst.getFirstName() + " " + cst.getOrderValue());
    }
}