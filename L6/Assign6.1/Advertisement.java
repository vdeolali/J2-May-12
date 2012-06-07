public class Advertisement extends Thread
{
	String message;

	Advertisement () {}
	Advertisement (String message){
		this.message = message;
	}

	public void setMessage(String message){
		this.message = message; 
	}
	public void run()
		{
			System.out.println ("My Name is " + getName());
			while (true)
			{
				try
				{
					System.out.print(message);
					sleep(1000);
				}
				catch (InterruptedException e)
				{
					System.out.println("Exception caught: " + e.getMessage());
					break; 
				}
			}
		}
}