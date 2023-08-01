package InputOutputDemo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferReaderDemo {

	public static void main(String[] args) {
		
		try {
			
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter Employee Name");
			String name=br.readLine();
			System.out.println("Enter Employee ID");
			
			int empid= Integer.parseInt(br.readLine());
			
			System.out.println("Employee Details");

			System.out.print("Employee Name is "+name+" employee Id is "+empid);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
