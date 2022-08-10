package Thread;

public class IllegalException extends Thread {
	public void run() {
		System.out.println("name:"+Thread.currentThread().getName());
		System.out.println("name:"+Thread.currentThread().isDaemon());
		
	}
	public static void main(String[] args) {
		IllegalException d1=new IllegalException();
		IllegalException d2=new  IllegalException();
	
		
		
		 d1.start();
		 d1.setDaemon(true);
		 d2.start();
		
	}

}


