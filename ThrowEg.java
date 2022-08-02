package ExceptionHandling;

public class ThrowEg {
	public static void myDisplay (int a) throws ArithmeticException{
		if(a>13) {
			throw new ArithmeticException("person not eligible for vote");
			
		}else {
			System.out.println("person not eligible for vote");
			
		}
	}
	
	public static void main(String[] args) {
		Eligible(13);
		System.out.println("rest of the code....");
		
	}

	private static void Eligible(int i) {
		// TODO Auto-generated method stub
		
	}

	
		
	}



