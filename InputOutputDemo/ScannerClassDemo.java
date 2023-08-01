package InputOutputDemo;

import java.util.Scanner;

public class ScannerClassDemo {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Student name");
		String name=sc.nextLine();
		System.out.println("Student Roll Number");
		int roll=sc.nextInt();
		System.out.println("Student Marks");
		int Marks=sc.nextInt();
		
		System.out.println("Student Details");
		System.out.println("Student Name"+name+"Student Roll No is"+roll+"Student marks are"+Marks);
		
	}
}
