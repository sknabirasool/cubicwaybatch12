package InputOutputDemo;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class FileOutPutStreamDemo {

	public static void main(String[] args) {
		
		
		try {
			FileOutputStream fout=new FileOutputStream("output.txt");
			
			String s="Java FileOutputStream is an output stream used for writing data to a file.\r\n"
					+ ""; //string type of data
			
			byte b[]=s.getBytes();  //string conver to array of bytes
			
			fout.write(b);
			fout.close();
			System.out.println("I have written Succesfully");
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.print(e);
		}

	}

}
