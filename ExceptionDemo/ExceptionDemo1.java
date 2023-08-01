package ExceptionDemo;

public class ExceptionDemo1 {

	public static void main(String[] args) {
	
		System.out.println("Program is Started");
		
		int num1=10;
		int num2=0;
		int res=0;
		
		res=num1/num2;
		try {
			res=num1/num2;
		} catch (ArithmeticException e) {
			
			System.out.println(e.getMessage());
		}
		
		System.out.println(res);
		System.out.println("Program finished");

	}

}
