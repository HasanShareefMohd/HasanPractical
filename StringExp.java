package Wrapper;

public class StringExp {
	public void show() {
		char [] arr= {'J','a','v','a'};
		String s =new String(arr);
		System.out.println("the value is:"+s);
		System.out.println(arr);
		
	}
	public void myfunction() {
		String n="hasan";
		String n1="Shareef";
		String n2=new String("hasan");
	}
	public static void main(String[]...args) {
		StringExp se=new StringExp();
		se.show();
		se.myfunction();
		
	}

}
