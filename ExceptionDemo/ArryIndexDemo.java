package ExceptionDemo;

public class ArryIndexDemo {

	public static void main(String[] args) {
		System.out.println("program is Start");
		
		try {
			
			int [] num= {1,2,4,6};
			int res=num[4];
			System.out.println(res);
				
		} catch (ArrayIndexOutOfBoundsException e) {
			
			System.out.println("Array out of length"+e.getMessage());
			
		}
		finally {
			System.out.println("program is done");
		}

	}

}
