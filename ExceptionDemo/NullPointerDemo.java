package ExceptionDemo;

public class NullPointerDemo {

	public static void main(String[] args) {
	
		String str=null;
		
		try {
		int len=str.length();
		
		System.out.println(len);
		}
		catch(NullPointerException e)
		{
			System.out.println(e.getMessage());
		}

	}

}
