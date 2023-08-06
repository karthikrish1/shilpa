package multithreading;

public class th1  extends Thread{

	//thread: process
	
	// Thread class
	//Runnable interface 
	public static void main(String[] args) {
		
		
		// single task is performed by multiple threads
		th1 ob= new th1();
		ob.start();
		
		th1 ob1= new th1();
		ob1.start();
	}
	
	public void run()
	{
		System.out.println("Task 1 started ");
	}
}
