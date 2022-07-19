package Array;

public class JaggedArray {
	public static void main(String[] args, int i) {
		
		int arr[][]=new int[3][];
		arr[0]=new int[3];
		arr[1]=new int[4];
		arr[2]=new int[2];
		int count=0;
		for(int i1=0;i1<arr.length;i1++)
			for(int j=0;j<arr[i1].length;j++)
				arr[i1][j]=count++;
		for(int i1=0;i1<arr.length;i1++)
			for(int j=0;j<arr[i1].length;j++){
			System.out.println(arr[i1][j]+" ");
		
		{
			
		System.out.println();
		
	}

	}
	}}



