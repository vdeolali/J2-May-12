package customtypes;

public class Customer
{
    public String firstName;
     String lastName;
     double orderValue;

    // Default Constructor
	/*
    Customer()
    {
        firstName = "undefined";
        lastName = "undefined";
        orderValue = 0.0;
	} */

    // Inuit Constructor
    public Customer(String firstName, String lastName, double orderValue)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.orderValue = orderValue;
    }

	public    String concatName()
    {
        String strResult = lastName + ", " + firstName;
        return strResult;
    }

	public String getFirstName(){
		return firstName;
	}

	public String getLastName(){
		return lastName;
	}

public	double  getOrderValue(){
		return orderValue;
	}
	
	public void setFirstName (String firstName){
		this.firstName = firstName;
	}

	public void setLastName (String lastName){
		this.lastName = lastName;
	}
}