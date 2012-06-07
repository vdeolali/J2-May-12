import java.io.*;
import java.util.StringTokenizer;
class TestTokens
{
    public static void main (String[] args)
    {

	    File fTestTokens = new File ("TestTokens.txt");
	    File fReport = new File ("Report.txt");
	    BufferedReader  reader = null;
	    BufferedWriter  writer = null;
	    int row =0;
	    

	    try {
		    reader = new BufferedReader( new InputStreamReader (new FileInputStream (fTestTokens)));
		    writer = new BufferedWriter ( new OutputStreamWriter (new FileOutputStream (fReport)));
		    reader.mark(1000);
		    String str =  reader.readLine();
		    while (str != null){
			    row++;
			    str = reader.readLine();
		    }
		    String[] fname = new String[row];
		    String[] lname = new String[row];
		    String[] age = new String[row];
		    String[] sal = new String[row];
		    reader.reset();
		    str = reader.readLine();
		    String token = null;
		    int i =0 ; 
		    row = 0;

		    while (str != null){
			    StringTokenizer tokenizer = new StringTokenizer(str);
			    /*
			    writer.write (str);
			    writer.newLine();
			    */
			    i = 0 ;
			    while (tokenizer.hasMoreTokens()){ 
				    token = tokenizer.nextToken();
				    i++;
				    switch (i)
				    {
				    case 1:
					    fname[row] = token;
					    break;
				    case 2: 
					    lname[row] = token;
					    break;
				    case 3: 
					    age[row]= token ;
					    break;
				    case 4: 
					    sal[row] = token;
					    break;
				    }
			    }
			    row++;
			    str = reader.readLine();
		    }
//		    System.out.println (row);
		    for (i = 0; i < row ; i++) {
			    System.out.print (fname[i]+ " " ); 
			    System.out.print (lname[i]+ " " ); 
			    System.out.print (age[i] + " " ); 
			    System.out.println (sal[i]+ " ");
			    writer.write (fname[i]+ " " + lname[i] + " " +age[i]+ " " +sal[i]);
			    writer.newLine();
		    }
	    }catch (FileNotFoundException e){
		    System.out.println ("File " + fTestTokens.getAbsolutePath() + "Not Found!");
	    }catch (IOException e){
		    System.out.println ("IO Exception Found" + e);
	    } finally {
		    try {
		    writer.flush();
		    writer.close();
		    } catch (IOException e){
			    System.out.println ("IO Exception Found" + e);
			    e.printStackTrace();
		    }
	    }

    }

}