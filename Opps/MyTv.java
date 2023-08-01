package Opps;

public class MyTv {
	
	//properties
	int height=12;
	int width=32;
	String name="OnePlus";
	int price=23000;
	//functions
	
	public static void switchOn()
	{
		System.out.println("power is on");
	}
	public void switchOff()
	{
		System.out.println("power is off");
	}
	public void volueInc()
	{
		System.out.println("volume is incresed");
	}
	public void volueDec()
	{
		System.out.println("volume is decresed");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyTv remote=new MyTv();	
		
		System.out.println("My Tv Name is "+remote.name);
		remote.volueDec();
		remote.volueInc();
		switchOn();
		

	}

}
