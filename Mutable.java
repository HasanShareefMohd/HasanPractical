package Wrapper;

public class Mutable {
	public static void my() {
		StringBuffer s=new StringBuffer("hello");
		s.append("world");
		System.out.println("String is :+s");
		s.insert(2, "Ashu");
		System.out.println("String is :+s");
		s.replace(1, 3, "java");
		System.out.println("replace is :+s");
		StringBuffer s1=new StringBuffer("world");
		s1.replace(1, 3, "java");
		System.out.println("replace is :+s1");
		s1.delete(1, 3);
		System.out.println("delete is :+s1");
		s1.reverse();
		System.out.println("reverse is :+s1");
		
	}
	public static void main(String[]...args) {
		my();
	}
 
}
