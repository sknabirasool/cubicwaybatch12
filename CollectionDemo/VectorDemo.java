package CollectionDemo;

import java.util.*;

public class VectorDemo {

	public static void main(String[] args) {
		
		Vector v1=new Vector();
		
		v1.add("Kiran");
		v1.add("Kiran");
		v1.add("DEVA");
		v1.add("BINDU");
		v1.add("Kiran");
		
	
//		System.out.println(v1.get(0));
		v1.set(0,"XYZ");
//		System.out.println(v1.get(0));
		
		Vector v2=new Vector();
		
		v2.add("BANANA");
		v2.add("Mango");
		
		System.out.println(v1);
		System.out.println(v2);
		
		v1.addAll(v2);
		System.out.println(v1);

		System.out.println(v1);
		
		System.out.println(v1.size());
		System.out.println(v1.capacity());
	
		System.out.println(v1);
		
		System.out.println(v1.contains("XYZ"));
		System.out.println(v1.containsAll(v2));

		System.out.println(v2.isEmpty());
		
		System.out.println(v1.retainAll(v2));
		
		
	
		
		
		
		
		
		
		
		
		

	

	}

}
