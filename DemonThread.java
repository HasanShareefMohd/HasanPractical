package Thread;

public class DemonThread extends Thread {
	public void run() {
		if(Thread.currentThread().isDaemon()) {
			System.out.println("i am demon thread");
			
		}
		else {
			System.out.println("i am user thread");
		}
	}
	public static void main(String[] args) {
		 DemonThread d1=new  DemonThread();
		 DemonThread d2=new  DemonThread();
		 d1.setDaemon(true);
		 d1.start();
		 d2.start();
		// System.out.println("i am demon thread");
	}

}
