public class MyThread extends Thread{
	public void run(){
		for (int i = 0; i < 3 ; i++){
			System.out.println ("in MyThread: i = " + i);
		}
		System.out.println ("ending MyThread\n");
	}
}