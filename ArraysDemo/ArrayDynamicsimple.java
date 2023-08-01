package ArraysDemo;

import java.util.Scanner;

public class ArrayDynamicsimple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n;
		int a[]=new int[100];
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("How many elements do you want to store");
		n=sc.nextInt();
		
		// data stored to array a[]
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}

		System.out.println("Print Array");
		for(int i=0;i<n;i++)
		{
			System.out.println(a[i]);
		}
		
		
	}

}
