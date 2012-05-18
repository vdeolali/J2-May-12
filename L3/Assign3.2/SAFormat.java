public class SAFormat extends EmployeeFormat implements SAInterface {
	Boolean  salesReport = false;


	void setSalesReport (Boolean SR){
		this.salesReport = SR;
	}

	public void formatObj(Employee sae){
		String slsRepRow = "" ;
		
		if (sae instanceof SalesAssociate && this.salesReport){
			SalesAssociate sa = (SalesAssociate) sae; 
			double sold = sa.getAmountSold();
			double com = sold * sa.getCommissionRate();

			slsRepRow  += super.formatObj(new Integer(sa.getEmplId()), emplIdWidth, emplIdJL); 
			slsRepRow  += super.formatObj(sa.concatName(), nameWidth, nameJL);
			slsRepRow += super.formatObj(new Double(sold),soldWidth, soldJL);
			slsRepRow  += super.formatObj( new Double(com), comWidth, comJL);
			System.out.println (slsRepRow);
		}else {
			super.formatObj(sae);
		}
	}
}