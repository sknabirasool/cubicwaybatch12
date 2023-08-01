package Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Exception2 {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		
		try {
		File f=new File("F://Data//demo.txt");
		
		FileInputStream fis=new FileInputStream(f);
		
		System.out.print(fis);		
		}catch(FileNotFoundException e)
		{
			System.out.println(e.getMessage());
		}

	}

}
