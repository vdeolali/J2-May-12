public class EmployeeFormat extends GenericFormat {

	final int emplIdWidth= 10 ;
	final int nameWidth = 15 ; 
	final int emplTypeWidth = 20 ; 
	final int salWidth  = 10 ;
	final int limitWidth = 6;
	final int taxWidth = 10 ;
	final int soldWidth = 20;
	final int comWidth = 15;

	final Boolean  emplIdJL= false ;
	final Boolean nameJL = true ; 
	final Boolean emplTypeJL = false; 
	final Boolean  salJL  = false ;
	final Boolean  limitJL = false;
	final Boolean  taxJL = false ;
	final Boolean  soldJL = false;
	final Boolean  comJL = false;

	public void formatObj(Employee empl){
		double totSal = 0.0, sal = 0.0;
		String salRepRow = "";
/* 		
//		System.out.println ("***************************************************");
//	System.out.println (super.formatObj("Salary Report", 65, false));
//		System.out.println ("***************************************************");
//		System.out.println ("___________________________________________________");
		System.out.println (super.formatObj("EmplID", emplIdWidth, emplIdJL) +
				    super.formatObj("Name", nameWidth, nameJL) +
				    super.formatObj("Employee Type", emplTypeWidth, emplTypeJL) +
				    super.formatObj("Salary", salWidth, salJL) +
				    super.formatObj("Limit", limitWidth, limitJL) +
				    super.formatObj("Tax Rate", taxWidth, taxJL));
//		System.out.println ("___________________________________________________");
*/
		sal = empl.getSalary();
		totSal += sal;
		
		salRepRow  += super.formatObj(new Integer(empl.getEmplId()), emplIdWidth, emplIdJL); 
		salRepRow  += super.formatObj(empl.concatName(), nameWidth, nameJL);
		salRepRow  += super.formatObj(empl.getEmplTypeDescr(), emplTypeWidth, emplTypeJL);
		salRepRow  += super.formatObj(new Double(sal), salWidth, salJL);
		salRepRow  += super.formatObj(empl.getContributionLimit(), limitWidth, limitJL);
		salRepRow  += super.formatObj(empl.getTaxRate(), taxWidth, taxJL);


		System.out.println (salRepRow);
	}

	public void formatObj(SalesAssociate sae, Boolean salesReport){
		String slsRepRow = "" ;
		double totSales = 0.0, totCom = 0.0;
		double sold = sae.getAmountSold();
		totSales += sold;
		double com = sold * sae.getCommissionRate();
		totCom += com; 
		
		if (salesReport){
			slsRepRow  += super.formatObj(new Integer(sae.getEmplId()), emplIdWidth, emplIdJL); 
			slsRepRow  += super.formatObj(sae.concatName(), nameWidth, nameJL);
			slsRepRow += super.formatObj(new Double(sold),soldWidth, soldJL);
			slsRepRow  += super.formatObj( new Double(com), comWidth, comJL);
			System.out.println (slsRepRow);
		}else {
			formatObj(sae);
		}
	}
}