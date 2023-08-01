package CollectionDemo;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		ArrayList<String> al=new ArrayList<String>();
		
		al.add("MI");
		al.add("Apple");
		al.add("OnePlus");
		
		ArrayList<String> al2=new ArrayList<String>();
		
		al2.add("Samsong");
		al2.add("MOTO");
		al2.add("Apple");
	
		al.addAll(al2);
		
//		al.remove(0);
//		al.removeAll(al2);
//		al.clear();
//		
//	System.out.println(al2.size());
//	
//	System.out.println(al.get(1));
//	
//	System.out.println(al.isEmpty());
//	
//	System.out.println(al.contains("AAA"));
		
		System.out.println(al.containsAll(al2));
		
		System.out.println(al.retainAll(al2));

		
		System.out.println(al);

	}

}
