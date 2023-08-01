package InheritanceDemo;

	class A
	{
		String aname="Rahul";
		public void A()
		{
			System.out.println("Method A");
		}
	}
	class B extends A
	{
		String bname="Mahesh";
		public void B()
		{
			System.out.println("Method B");
		}
	}
	class C extends B
	{
		String cname="Radha";
		public void C()
		{
			System.out.println("Method C");
		}
		
	}

public class MultileveInheritanceDemo {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		C obj=new C();
		obj.A();
		obj.B();
		obj.C();
		System.out.println("A class Person name is "+obj.aname+" B class Person name is "+obj.bname+" C class Person name is"+obj.cname);
		

	}

}
