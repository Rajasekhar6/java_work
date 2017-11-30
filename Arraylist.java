package javaprograms;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList al = new ArrayList();
		al.add("a");
		al.add(1,"b");	
		al.add("8");
		System.out.println(al);
		
		
		LinkedHashSet lh = new LinkedHashSet();
		lh.add(2);
		lh.add(3);
		lh.add(5);
		lh.add(4);
		
		System.out.println(lh);
		
		
		TreeSet ts = new TreeSet();
		
		
		ts.add(4);
		ts.add(9);
		ts.add(2);
		ts.add(1);
		ts.add(10);
		ts.add(9);
		
		System.out.println(ts);
		
	}

}
