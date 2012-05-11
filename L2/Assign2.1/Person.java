// ---- Begin Person.java --------
public class Person
{
    String firstName;
    String lastName;
    public Person(String firstName, String lastName)
    {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public String concatName() { return lastName + ", " + firstName; }
}
// ---- End Person.java --------