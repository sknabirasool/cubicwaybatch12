package InheritanceDemo;

interface Parent1  // class to class extends
{
	void method1(); //class to interface implements
	
}
interface Parent2
{
	void method2();
}

class ParentClass1 implements Parent1
{
	public void method1()
	{
		System.out.println("Method 1 of Parent Class 1");
	}
}

class ParentClass2 implements Parent2
{
	public void method2()
	{
		System.out.println("Method 2 of Parentclass 2");
	}
}


class ChildClass extends ParentClass1 implements Parent2
{
	public void method2()
	{
		System.out.println("Method 2 of child class");
	}
}



public class HybDemo {
	

	public static void main(String[] args) {
		
		ChildClass c=new ChildClass();
		c.method1();
	    c.method2();
	}

}
