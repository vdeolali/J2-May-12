public class Manager extends Employee {

	private int[] salesAssociateEmplIds;

	Manager (int[] salesAssociateEmplIds, int emplId, String firstName, String lastName, double salary){
		super(emplId, firstName, lastName, salary);
		super.emplTypeDescr = "Manager";
		this.salesAssociateEmplIds = salesAssociateEmplIds;
	}

	void setSalesAssociateEmplId (int[] salesAssociateEmplIds){
		this.salesAssociateEmplIds = salesAssociateEmplIds;
	}

	int[] getSalesAssociateEmplId (){
		return salesAssociateEmplIds;
	}
	
}