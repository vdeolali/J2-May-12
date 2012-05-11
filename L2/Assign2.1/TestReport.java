class TestReport
{
    public static void main(String[] args)
    {
	    Employee[] empl = new Employee[4];
	    int[] SAEmplIds = {101,102,103};
	    double tWages = 0.0, amountS=0.0, comm=0.0;
	    double commT = 0.0, amountT=0.0;

	    System.out.println ("Going inside Manager");
	    empl[0] = new Manager(SAEmplIds, 100, "John", "Smith", 5000.0);
	    empl[1] = new SalesAssociate(200.0, 0.05, 101, "Judy", "Miller", 1000.0);
	    empl[2] = new SalesAssociate(500.0, 0.07, 102, "Mike", "Johnson", 1500.0);
	    empl[3] = new SalesAssociate(300.0, 0.05, 103, "Steve", "Ferrone", 900.0);

	    System.out.println (" *********************************************\n");
	    System.out.println ("\t\t Salary Report \t\t\n");
	    System.out.println (" *********************************************\n");
	    System.out.println ("________________________________________\n");
	    System.out.println ("Empl Id\t" + "Name\t" + "Employee Type\t" + "Salary\t");
	    System.out.println ("________________________________________\n");


	    for (int i = 0; i < empl.length; i++){
		    System.out.println (empl[i].getEmplId() + "\t"+  empl[i].concatName() + "\t"  + empl[i].getEmplTypeDescr() + "\t\t" + empl[i].getSalary());
		    tWages += empl[i].getSalary(); 
	    }

	    System.out.println ("___________________________________________\n");
	    System.out.println (" \t\t Total Wages: \t\t\t" + tWages);
	    System.out.println ("___________________________________________\n");

	    System.out.println (" *********************************************\n");
	    System.out.println ("\t\t Sales Report \t\t\n");
	    System.out.println (" *********************************************\n");
	    System.out.println ("________________________________________\n");
	    System.out.println ("Empl Id\t" + "Name\t" + "Amount Sold\t" + "Commission\t");
	    System.out.println ("________________________________________\n");


	    for (int i = 0; i < empl.length; i++){
		    if (empl[i] instanceof SalesAssociate){
			    comm = ((SalesAssociate)empl[i]).getCommissionRate();
			    amountS = ((SalesAssociate)empl[i]).getAmountSold();
			    amountT += amountS;
			    comm *= amountS;
			    commT += comm ;

			    System.out.println (empl[i].getEmplId() + "\t"+  empl[i].concatName() + "\t"  + amountS + "\t\t" + comm);
			    
		    }
	    }
	    System.out.println ("___________________________________________\n");
	    System.out.println ("\t Totals:\t" + amountS +"\t\t" + commT);
	    System.out.println ("___________________________________________\n");
	    

/*	    
        Person[] prs = new Person[5];
        prs[0] = new Person("John", "Smith");
        prs[1] = new Customer("Judy", "Miller", 145.0);
        prs[2] = new Customer("Jane", "Armstrong", 300.0);
        prs[3] = new Employee("Mike", "Johnson", 1000.0);
        prs[4] = new Employee("Jennifer", "Peterson", 1200.0);
        double totSales = 0.0, totSalary = 0.0;
        System.out.println("---------------------------------------------------");
        System.out.println(" #    Name    Order Value   Salary");
        System.out.println("---------------------------------------------------");
        for (int i = 0; i < prs.length; i++)
        {
            if (prs[i] instanceof Customer)
            {
                double orderVal = ((Customer)prs[i]).orderValue;
                totSales += orderVal;
                System.out.println((i+1) + "    " + prs[i].concatName() + "    " + orderVal);
            }
            else if (prs[i] instanceof Employee)
            {
                double sal = ((Employee)prs[i]).salary;
                totSalary += sal;
                System.out.println((i+1) + "    " + prs[i].concatName() + "    " + sal);
            }
            else
                System.out.println((i+1) + "    " + prs[i].concatName());
        }
        System.out.println("---------------------------------------------------");
        System.out.println(" Totals " + totSales + "    " + totSalary );
        System.out.println("---------------------------------------------------");
*/
    }
}
