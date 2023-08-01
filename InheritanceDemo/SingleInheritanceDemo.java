package InheritanceDemo;

class FatherAndMother
{
	
	String fname="Ramesh";
	String mname="Laxmi";
	
	int fage=25;
	int mage=20;
	
	int fheight=5;
	int mheight=5;
	
	public void work()
	{
		System.out.println("My Father is Working some x comapany");
	}
	public void houseWife()
	{
		System.out.println("My Mother is house wife");
	}
		
}

class Son extends FatherAndMother
{
	String sname="Rahul";
	int sage=10;
	int sheight=3;
	
	public void play()
	{
		System.out.println(" son is playing");
	}
}

public class SingleInheritanceDemo {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Son obj=new Son();
		
		System.out.println("My Father name is"+obj.fname);
		System.out.println("My Mother name is"+obj.mname);
		System.out.println("My  name is"+obj.sname);
		System.out.println("My  name is"+obj.sage);
		
		obj.work();
		obj.houseWife();
		obj.play();

	}

}
