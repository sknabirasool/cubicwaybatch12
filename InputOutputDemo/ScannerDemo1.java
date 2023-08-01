package InputOutputDemo;

import java.util.Scanner;

public class ScannerDemo1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the String data");

		String name = sc.nextLine();

		System.out.println("Enter the interger data");

		int number = sc.nextInt();

		
		System.out.println("Enter the float data data");

		float bal = sc.nextFloat();
		
		System.out.println("Enter the boolean  data(true/false)data");

		boolean booldata = sc.nextBoolean();

		
		System.out.println("IntegerData "+number+"float "+bal+"boolean "+booldata+"String data "+name);
	} 

}
