package Thread;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class ArrayRemoveArrayList {
	//private static ArrayList<String> al;
	

	public static void main(String args[]) {
		ArrayList<String> al = new ArrayList<>();
		
		al.add("Apple");// adding elements in array list
		al.add("Banana");
		al.add("Orange");
		al.add("Grapes");
		al.add("Papaya");
		
		System.out.println(al);// before shuffling the array list elements
		
		Collections.shuffle(al);// after shuffling the array list elements
		System.out.println(al);
		al.remove(2);
		
		System.out.println(al);// after removing 3rd element
		
		
	}

}