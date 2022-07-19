package Array;

public class ClonningArray {
	public static void main(String[] args, int i) {
int[] arr= { 4,44,5,6 };
System.out.println("print the actual array");
for(int i1:arr)
	System.out.println("print the clone array");
int carr[]=arr.clone();
for(int i1:arr)
	System.out.println(i1);
System.out.println("both or equal or not");
System.out.println("arr==carr");

	
}
}
