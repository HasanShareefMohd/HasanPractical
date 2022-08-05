package Thread;
import java.io.FileOutputStream;


public class FileOutputStream {
	
	
	
	public static void main(String argd[]) {
		try {
			FileOutputStream obj= new FileOutputStream();
			obj.write(65);
			String s="Hello World";
			byte b[]=s.getBytes();
			
			
			obj.write(b);
			obj.close();
			System.out.print("done");
			
		}
		catch(Exception e) {
			System.out.print(e);
		}
}

}
