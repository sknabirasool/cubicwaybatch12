package ArraysDemo;

public class StudentRecord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name[]= {"Mahesh","Bindu","Kiran","Nabi"};
		int marks[]= {500,400,550,300};
		char grade[]= {'A','B','A','C'};
		
		for(int i=0;i<name.length;i++)
		{
			System.out.println("Student Name is "+name[i]+" scored Marks "+marks[i]+" Grade is "+grade[i]);
		}
		

	}

}
