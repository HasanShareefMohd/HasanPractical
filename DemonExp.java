package Thread;

public class DemonExp extends Thread {
	public void run() {
		if(Thread.currentThread().isDaemon()) {
			System.out.println("i am demon thread");
			
		}
		else {
			System.out.println("i am user thread");
		}
	}
	public static void main(String[] args) {
		DemonExp d1=new  DemonExp();
		DemonExp d2=new  DemonExp();
		DemonExp d3=new  DemonExp();
		 d2.setDaemon(true);
		 d1.start();
		 d1.start();
		 d3.start();

}
}
