public class TestThread2 {
	public static void main (String[] args){
		System.out.println ("In Main");
		//Thread thr = new Thread(new MyThread2());
		MyThread2 thr = new MyThread2();
		thr.start();
		System.out.println ("Out of Main");
	}
}