public class MyThread2 implements Runnable{
	public void run(){
		for (int i = 1; i <=3; i++){
			System.out.println ("Th2: i "  + i);
		}
		System.out.println ("Thr2: Ending Thr2");
	}
}