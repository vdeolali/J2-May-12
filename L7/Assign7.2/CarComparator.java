import java.util.Comparator; 

public class CarComparator implements Comparator<Car> {
    int sortType;

    void setSortType(int sortType){
	this.sortType = sortType;
    }
    public int compare (Car c1, Car c2){
	//	System.out.println ("Sorting by Type" + sortType);
	switch (sortType){
	case 1:
	    return c1.getMake().compareTo(c2.getMake());
	case 2:
	    return c1.getModel().compareTo(c2.getModel());
	case 3:
	    Integer inObj1 = new Integer (c1.getAge());
	    Integer inObj2 = new Integer (c2.getAge());
	  
	    return inObj1.compareTo(inObj2);
    	case 4:
	    Integer inObj3 = new Integer (c1.getMiles());
	    Integer inObj4 = new Integer (c2.getMiles());
	    return inObj3.compareTo(inObj4);
	case 5:
	    Double dObj1 = new Double (c1.getPrice());
	    Double dObj2 = new Double (c2.getPrice());
	    return dObj1.compareTo(dObj2);
	default:
	    return (0);
	}	    
    }
}