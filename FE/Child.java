public class Child extends Parent {
	// default constructor in Child 

public Child() { System.out.println ("In default contructor of child"); }

public  Child (String name){
	super(name);
	System.out.println ("in specific constructor of child"); 
}
}