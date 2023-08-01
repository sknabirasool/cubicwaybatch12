package InheritanceDemo;

interface Parent11
{
	void method();
}
interface Parent12
{
	void method2();
}

class Son1 implements Parent11,Parent12
{
	public void method()
	{
		System.out.println("Method");
	}
	public void method2()
	{
		System.out.println("Method2");
	}
}
public class MultipleInheritanceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Son1 s=new Son1();
		s.method();
		s.method2();

	}

}
