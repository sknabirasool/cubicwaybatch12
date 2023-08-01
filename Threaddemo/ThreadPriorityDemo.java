package Threaddemo;

public class ThreadPriorityDemo extends Thread{
	
	public void run()
	{
		System.out.println("Thread Priority is"+Thread.currentThread());
	}

	public static void main(String[] args) {
		
		ThreadPriorityDemo p1=new ThreadPriorityDemo();
		
		ThreadPriorityDemo  p2=new ThreadPriorityDemo();
		
		p2.setPriority(Thread.MIN_PRIORITY);
		p1.setPriority(Thread.MAX_PRIORITY);
		
		p1.start();
		p2.start();
		
		
		
		

	}

}
