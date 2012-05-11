public class SalesAssociate extends Employee {
	private double amountSold ;
	private double commissionRate;

	SalesAssociate(double amountSold, double commissionRate, int emplId, String firstName, String lastName, double salary){
		super (emplId, firstName, lastName, salary);
		super.emplTypeDescr = "Sales Associate";
		this.amountSold = amountSold;
		this.commissionRate = commissionRate;
		
	}

	double getAmountSold (){
		return this.amountSold;
        }

	double getCommissionRate(){
		return this.commissionRate;
	}

	void setAmountSold (double amountSold){
		this.amountSold = amountSold;
	}

	void setCommissionRate (double commissionRate){
		this.commissionRate = commissionRate;
	}
}