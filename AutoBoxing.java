package Wrapper;

public class AutoBoxing {
	public static void main(String[] args) {
		int a=10;
		Integer i=Integer.valueOf(a);
		Integer j=a;
		System.out.println(a+" "+i+" "+j);
	}

}
