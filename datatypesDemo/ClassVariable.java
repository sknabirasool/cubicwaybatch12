package datatypesDemo;

public class ClassVariable {
	
	//class variable or instance variables  
	 int roll=121;
	 String name="Nabi";
	 int  marks=200;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ClassVariable obj=new ClassVariable();
		
		System.out.println(new ClassVariable().name);
		
		System.out.println("Student name is "+obj.name+ " Roll No is "+obj.roll+" Marks are "+obj.marks);
	
	}
	
	
	

}
