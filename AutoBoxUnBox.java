package Wrapper;

import java.util.ArrayList;

public class AutoBoxUnBox {
	public static void main(String[] args) {
		ArrayList<Integer>a1 = new ArrayList<Integer>();
		a1.add(5);
		a1.add(2);
		System.out.println("ArrayList:"+a1);
		int a=a1.get(0);
		System.out.println("value of index 0:"+a);
		
		
	}

}
