package StringDemo;

public class StringequalsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String s="Kiran";
		String s1="Nabi";
		String s2="KIRAN";
		String s3=new String("Nabi");
		
		System.out.println(s.equals(s3));//
		System.out.println(s1.equals(s3));//
		System.out.println(s.equals(s2));//
		
		System.out.println(s.equalsIgnoreCase(s2));
		System.out.println(s1.equals(s3));
		

	}

}
