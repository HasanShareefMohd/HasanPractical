package Thread;

public class DeadLockExp {
	int i;
	boolean valueset=false;
	synchronized void producer(int i) {
		if(valueset)
			try {
				wait();
			}
		catch(Exception e) {
			System.out.println(e);
			
		}
		this.i=i;
		valueset=true;
		System.out.println("data production done"+1);
		notify();}
		synchronized int consume() {
			if(valueset)
				try {
					wait();
				}
			catch(Exception e) {
				System.out.println(e);
				
			
			System.out.println("data consume"+1);
			notify();
			return i;
		}
			return i;
	}

}

