public class TestEmployee {

	public static double  parseSalary (String sal) throws NegativeSalaryException{
		double salary = Double.parseDouble(sal);

		if (salary > 0.0) {
			return (salary); 
		} else {
			throw (new NegativeSalaryException("Please provide a non-negative salary value")); 
		}
	}
	
	public static void main (String[] args){

		try {
		String fn = args[0];
		String ln = args[1];
//		Double sal = Double.parseDouble(args[2]);
		Double sal = parseSalary(args[2]);
		Employee empl = new Employee (fn, ln, sal);
		System.out.println (empl.concatName() +"  " +  empl.salary);
		
		}catch (NumberFormatException e){
			System.out.println ("Invalid Argument:  " + args[2] + " \n Please provide a numeric value input for salary");
			System.exit(0);
		}catch (ArrayIndexOutOfBoundsException e){
			System.out.println ("No Arguments Given:  " + "\n Usage: TestEmployee Firstname Lastname Salary ");
			System.exit(0);
		}catch (NegativeSalaryException e){
			System.out.println ("An error was found in the input data: " + "Details are: " + e.getMessage());
		}catch (Exception e){
			System.out.println ("Exception: " + e.getMessage());
			e.printStackTrace();
		}
	}
}