package Thread;

public class ThreadEithRunnableString implements Runnable {
public void run() {
	System.out.println("Thread is running");
}
public static void main(String[] args) {
	Runnable r= new ThreadEithRunnableString();
	Thread t= new Thread(r, "First thread.");
	t.start();
	String s=t.getName();
	System.out.println(s);
	
}
}
