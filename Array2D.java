package Array;

public class Array2D {
	public static void main(String[] args, int i) {
		//int arr[][]= {{1,2,3,},{2,3,4},{4,4,6}};
		//for(int i=0;i<3;i++);
		//for(int j=0;j<3;j++) 
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
			//int i;
			//System.out.println(arr[i][j]+" ");
		}
		System.out.println();
		
	}

	}
}


