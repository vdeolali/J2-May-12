public class EmployeeFormat extends GenericFormat implements EmployeeInterface {

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
		System.out.println ("Yeow");
		salRepRow  += super.formatObj(new Integer(empl.getEmplId()), emplIdWidth, emplIdJL); 
		salRepRow  += super.formatObj(empl.concatName(), nameWidth, nameJL);
		salRepRow  += super.formatObj(empl.getEmplTypeDescr(), emplTypeWidth, emplTypeJL);
		salRepRow  += super.formatObj(new Double(sal), salWidth, salJL);
		salRepRow  += super.formatObj(empl.getContributionLimit(), limitWidth, limitJL);
		salRepRow  += super.formatObj(empl.getTaxRate(), taxWidth, taxJL);

		System.out.println (salRepRow);
	}

}