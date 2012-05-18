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
	    SAFormat sf = new SAFormat();
	    GenericFormat gf = new GenericFormat();

	    // Create the header banner
	System.out.println ("******************************************************************");
	System.out.println (gf.formatObj("Salary Report", 65, false));
	System.out.println ("******************************************************************");

	// Create the header row for Salary Report
	System.out.println ("__________________________________________________________________");
	System.out.println (gf.formatObj("EmplID", sf.emplIdWidth, sf.emplIdJL) +
				    gf.formatObj("Name", sf.nameWidth, sf.nameJL) +
				    gf.formatObj("Employee Type", sf.emplTypeWidth, sf.emplTypeJL) +
				    gf.formatObj("Salary", sf.salWidth, sf.salJL) +
				    gf.formatObj("Limit", sf.limitWidth, sf.limitJL) +
				    gf.formatObj("Tax Rate", sf.taxWidth,sf.taxJL));
	System.out.println ("___________________________________________________________________");
	double totalSal= 0.0 ;
	
	    for (int i = 0; i < empl.length; i++)
	    {
		    double sal = empl[i].getSalary();
		    totalSal += sal ;
		    sf.formatObj(empl[i]);
	    }

        // Now the Footer for Salary Report

        System.out.println ("___________________________________________________________________");
	System.out.println ("\t    "+ gf.formatObj("Totals", sf.nameWidth, sf.nameJL) + "\t\t\t"+
			    gf.formatObj(new Double(totalSal), sf.salWidth, sf.salJL));
        System.out.println ("___________________________________________________________________");

	System.out.println ("\n\n\n");

	// Create the sales report header banner
	System.out.println ("******************************************************************");
	System.out.println (gf.formatObj("Sales  Report", 65, false));
	System.out.println ("******************************************************************");

	// Create the header row for Sales Report
	System.out.println ("__________________________________________________________________");
	System.out.println (gf.formatObj("EmplID", sf.emplIdWidth, sf.emplIdJL) +
			    gf.formatObj("Name", sf.nameWidth, sf.nameJL) +
			    gf.formatObj("Amount Sold", sf.soldWidth, sf.soldJL) + 
			    gf.formatObj("Commission", sf.comWidth, sf.comJL)); 
	System.out.println ("___________________________________________________________________");

	double totalSold =0.0, totalCom = 0.0;
	sf.setSalesReport (true);
	
	for (int i = 0 ; i < empl.length; i++){
		if (empl[i] instanceof SalesAssociate){
			SalesAssociate sa = (SalesAssociate) empl[i]; 
			double sold = sa.getAmountSold();
			double com = sold * sa.getCommissionRate();
			totalSold += sold;
			totalCom += com;
			sf.formatObj(empl[i]);

		}

	}
        // Now the Footer for Sales Report
	System.out.println ("___________________________________________________________________");
	System.out.println ("\t    " + gf.formatObj("Totals", sf.nameWidth, sf.nameJL) +
			    gf.formatObj(totalSold, sf.soldWidth, sf.soldJL) +
			    gf.formatObj(totalCom, sf.comWidth, sf.comJL )); 
	System.out.println ("___________________________________________________________________");

    }
}
