public class Pointers{

	public static void main (String[] args){
		String str = "Foo";
		String str2;
		String[] array  = new String[4];
		System.out.println ("String is " + str);
		str2 = processStr (str);
		array[0] = "Foos";
		array[1] = "Ball";
		array[2] = "Foos2";
		array[3] = "Ball2";
		System.out.println ("Array Elements are " + array[0] + array[1] + array[2] + array[3]);

		array = processArray (array);
		System.out.println ("Array Elements are " + array[0] + array[1] + array[2] + array[3]);
		System.out.println ("But in calling function it is " + str);
		System.out.println ("When it should be " + str2);

	}

public static	String processStr ( String str){
		str = "Bar";
		System.out.println ("Just changed it to " + str);
		return (str);
	}

public static	String[] processArray ( String[] strArray){
	strArray[0] = "Foo";
	strArray[1] = "Bar";
	strArray[2] = "Foo2";
	strArray[3] = "Bar2";

	System.out.println ("Array Elements are " + strArray[0] + strArray[1] + strArray[2] + strArray[3]);
	return (strArray);
}
	
}