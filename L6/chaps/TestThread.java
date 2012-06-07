public class TestThread {
	public static void main (String[] args){
		Thread thr = new MyThread();
		Thread thr2 = new MyThread();
		thr.start();
		try {
			thr.sleep(1000);
		
		}catch (InterruptedException e){
			e.printStackTrace();
		}
		thr2.setDaemon(true);
		thr2.start();
	}
}