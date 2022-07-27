package String;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
	public static void main(String[] args) {
		Pattern p=Pattern.compile(".a");
		Matcher m=p.matcher("ma");
		boolean b=m.matches();
		boolean bb=Pattern.compile("..m").matcher("aam").matches();
		boolean b1=Pattern.matches("[a-zA-Z0-9] {8,}","Ashu123");
		boolean b2=Pattern.matches("[6789] [0-9] {1,}","12456767");
		boolean b3=Pattern.matches("[a-zA-Z0-9*] a-zA-Z0-9*]*+//[a-z] {3}","Ashu123");
		boolean b4=Pattern.matches("[a-zA-Z0-9+_'] {8,}","Ashu@123");
		System.out.println(b+" "+bb+" "+b1+" "+b2+" "+b3+ " "+b4+" ");
	}

}
