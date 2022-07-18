package Array;

import java.util.Scanner;

public class UsingScannerClass {
	 public static void main(String[] args) {
		 Scanner scr=new Scanner(System.in);
		 System.out.println("enter array length");
		 int arrLength=scr.nextInt();
		 int[]anArray=new int[arrLength];
		 System.out.println("enter array elementy");
	//int inti;
	//int i = 0;
	for(int i=0;i<arrLength;i++) 
	{
	 anArray[i]=scr.nextInt();
		}
System.out.println("display array list:");
for(int i=0;i<arrLength;i++)
{
	System.out.println(anArray[i]+" ");
}
}
	

}