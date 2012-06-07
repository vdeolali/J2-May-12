public class NegativeSalaryException extends Exception {

	String  errorMessage;

	public NegativeSalaryException (){
		super ();
		errorMessage = "Negative number entered for salary"; 
	}

	public NegativeSalaryException (String s){
		super (s);
	}

	public String getErrorMessage (){
		return (errorMessage);
	}
}