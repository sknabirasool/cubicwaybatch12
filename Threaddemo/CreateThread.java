package Threaddemo;

public class CreateThread extends Thread{
	
	public void run()
	{
		System.out.println("Thread Is Running by JVM");
	}
	
	public static void main(String[] args) {
		
		CreateThread thread=new CreateThread();
		thread.start();

	}

}
