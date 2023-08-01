package InputOutputDemo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class DataStreamDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			FileInputStream fin=new FileInputStream("E:\\Training\\CubeWay\\javaprogramming\\FileOut.txt");
			
			int i=0;
			while((i=fin.read())!=-1)
			{
				System.out.print((char)i);
			}
			fin.close();
			
		} 
		catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
	}

}
