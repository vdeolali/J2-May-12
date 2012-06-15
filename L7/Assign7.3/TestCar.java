import java.util.List;
import java.util.Iterator;
import java.util.Collections;
import java.util.Scanner;
import java.util.*;

public class TestCar{
    public static void main(String[] args){

	String choice;

	Scanner scan = new Scanner (System.in);
	CarComparator ccomp = new CarComparator();
	List<Car> carList = CarUtil.readCarList("cars.txt");
	Iterator <Car> it=carList.iterator();
	HashMap<String, SortedSet<Car>> makeSetMap = new HashMap<String, SortedSet<Car>>();
	TreeMap<Integer, String>  makeMap = new TreeMap <Integer, String>(); 
	SortedSet<Car> carSortedSet  = new TreeSet <Car>();

	ccomp.setSortType(1);
	Collections.sort(carList,  ccomp);
	it=carList.iterator();
	int makeCount = 1; 

	String  make="" , makePrev= "";
	while (true) {
	    System.out.println ("\n\nPlease select report based on Car Make: \n"); 
	    while (it.hasNext()){
		Car c = it.next();
		makePrev = make;
		make = c.getMake();
		//	    System.out.println (make);
		if (!(make.equals(makePrev)) && !makePrev.equals("")){
		    //		    System.out.println(" Done with " + makePrev + "New  " + make);
		    makeSetMap.put(makePrev, carSortedSet);
		    makeMap.put(new Integer(makeCount), makePrev);
		    carSortedSet = new TreeSet <Car>();
		    //		System.out.println (makeCount+ "  :  " + makePrev);
		    makeCount++;
		}
		carSortedSet.add(c);
	    }
	    makeSetMap.put (make, carSortedSet);
	    makeMap.put( new Integer(makeCount), make);
	
	    Set<Integer> keyset = makeMap.keySet();
	    for (Iterator i = keyset.iterator(); i.hasNext();){
		Integer key = (Integer) i.next();
		String value = (String) makeMap.get(key);
		System.out.println (key + "  :  " + value); 
	    }

	    System.out.println ("0" + "  :  " + "Exit"); 
	    choice = scan.nextLine();
	    int key=0;
	    switch (choice){
	    case "0":
		key=0;
		System.out.println ("Goodbye");
		System.exit(0);
	    default:
		key = Integer.parseInt(choice); 
		System.out.println ("Selected" + makeMap.get(key));
		break; 
	    }
	

	    //	Collections.sort(carList,  ccomp);
	    System.out.println ("\n\n**** Car Report   " + makeMap.get(key) + " ****");
	    System.out.println ("__________________________");
	    System.out.println ("Make \t Model \t Age \t Miles \t Price");
	    System.out.println ("__________________________");

	    carSortedSet = makeSetMap.get(makeMap.get(key));
	
	    for (Iterator i = carSortedSet.iterator(); i.hasNext();){
		Car c = (Car) i.next();
		System.out.println (c.getMake()+ "\t" + c.getModel()+ "\t" + c.getAge()+ "\t" + c.getMiles() + "\t" + c.getPrice());
	    }
	}
    }
}
		