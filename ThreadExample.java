package Thread;

public class ThreadExample extends Thread{
	public void run() {
		for (int i=0; i<5; i++) {
			try {
				Thread.sleep(800);
			}
			catch(InterruptedException e) {
				System.out.println(e);
			}
				System.out.println(i);
				
			}
		System.out.println(Thread.currentThread().getName());
		}
		public static void main(String argd[]) {
			ThreadExample t=new ThreadExample();
			ThreadExample t1=new ThreadExample();
			ThreadExample t2=new ThreadExample();
			t2.setPriority(MAX_PRIORITY);
			System.out.println(t2.getPriority());
			System.out.println(Thread.currentThread().getPriority());
			t.start();
			t1.start();
			t2.start();
			//t.getName();
			t.setName("thread name");
			
		}
	}


