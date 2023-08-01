package ArraysDemo;

import java.util.Scanner;

public class Dynamic2DArray {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		int sum=0;
		System.out.println("How many  rows do you want");
		int row=sc.nextInt();
		System.out.println("How many  cols do you want");
		int col=sc.nextInt();
		
		int arr[][]=new int[row][col];
		
		System.out.println("Enter "+(row*col)+"  Elements");
		
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				
				arr[i][j]=sc.nextInt();
			}
		
		}
		
		System.out.println("Print Array");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				
				System.out.print(arr[i][j]+" ");
				sum=sum+arr[i][j];
			}
			System.out.println("    ");
			System.out.println(sum);
		
		}
		
	}

}
