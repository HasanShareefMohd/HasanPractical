package Thread;
//public static void main(String[] args) {

public class DeadLockProducer extends Thread {
	
DeadLockExp d;
public void producer(DeadLockExp d) {
	this.d=d;
}
public void run() {
	for(int j=1;j<5;j++) {
		d.producer(j);
	}
}
}

class consumer extends Thread{
	DeadLockExp d;
	public void producer(DeadLockExp d) {
		this.d=d;
	}
	public void run() {
		for(int k=1;k<5;k++) {
			d.producer(k);
	
}
	}
	}
