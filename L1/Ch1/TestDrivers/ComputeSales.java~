class ComputeSales
{
    public static void main(String[] args)
    {
        double totalSales = 0.0;

        // Create an array of 'Customer' data type:
        Customer[] customers = new Customer[3];
        customers[0] = new Customer("John", "Cox", 100.0);
        customers[1] = new Customer("Mike", "Long", 200.0);
        customers[2] = new Customer("Nancy", "Smith", 150.0);

        System.out.println("------------------------------------");
        System.out.println("Customer Name Order Value");
        System.out.println("------------------------------------");

        for (int i = 0; i < 3; i++)
        {
            System.out.println(customers[i].concatName() +
                                        " " + customers[i].orderValue);
            totalSales += customers[i].orderValue;
        }

        System.out.println("------------------------------------");
        System.out.println(" Total Sales: " + totalSales);
        System.out.println("------------------------------------");
    }
}