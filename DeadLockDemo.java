package Thread;

public class DeadLockDemo {
	public static void main(String args[]) {
		final String r1="Hasan";
		final String r2="Shareef";
		Thread t1=new Thread() {
			public void run() {
				synchronized(r1) {
					System.out.println("Thread 1": locked r1);
					try { Thread.sleep(100);} catch (Exception e) {
					}				
					}
			}
			
	
			synchronized(r2) {
				System.out.println("Thread 2": locked r2);
				try { Thread.sleep(100);} catch (Exception e) {
				}				}
			Thread t2=new Thread() {
				public void run() {
					synchronized(r1) {
						System.out.println("Thread 1": locked r1);
						try { Thread.sleep(100);} catch (Exception e) {
						}				}
				
		
				synchronized(r2) {
					System.out.println("Thread 2": locked r2);
					try { Thread.sleep(100);} catch (Exception e) {
					}	
					}
				}
			}
			
			t1.start();
			t2.start();
			}
		}
			
		