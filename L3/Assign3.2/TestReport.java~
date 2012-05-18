// -----------Begin: TestReport.java ----------
import java.text.DecimalFormat;
import java.text.NumberFormat;

class TestReport
{
    public static void main(String[] args)
    {
	    Employee[] empl = new Employee[4];
	    int[] SAEmplIds = {101,102,103};
	    double tWages = 0.0, amountS=0.0, comm=0.0;
	    double commT = 0.0, amountT=0.0;
	    NumberFormat formatter = new DecimalFormat("###0.00");

	    System.out.println ("Going inside Manager");
	    empl[0] = new Manager(SAEmplIds, 100, "John", "Smith", 5000.0);
	    empl[1] = new SalesAssociate(200.0, 0.05, 101, "Judy", "Miller", 1000.0);
	    empl[2] = new SalesAssociate(500.0, 0.07, 102, "Mike", "Johnson", 1500.0);
	    empl[3] = new SalesAssociate(300.0, 0.05, 103, "Steve", "Ferrone", 900.0);
	    EmployeeFormat emf = new EmployeeFormat();
	    GenericFormat gf = new GenericFormat();

	    // Create the header banner
	System.out.println ("******************************************************************");
	System.out.println (gf.formatObj("Salary Report", 65, false));
	System.out.println ("******************************************************************");

	// Create the header row for Salary Report
	System.out.println ("__________________________________________________________________");
	System.out.println (gf.formatObj("EmplID", emf.emplIdWidth, emf.emplIdJL) +
				    gf.formatObj("Name", emf.nameWidth, emf.nameJL) +
				    gf.formatObj("Employee Type", emf.emplTypeWidth, emf.emplTypeJL) +
				    gf.formatObj("Salary", emf.salWidth, emf.salJL) +
				    gf.formatObj("Limit", emf.limitWidth, emf.limitJL) +
				    gf.formatObj("Tax Rate", emf.taxWidth,emf.taxJL));
	System.out.println ("___________________________________________________________________");
	double totalSal= 0.0 ;
	
	    for (int i = 0; i < empl.length; i++)
	    {
		    double sal = empl[i].getSalary();
		    totalSal += sal ;
		    emf.formatObj(empl[i]);
	    }

        // Now the Footer for Salary Report

        System.out.println ("___________________________________________________________________");
	System.out.println ("\t    "+ gf.formatObj("Totals", emf.nameWidth, emf.nameJL) + "\t\t\t"+
			    gf.formatObj(new Double(totalSal), emf.salWidth, emf.salJL));
        System.out.println ("___________________________________________________________________");

	// Create the sales report header banner
	System.out.println ("******************************************************************");
	System.out.println (gf.formatObj("Sales  Report", 65, false));
	System.out.println ("******************************************************************");

	// Create the header row for Sales Report
	System.out.println ("__________________________________________________________________");
	System.out.println (gf.formatObj("EmplID", emf.emplIdWidth, emf.emplIdJL) +
			    gf.formatObj("Name", emf.nameWidth, emf.nameJL) +
			    gf.formatObj("Amount Sold", emf.soldWidth, emf.soldJL) + 
			    gf.formatObj("Commission", emf.comWidth, emf.comJL)); 
	System.out.println ("___________________________________________________________________");

	double totalSold =0.0, totalCom = 0.0;
	
	for (int i = 0 ; i < empl.length; i++){

		if (empl[i] instanceof SalesAssociate){
			SalesAssociate sa = (SalesAssociate) empl[i]; 
			double sold = sa.getAmountSold();
			double com = sold * sa.getCommissionRate();
			totalSold += sold;
			totalCom += com; 
			emf.formatObj(((SalesAssociate) empl[i]), true);
		}
	}
        // Now the Footer for Sales Report
	System.out.println ("___________________________________________________________________");
	System.out.println ("\t    " + gf.formatObj("Totals", emf.nameWidth, emf.nameJL) +
			    gf.formatObj(totalSold, emf.soldWidth, emf.soldJL) +
			    gf.formatObj(totalCom, emf.comWidth, emf.comJL )); 
	System.out.println ("___________________________________________________________________");

    }
}
