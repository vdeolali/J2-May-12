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

	    System.out.println (" *********************************************\n");
	    System.out.println ("\t\t Salary Report \t\t\n");
	    System.out.println (" *********************************************\n");
	    System.out.println ("________________________________________\n");
	    System.out.println ("Empl Id\t" + "Name\t" + "Employee Type\t" + "Salary\t");
	    System.out.println ("________________________________________\n");


	    for (int i = 0; i < empl.length; i++){
		    System.out.println (formatObj(empl[i].getEmplId(), 10, false) + formatObj(empl[i].concatName(), 15, true)+ formatObj(empl[i].getEmplTypeDescr(), 20, false) + formatObj(formatter.format(empl[i].getSalary()), 10, false));
		    tWages += empl[i].getSalary();
	    }

	    System.out.println ("\n___________________________________________\n");
	    System.out.println (" \t\t Total Wages: \t\t\t" + formatter.format(tWages));
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
			    System.out.println (formatObj(empl[i].getEmplId(), 10, false)+  formatObj(empl[i].concatName(), 15, true)  + formatObj (formatter.format(amountS), 20, false)  + formatObj( formatter.format(comm),15, false));
		    }
	    }
	    System.out.println ("___________________________________________\n");
	    System.out.println (" \t Totals:\t" + formatObj(formatter.format(amountS),20,false) + formatObj( formatter.format(commT),15, false));
	    System.out.println ("___________________________________________\n");

 
    }

	    static String formatObj(Object obj, int totalWidth, boolean justifyLeft){
		    int diff = totalWidth - obj.toString().length();
		    int leftSpaces = 0, rightSpaces = 0;
		    String str = "";
		    if (diff > 0) 
		    {
			    if (justifyLeft) rightSpaces = diff; // pad only on the right
			    else // centralize if justifyLeft is false
			    {
				    leftSpaces = diff / 2;
				    rightSpaces = diff - leftSpaces;
			    } 
			    for (int i = 1; i <= leftSpaces; i++) str += " ";
			    str += obj.toString();
			    for (int i = 1; i <= rightSpaces; i++) str += " ";
		    }
		    return str;
	    }
}
