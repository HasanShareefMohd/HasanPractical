package String;

public class ToString {
	int rollno;
	String name,addr;
	
	ToString(int rollno, String name, String addr){
		this.rollno= rollno;
		this.name= name;
		this.addr= addr;
		
		
	}
	public String toString() {
		return super.toString();
	}
	public static void main(String[] args) {
		ToString s1 = new ToString(1, "ashu", "hyd");
		ToString s2 = new ToString(2, "hasan", "mumbai");
		System.out.println(s1);
		System.out.println(s2);
		
	}

}
