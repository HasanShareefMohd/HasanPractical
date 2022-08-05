package Thread;

public class ThreadClassWithString {
	public static void main(String[] args) {
		Thread obj=new Thread("first thread");
		obj.start();
		String s=obj.getName();
		System.out.println(s);
	}

}
