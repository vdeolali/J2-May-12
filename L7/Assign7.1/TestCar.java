import java.util.List;
import java.util.Iterator;
import java.util.Collections;

public class TestCar{
    public static void main(String[] args){
	List<Car> carList = CarUtil.readCarList("cars.txt");

	Iterator <Car> it=carList.iterator();

	System.out.println ("**** BEFORE SORT ****");
	System.out.println ("__________________________");
	System.out.println ("Make \t Model \t Age \t Miles \t Price");
	System.out.println ("__________________________");

	while (it.hasNext()){
	    Car c = it.next();
    	    System.out.println (c.getMake()+ "\t" + c.getModel()+ "\t" + c.getAge()+ "\t" + c.getMiles() + "\t" + c.getPrice());

	}
	

	Collections.sort(carList);
	System.out.println ("**** AFTER SORT ****");
	System.out.println ("__________________________");
	System.out.println ("Make \t Model \t Age \t Miles \t Price");
	System.out.println ("__________________________");
	it = carList.iterator();
	while (it.hasNext()){
    	
	    Car c = it.next();
    	    System.out.println (c.getMake()+ "\t" + c.getModel()+ "\t" + c.getAge()+ "\t" + c.getMiles() + "\t" + c.getPrice());
	}
	
    }
}
		