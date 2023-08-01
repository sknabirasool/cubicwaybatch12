package Threaddemo;

public class RunnableThreadDemo implements Runnable{
	
	public void run()
	{
		System.out.println("Thread Is Running");
	}

	public static void main(String[] args) {
		
		Thread t1=new Thread(new RunnableThreadDemo());
		
		Runnable t2=new RunnableThreadDemo();
		
		t1.start();
		t2.run();
		
	}

}
