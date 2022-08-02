package ExceptionHandling;

import java.util.Scanner;

public class CustomException {
	public static void checkage(int age) throws Invalidageexception{
		if(age<=18 || age >=25) {
			throw new Invalidageexception("Invalid age for entolling in java course");
			
		}else {
			System.out.println("proper age for entolling in java course");
			
		}
	}
	
	
	public static void main(String[] args) {
		CustomException c= new CustomException();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your age");
		int age=sc.nextInt();
		c.checkage(17);
		System.out.println("rest of the code....");
		
		
	}

}