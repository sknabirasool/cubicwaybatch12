package Opps;

public class Rectangle {
	
	int l,w,v;
	
	static
	{
		System.out.println("Static Block");
	}
	
	Rectangle()
	{
		l=5;
		w=4;
	}
	
	Rectangle(int x,int y)
	{
		l=x;
		w=y;
	}
	Rectangle(int x,int y,int z)
	{
		l=x;
		w=y;
		v=z;
	}
	
	int area1()
	{
		return l*w;
	}
	
	
	int area()
	{
		return l*w*v;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Rectangle obj=new Rectangle();//JVM
		Rectangle obj1=new Rectangle(12,12);
		Rectangle obj3=new Rectangle(12,12,12);
		
	   System.out.println(obj.area1());
	   System.out.println(obj1.area1());
	   System.out.println(obj3.area());
	}

}
