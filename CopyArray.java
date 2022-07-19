package Array;

public class CopyArray {
	public static void main(String[] args, int i) {
		char[]copyForm= {'c', 'e', 'f'};
		char[]copyTo=new char[2];
		System.arraycopy(copyForm, 0, copyTo, 0, 2);
		System.out.println(String.copyValueOf(copyTo));
		
	}

}
