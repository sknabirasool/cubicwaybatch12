package ExceptionDemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileNotFoundExceptionDemo {

	public static void main(String[] args) throws FileNotFoundException,IOException {
		
		try {
		File f=new File("E://Training//CubeWay//javaprogramming//FileOut.txt");
		FileInputStream fis=new FileInputStream(f);
		
		int i=0;
		while((i=fis.read())!=-1)
		{
			System.out.print((char)i);
			
		}
		
		}catch(FileNotFoundException e)
		{
			System.out.println(e.getMessage());
		}

	}

}
