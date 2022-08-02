package ExceptionHandling;

public class ThrowsExp {
	public static void checknum (int num) {
		if(num>0) {
			throw new ArithmeticException("Number is negative");
			
		}else {
			System.out.println("execution perfectly");
			
		}
	}

	
	public static void main(String[] args) {
		ThrowsExp te=new ThrowsExp();
			te.checknum(6);
			System.out.println("executed");

	
	
		
		}	
	
		

}
