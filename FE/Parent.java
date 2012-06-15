public class Parent{
	String name; 

Parent () { System.out.println (" In default contructor of Parent"); }

Parent (String name) {
	this.name = name; 
	System.out.println ("in matching contructor of parent"); 
}

}