package ArraysDemo;

public class SimpleArray {

	public void runpackage()
	{
		System.out.println("My packeage is running");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age[]= {23,46,67,84,23,90}; //5
		
		int sum=0;
		
		for(int i=0;i<age.length;i++)
		{
			System.out.println(age[i]);//age[0]=23//age[1]=46
			sum=sum+age[i];
			
		}
		System.out.println(sum);//age[0]=2
	   
		
	}

}
