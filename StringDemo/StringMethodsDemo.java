package StringDemo;

public class StringMethodsDemo {

	public static void main(String[] args) {
		//+ operator
		
		String firstName="Kiran Kumar";
		String middleName="xyz";
		String lastName="Muppala";
		
		String fullName=firstName+lastName;
		
//		System.out.println("Full Name "+fullName);
		
	
		String fn=firstName.concat(lastName);
		System.out.println("Full Name - "+fn);
		
		
		String s=50+100+"data"+1000;
		
//		System.out.println(s);
		
		
		// String class Methods  KirAN KuMar MulPpLa
		
		String str="Kiran Kumar";
		
	//tolowercase
//System.out.println("String convert to lower case "+str.toLowerCase());
//
//System.out.println("UpperCase"+str.toUpperCase());

System.out.println(str.trim());

System.out.println(str.startsWith("Ki"));
System.out.println(str.endsWith("N"));

System.out.println(str.charAt(4));

String sr="java is High level Programming java Language";

String rep=sr.replace("java","kava");
System.out.println(rep);


int len=sr.length();

System.out.println(len);

System.out.println(str.substring(3,8));



		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		


	}

}
