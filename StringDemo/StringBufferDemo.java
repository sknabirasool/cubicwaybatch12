package StringDemo;

public class StringBufferDemo {

	public static void main(String[] args) {
		
		StringBuffer  sb=new StringBuffer("Hello");
		
		System.out.println(sb.capacity());
		sb.append(" Java Batch");
		
		sb.insert(6,"KIRAN1");
		System.out.println(sb);
		
		System.out.println(sb.toString());
		
		System.out.println(sb.length());
		System.out.println(sb.capacity());
		System.out.println(sb.charAt(4));
		System.out.println(sb.length());
		System.out.println(sb.substring(5));
		System.out.println(sb.substring(5, 10));
		System.out.println(sb.replace(3, 8,"nabi"));
		
		
		
	}

}
