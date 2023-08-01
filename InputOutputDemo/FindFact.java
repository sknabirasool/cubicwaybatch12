package InputOutputDemo;

import java.util.Scanner;

public class FindFact {
	
	public int CalFact(int n)//120
	{
		//code  5*4*3*2*1
		int fact=1;
		
		for(int i=1;i<=n;i++)
		{
			fact=fact*i; //fact=1=1*1=1 =>1*2=>fact=2=>2*3=>6*4=>24=>24*5=>120
		}
		return fact;
		
	}

	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter The Factorial Number");
		int n=sc.nextInt();
		
		FindFact obj=new FindFact();
		
		int res=obj.CalFact(n);//5
		System.out.println("Factorial Number is "+res);
		
		
		
	}
}
