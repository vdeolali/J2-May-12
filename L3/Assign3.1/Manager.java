public class Manager extends Employee {

	private int[] salesAssociateEmplIds;

	Manager (int[] salesAssociateEmplIds, int emplId, String firstName, String lastName, double salary){
		super(emplId, firstName, lastName, salary);
		this.salesAssociateEmplIds = salesAssociateEmplIds;
		updateDerivedAttrs();
	}

	void setSalesAssociateEmplId (int[] salesAssociateEmplIds){
		this.salesAssociateEmplIds = salesAssociateEmplIds;
	}

	int[] getSalesAssociateEmplId (){
		return salesAssociateEmplIds;
	}

	public void updateDerivedAttrs(){
		super.emplTypeDescr = "Manager";
		super.contributionLimit = 25;
		if (super.getSalary() > 3500.0){
			super.taxRate = 0.35;
		} else {
			super.taxRate = 0.18; 
		}
	}
}