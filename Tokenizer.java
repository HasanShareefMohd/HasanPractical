package String;

import java.util.StringTokenizer;

public class Tokenizer {


public static void my() {
	StringTokenizer t=new StringTokenizer("Anudip foundation skill and carrer development centre", " ");
	
	while(t.hasMoreTokens());{
		System.out.println(t.nextToken(","));{
			
			StringTokenizer t1=new StringTokenizer("I am Hasan,Staying at Karimnagar")	;
			while(t1.hasMoreTokens());{
				System.out.println(t1.nextToken(","));
			}
		}
	}
	
	}
	public static void main(String[] args) {
		my();
	}
}

