import java.util.Scanner;
import java.io.*;

public class TestAdvt
{
    public static void main (String[] args)
    {
	    String advert;
	    Advertisement advt= null;
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	    while (true){
		    System.out.println ("Please enter the advertisement message to be displayed (enter 'n' to exit):\n");
		    try {
			    advert = br.readLine();
			    if (advert.equals("\\r") || advert.equals("\\n") || advert.equals("")){
//				    System.out.println ("Return Key" );
				    if (advt != null)
					    advt.interrupt();
			    }else if (advert.charAt(0) == 'n') {
// 				    System.out.println ("Goodbye");
				    System.exit(0);

			    }else {
//				    System.out.println ("Displaying" + advert);
				    if (advt != null){
//					    System.out.println ("Next Time");
					    if (advt.isInterrupted()) 
						    advt.start();
					    else{
						    advt = new Advertisement (advert);
						    advt.start();
					    }
					    
				    } else {
//					    System.out.println ("First Time");
					    advt = new Advertisement(advert);
					    advt.start();
				    }
//				    advt.setMessage(advert);
			    }

		    } catch (IOException e) { System.exit(0); }
	    }
    }
}