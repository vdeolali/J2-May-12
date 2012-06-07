import java.io.*;
import java.util.Scanner;

class TestScanner
{
    public static void main (String[] args)
    {
        try
        {
            Scanner s = new Scanner(new File("TestTokens.txt"));
            System.out.println("Data read from input file:");
            String strLine = "";

            while (s.hasNextLine())
            {
                strLine = s.nextLine();
                Scanner s2 = new Scanner(strLine);

                int i = 1;
                String token = "", strFirstName = "", strLastName = "";
                int age = 0;
                double salary = 0.0;

                while (s2.hasNext())
                {
                    token = s2.next();

                    switch (i)
                    {
                        case 1: strFirstName = token; break;
                        case 2: strLastName = token; break;
                        case 3: age = Integer.parseInt(token); break;
                        case 4: salary = Double.parseDouble(token); break;
                    }
                    i++;
                }
                Employee empl = new Employee(strFirstName, strLastName, age, salary);

                System.out.println(empl.getFirstName() + " " + empl.getLastName()
                                + " " + empl.getAge() + " " + empl.getSalary());
                s2.close();
            }
            s.close();
        }
        catch (IOException e) { System.out.println("error: " + e.getMessage()); }
    }
}
